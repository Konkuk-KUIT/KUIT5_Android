package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.model.AssetData2

@Composable
fun AssetInfoContainer(
    modifier: Modifier = Modifier,
    title: String,
    asset: AssetData
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                fontSize = 12.sp,
                color = Color(0xFF666668)
            )
            Text(
                text = asset.value,
                fontSize = 12.sp,
                color = Color(0xFF666668)
            )
        }
        HorizontalDivider(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            color = Color(0xFFD9D9D9)
        )
        Column(
            modifier = modifier
                .fillMaxWidth(),
        ) {
            AssetInfoItem(
                asset = AssetData(
                    icon = asset.icon,
                    name = asset.name,
                    value = asset.value
                )
            )

                /*assetList.forEach() { asset ->
                AssetInfoItem(asset = asset)
            } */
        }


    }
}

@Preview(showBackground = true)
@Composable
private fun AssetInfoContainerPreview() {
    /* val assetList = listOf(
        AssetData(
            icon = R.drawable.img_assets_kakaobank,
            name = "입출금통장",
            value = "1,000,000원"
        ),
        AssetData(
            icon = R.drawable.img_assets_kakaobank,
            name = "입출금통장",
            value = "1,000,000원"
        ),
        AssetData(
            icon = R.drawable.img_assets_kakaobank,
            name = "입출금통장",
            value = "1,000,000원"
        ) ) */
    val asset = AssetData(
        icon = R.drawable.img_assets_kakaobank,
        name = "입출금통장",
        value = "1,000,000원"
    )
    AssetInfoContainer(
        title = "입출금",
        asset = asset
    )
}