package com.kuit.kuit5.ui.asset.component

import android.accounts.Account
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.kuit.kuit5.model.AccountData
import com.kuit.kuit5.model.NetAssetData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeAccountCardDetail(
    modifier: Modifier = Modifier,
    account: AccountData
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth() // Row의 너비를 화면 전체로 설정
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) { // 왼쪽 그룹
            Icon(
                modifier = modifier.size(30.dp),
                painter = painterResource(id = account.icon),
                contentDescription = "asset icon",
                tint = Color.Unspecified
            )
            Spacer(modifier = modifier.size(10.dp))
            Column {
                Text(
                    text = account.money,
                    style = typography.body_01_M_14,
                    color = colors.black
                )
                Spacer(modifier = modifier.size(8.dp))
                Text(
                    text = account.title,
                    style = typography.body_02_R_12,
                    color = colors.gray400
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) { // 오른쪽 그룹
            Icon(
                modifier = modifier
                    .width(10.dp)
                    .height(6.dp),
                painter = painterResource(id = R.drawable.img_triangle),
                contentDescription = "triangle icon",
                tint = Color.Unspecified
            )
            Spacer(modifier = modifier.size(4.dp))
            Text(
                text = account.dropMoney,
                style = typography.body_01_M_14,
                color = colors.blue
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                contentDescription = "right arrow",
            )
        }
    }
}

@Preview
@Composable
private fun HomeAccountCardDetailPreview() {
    val account = AccountData(
        icon = R.drawable.img_kakao_icon,
        money = 234567.toDecimalFormat() + "원",
        title = "입출금통장",
        dropMoney = 3300.toDecimalFormat() + "원"
    )
    HomeAccountCardDetail(account = account)
}