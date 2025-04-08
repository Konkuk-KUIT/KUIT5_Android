package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount: () -> Unit
) {
    val product = viewModel.selectedProduct.value ?: return

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        Column(
            modifier = Modifier
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = product.icon),
                    contentDescription = "product.icon",
                    modifier = Modifier
                        .size(width = 320.dp, height = 145.dp)
                        .align(Alignment.Center),
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Column(
                modifier = Modifier
                    .padding(start = 20.dp)
            ) {
                Text(
                    text = "상품명",
                    color = colors.black,
                    style = typography.head_03_R_16
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    product.title,
                    color = colors.black,
                    style = typography.head_02_B_20
                )
                Spacer(modifier = Modifier.size(30.dp))
                Text(
                    text = "가입 연령",
                    color = colors.black,
                    style = typography.head_03_R_16
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    product.age,
                    color = colors.black,
                    style = typography.head_02_B_20
                )
                Spacer(modifier = Modifier.size(30.dp))
                Text(
                    text = "소득 기준",
                    color = colors.black,
                    style = typography.head_03_R_16
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    product.income,
                    color = colors.black,
                    style = typography.head_02_B_20
                )
                Spacer(modifier = Modifier.size(30.dp))
                Text(
                    text = "월 납입 금액",
                    color = colors.black,
                    style = typography.head_03_R_16
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    product.month,
                    color = colors.black,
                    style = typography.head_02_B_20
                )
                Spacer(modifier = Modifier.size(30.dp))
                Text(
                    text = "정부 지원금",
                    color = colors.black,
                    style = typography.head_03_R_16
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    product.government,
                    color = colors.black,
                    style = typography.head_02_B_20
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(20.dp)
        ) {
            Button(
                modifier = Modifier
                    .size(320.dp, 40.dp)
                    .align(Alignment.Center),
                contentPadding = PaddingValues(0.dp),
                shape = RoundedCornerShape(12.dp),
                onClick = {
                    viewModel.selectProduct(product)
                    onNavigateToCreateAccount()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colors.gray300,
                    contentColor = colors.black
                )
            ) {
                Text(
                    text = "가입하기",
                    style = typography.body_02_R_12
                )
            }
        }
    }
//        Text(text = "${viewModel.newAccount.value}")
}
