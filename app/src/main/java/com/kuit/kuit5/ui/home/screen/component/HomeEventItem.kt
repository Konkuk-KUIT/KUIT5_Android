package com.kuit.kuit5.ui.home.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme

@Composable
fun HomeEventItem(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        // 아이콘 Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 36.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(modifier = Modifier.size(36.dp), painter = painterResource(R.drawable.img_allow_icon), contentDescription = "")
            Image(modifier = Modifier.size(36.dp), painter = painterResource(R.drawable.img_heart_icon), contentDescription = "")
            Image(modifier = Modifier.size(36.dp), painter = painterResource(R.drawable.img_moneybag_icon), contentDescription = "")
            Image(modifier = Modifier.size(36.dp), painter = painterResource(R.drawable.img_cardevent_icon), contentDescription = "")
        }

        Spacer(modifier = Modifier.height(8.dp))

        // 텍스트 Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 29.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("용돈벌기", style = BankSaladTheme.typography.body_01_M_14, color = BankSaladTheme.colors.gray500)
            Text("보험리모델링", style = BankSaladTheme.typography.body_01_M_14, color = BankSaladTheme.colors.gray500)
            Text("대출찾기", style = BankSaladTheme.typography.body_01_M_14, color = BankSaladTheme.colors.gray500)
            Text(
                text = "카드이벤트",
                modifier = Modifier.offset(x = 6.dp),
                style = BankSaladTheme.typography.body_01_M_14,
                color = BankSaladTheme.colors.gray500
            )
        }
    }
}

@Preview
@Composable
private fun PreviewHomeEventItem() {
    HomeEventItem()
}