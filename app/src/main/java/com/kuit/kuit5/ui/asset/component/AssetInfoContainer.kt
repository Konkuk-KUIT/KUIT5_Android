package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData

@Composable
fun AssetInfoContainer(
    modifier: Modifier = Modifier,
    title: String,
    balance: String,
    assetList: List<AssetData>
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Text(
                text = title,
                color = Color(0xFF666668),
                fontSize = 12.sp
            )
            Text(
                text = balance,
                color = Color(0xFF666668),
                fontSize = 12.sp
            )
        }
        HorizontalDivider(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            color = Color(0xFFD9D9D9)
        )
        Column(
            modifier = modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            assetList.forEach { asset ->
                AssetInfoItem(asset = asset)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AssetInfoContainerPreview() {
    val assetList = listOf(
        AssetData(
            icon = R.drawable.img_kakao_icon,
            name = "입출금통장",
            value = "1,000,000원"
        ),
        AssetData(
            icon = R.drawable.img_kakao_icon,
            name = "입출금통장",
            value = "1,000,000원"
        ),
        AssetData(
            icon = R.drawable.img_kakao_icon,
            name = "입출금통장",
            value = "1,000,000원"
        )
    )

    AssetInfoContainer(
        title = "입출금",
        balance = "1,000,000원",
        assetList = assetList
    )
}