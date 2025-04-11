package com.kuit.kuit5.ui.shopping.screen

import android.accounts.Account
import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.shopping_componet.KbIcon
import com.kuit.kuit5.ui.shopping_componet.productDescription
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.white)
    ) {
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {
            KbIcon(icon = R.drawable.img_kbbank, account = "KB 청년도약계좌", n = 320)
            Spacer(modifier = Modifier.height(30.dp))
            productDescription(home_title = "가입 연령", home_content = "19~34세")
            productDescription(home_title = "소득 기준", home_content = "연 6,000 만 원 이하")
            productDescription(home_title = "월 납입 금액", home_content = "40만원 ~ 최대 70만원")
            productDescription(home_title = "정부 지원금", home_content = "납입액의 3~6%")

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {
                    onNavigateToCreateAccount()
                },
                modifier = Modifier
                    .offset(x = 20.dp)
                    .padding(bottom = 16.dp)
                    .width(320.dp)
                    .height(40.dp),
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
            //Text(text = "${viewModel.newAccount.value}")

        }
    }
}