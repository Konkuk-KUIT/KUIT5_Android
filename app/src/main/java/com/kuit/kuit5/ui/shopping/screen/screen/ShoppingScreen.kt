package com.kuit.kuit5.ui.shopping.screen.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.screen.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors



@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel = ShoppingViewModel(),
    onNavigateToProductInfo: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White) // 배경 흰색
    ) {
        Card(
            modifier = Modifier.padding(20.dp),
            colors = CardDefaults.cardColors(containerColor = colors.gray100),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
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
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "KB 청년도약계좌",
                    style = BankSaladTheme.typography.head_02_B_20,
                    color = colors.black
                )

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = { onNavigateToProductInfo() },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = colors.gray300),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "정보조회",
                        style = BankSaladTheme.typography.body_02_R_12,
                        color = colors.black
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
fun PreviewShoppingScreen() {
    ShoppingScreen()
}