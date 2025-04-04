package com.kuit.kuit5.ui.home.screen.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.ui.theme.BankSaladTheme


@Composable
fun HomeAssetsCardDetail(
    modifier: Modifier = Modifier,
    asset: AssetData
) {
    Row(
        modifier = modifier.fillMaxWidth()
        .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Row(

            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .size(30.dp),
                painter = painterResource(id = asset.icon),
                contentDescription = "asset icon",
                tint = Color.Unspecified
            )

            Spacer(modifier = Modifier.size(10.dp))

            Column {
                Text(
                    text = asset.name,
                    style = BankSaladTheme.typography.body_01_M_14,
                    color = BankSaladTheme.colors.gray400
                )
                Spacer(modifier = Modifier.size(8.dp))

                Text(
                    text = asset.value,
                    style = BankSaladTheme.typography.body_01_M_14,
                    color = BankSaladTheme.colors.black
                )
            }

        }
        if (asset.diffValue.isNotBlank()) {//값이 있을경우 down 아이콘 표시
            Row(
                verticalAlignment = Alignment.CenterVertically

            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_home_direction),
                    contentDescription = "down",
                    tint = Color.Blue,

                    )
                Spacer(modifier = Modifier.size(2.dp))
                Text(
                    text = asset.diffValue,
                    style = BankSaladTheme.typography.body_01_M_14,
                    color = BankSaladTheme.colors.blue
                )

                Spacer(modifier = Modifier.size(2.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                    contentDescription = "right arrow",
                    tint = BankSaladTheme.colors.gray500

                )
            }

        } else {// 없을경우 아이콘 사라지고 right arrow만 표시하도록 함
            Icon(
                painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                contentDescription = "right arrow",
                tint = BankSaladTheme.colors.gray500

            )
        }
    }

}


@Preview
@Composable
private fun HomeAssetsCardDetailPreview() {
    val asset = AssetData(
        icon = R.drawable.img_kakao_icon,
        name = "계좌 · 현금",
        value = "234,567원",
        diffValue = "4,500원"
    )
    HomeAssetsCardDetail(asset = asset)

}