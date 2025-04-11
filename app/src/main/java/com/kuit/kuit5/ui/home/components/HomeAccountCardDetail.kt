package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeAccountCardDetail(
    modifier: Modifier = Modifier,
    icon: Int,
    money: String,
    account: String,
    changedMoney: String
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(color = colors.white),
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(icon), contentDescription = "AccountCard img",
                    modifier = modifier.size(30.dp),
                    tint = Color.Unspecified
                )
                Column(
                    modifier = modifier.padding(start = 10.dp)
                ) {
                    Text(
                        text = money,
                        style = typography.body_01_M_14,
                        color = colors.black,
                        modifier = modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = account,
                        style = typography.body_02_R_12,
                        color = colors.gray400
                    )
                }
            }
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_home_down_arrow),
                    contentDescription = "downArrow icon",
                    tint = colors.blue
                )
                Text(
                    text = changedMoney,
                    style = typography.body_01_M_14,
                    color = colors.blue,
                    modifier = modifier.padding(start = 4.dp, end = 2.dp)
                )
                Icon(
                    painter = painterResource(R.drawable.ic_assets_right_arrow),
                    contentDescription = "RightArrow icon",
                    tint = colors.gray500
                )
            }

        }


    }

}

@Preview
@Composable
private fun HomeAccountCardDetailPreview() {
    HomeAccountCardDetail(
        money = "234,567원",
        account = "계좌 · 현금",
        changedMoney = "3,300원",
        icon = R.drawable.img_kakao_icon
    )
}