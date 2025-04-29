package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.ui.shopping.components.ShoppingGrayButton
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
     onNavigateToProductInfo: () -> Unit
) {

    Column(modifier = modifier.fillMaxSize().background(colors.white)) {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color = colors.gray100)

        ) {
            Column(
                modifier = Modifier.padding(
                    top = 27.dp,
                    bottom = 20.dp,
                    start = 20.dp,
                    end = 20.dp
                )
            ) {
                Image(
                    painter = painterResource(viewModel.kbShoppingProduct.icon),
                    contentDescription = "KB img",
                    modifier = Modifier.size(280.dp, 145.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Text(text = viewModel.kbShoppingProduct.name, style = typography.head_02_B_20)
                Spacer(modifier = Modifier.size(20.dp))
                ShoppingGrayButton(
                    modifier = Modifier,
                    "정보조회",
                    onClick = { onNavigateToProductInfo() }
                )
                Spacer(modifier = Modifier.size(20.dp))
            }


        }
    }

    //        Button(
//            onClick = { onNavigateToProductInfo() }
//        ) {
//            Text(text = "Shopping Screen")
//        }
}

@Preview(showBackground = true)
@Composable
private fun ShoppingScreenPreview() {
    ShoppingScreen(
        viewModel = viewModel()
    ) { }
}