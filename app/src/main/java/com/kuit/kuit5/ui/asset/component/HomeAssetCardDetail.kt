package com.kuit.kuit5.ui.asset.component

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
import com.kuit.kuit5.model.NetAssetData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeAssetCardDetail(
    modifier: Modifier = Modifier,
    net_asset: NetAssetData
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
                painter = painterResource(id = net_asset.icon),
                contentDescription = "asset icon",
                tint = Color.Unspecified
            )
            Spacer(modifier = modifier.size(10.dp))
            Column {
                Text(
                    text = net_asset.title,
                    style = typography.body_01_M_14,
                    color = colors.gray400
                )
                Spacer(modifier = modifier.size(8.dp))
                Text(
                    text = net_asset.money,
                    style = typography.body_01_M_14,
                    color = colors.black
                )
                Spacer(modifier = modifier.size(8.dp))
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) { // 오른쪽 그룹
            if(!net_asset.dropMoney.isBlank()) {
                Icon(
                    modifier = modifier
                        .width(10.dp)
                        .height(6.dp),
                    painter = painterResource(id = R.drawable.img_triangle),
                    contentDescription = "triangle icon",
                    tint = Color.Unspecified
                )
            }
            Spacer(modifier=modifier.size(4.dp))
            Text(
                text = net_asset.dropMoney,
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
private fun HomeAssetCardDetailPreview() {
    val net_asset = NetAssetData(
        icon = R.drawable.img_kakao_icon,
        title = "계좌 · 현금",
        money = 234567.toDecimalFormat() + "원",
        dropMoney = 4500.toDecimalFormat()+"원"
    )
    HomeAssetCardDetail(net_asset=net_asset)
}