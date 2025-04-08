package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.screen.components.ProductInfoDetail
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount: () -> Unit
) {
    Column(modifier = modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)
    , verticalArrangement = Arrangement.spacedBy(30.dp)) {
        Image(painter = painterResource(R.drawable.img_kb_label), contentDescription = "kb label")
        Text("${viewModel.newAccount.value}")
        ProductInfoDetail(title = "가입 연령", value = "19~34세")
        ProductInfoDetail(title = "소득 기준", value = "연 6,000 만원 이하")
        ProductInfoDetail(title = "월 납입 금액", value = "40만원 ~ 최대 70만원")
        ProductInfoDetail(title = "정부 지원금", value = "납입액의 3~6%")
        Button(onClick = {
            onNavigateToCreateAccount()
        }) {
            Text("ProductInfoScreen")
        }
    }
}