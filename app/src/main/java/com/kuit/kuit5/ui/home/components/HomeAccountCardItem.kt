package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.components.BankSaladGrayButton
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeAccountCardItem(
    modifier: Modifier = Modifier,
    account: String,
    money: String,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(color = colors.white)
            .padding(20.dp, 24.dp)
    ) {
        Column(modifier = modifier.fillMaxWidth()) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = account,
                        style = typography.head_03_R_16,
                        color = colors.gray500,
                        modifier = modifier.padding(bottom = 10.dp)
                    )
                    Text(
                        text = money,
                        style = typography.head_02_B_20,
                        color = colors.black
                    )
                }
                BankSaladGrayButton(value = "송금")
            }
            Text(
                modifier = modifier
                    .align(Alignment.End)
                    .padding(bottom = 22.dp),
                text = "어제보다",
                style = typography.body_02_R_12,
                color = colors.gray400
            )
            HomeAccountCardDetail(
                money = "234,567원",
                account = "입출금통장",
                changedMoney = "3,300원",
                icon = R.drawable.img_kakao_icon
            )
            Spacer(modifier = modifier.size(24.dp))
            HomeAccountGoalCard(icon = R.drawable.img_home_pig, value = "목표를 설정하고 종잣돈을 모아보세요")
        }
    }

}

@Preview
@Composable
private fun HomeAccountCardItemPreview() {
    HomeAccountCardItem(
        account = "입출금 계좌",
        money = "234,567원",
    )
}