package com.kuit.kuit5.ui.shopping.screen.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.screen.component.ConfirmButton
import com.kuit.kuit5.ui.shopping.screen.component.ProductDetailSection
import com.kuit.kuit5.ui.shopping.screen.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount: () -> Unit
) {
    Scaffold(
        containerColor = Color.White,
        bottomBar = {
            ConfirmButton(
                text = "가입하기",
                onClick = {
                    viewModel.addAccount()
                    onNavigateToCreateAccount()  // 해당 페이지로 네비게이션
                }
            )
        }
    ) { innerPadding ->
        Card(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = colors.white)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 20.dp, end = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .height(145.dp),
                painter = painterResource(R.drawable.img_kb_label),
                contentDescription = "KB로고",
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(start = 20.dp, end = 20.dp)
            ) {
                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "KB 청년도약계좌",
                    style = BankSaladTheme.typography.head_02_B_20,
                    color = colors.black
                )

                Spacer(modifier = Modifier.height(30.dp))

                viewModel.productDetails.forEach { (label, value) ->
                    ProductDetailSection(label = label, value = value)
                    Spacer(modifier = Modifier.height(30.dp))
                }

                Spacer(modifier = Modifier.height(137.dp))


                Text(
                    text = "${viewModel.newAccount.value}",
                    color = Color.Transparent
                )


            }

        }
    }
}
@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
    )
@Composable

private fun ProductInfoPreview() {
    val viewModel =
        viewModel<ShoppingViewModel>()
    ProductInfoScreen(viewModel = viewModel){}
}