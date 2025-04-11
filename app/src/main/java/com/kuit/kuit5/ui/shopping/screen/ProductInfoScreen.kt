package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.R
import com.kuit.kuit5.ShoppingScreen
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount:()->Unit
) {
    Column(modifier=modifier
        .fillMaxHeight()
        .padding(20.dp),
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(id = R.drawable.img_kb_label1),
            contentDescription = "img_kb_label"
        )
        Spacer(modifier=modifier.size(30.dp))
        Text(
            text = "KB 청년도약계좌",
            style = typography.head_02_B_20,
            color = colors.black
        )
        Spacer(modifier=modifier.size(30.dp))
        Text(
            text= "가입 연령",
            style = typography.head_03_R_16,
            color = colors.black
        )
        Spacer(modifier=modifier.size(10.dp))
        Text(
            text = "19~34세",
            style = typography.head_02_B_20,
            color = colors.black
        )
        Spacer(modifier=modifier.size(30.dp))
        Text(
            text = "소득 기준",
            style = typography.head_03_R_16,
            color = colors.black
        )
        Spacer(modifier=modifier.size(10.dp))
        Text(
            text = "연 ${6000.toDecimalFormat()} 만 원 이하",
            style = typography.head_02_B_20,
            color = colors.black
        )
        Spacer(modifier=modifier.size(30.dp))
        Text(
            text = "월 납입 금액",
            style = typography.head_03_R_16,
            color = colors.black
        )
        Spacer(modifier=modifier.size(10.dp))
        Text(
            text = "40만원 ~ 최대 70만원",
            style = typography.head_02_B_20,
            color = colors.black
        )
        Spacer(modifier=modifier.size(30.dp))
        Text(
            text = "정부 지원금",
            style = typography.head_03_R_16,
            color = colors.black
        )
        Spacer(modifier=modifier.size(10.dp))
        Text(
            text = "납입액의 3~6%",
            style = typography.head_02_B_20,
            color = colors.black
        )
        Column(
            modifier=modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(
                modifier = modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colors.gray300,
                    contentColor = colors.black
                ),
                shape = RoundedCornerShape(12.dp),
                onClick = {
                    onNavigateToCreateAccount()
                }
            ) {
                Text(
                    text = "가입하기",
                    style = typography.body_02_R_12,
                    color = colors.black
                )
            }
        }
        //Text(text = "${viewModel.newAccount.value}")
    }
}

@Preview
@Composable
private fun ProductInfoScreenPreview() {
    ProductInfoScreen (viewModel = viewModel()) {}
}