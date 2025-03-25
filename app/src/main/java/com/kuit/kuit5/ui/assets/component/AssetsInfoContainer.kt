package com.kuit.kuit5.ui.assets.component

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
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetsData

@Composable
fun AssetsInfoContainer(
    modifier: Modifier = Modifier,
    assetsList: List<AssetsData>,
    title: String,
) {
    Column(modifier.fillMaxWidth()) {
        Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(title)
            Text("234,567원")
        }
        HorizontalDivider(
            modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            color = Color(0xffD9D9D9)
        )
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            assetsList.forEach { assets ->
                AssetsInfoItem(assets = assets)
            }
        }
    }
}

@Composable
private fun AssetsInfoContainerPreview() {
    val assetsList = listOf(
        AssetsData(
            icon = R.drawable.img_kakao_icon,
            name = "입출금통장",
            value = "1,000,000원"
        ),
        AssetsData(
            icon = R.drawable.img_kakao_icon,
            name = "입출금통장",
            value = "1,000,000원"
        ),
        AssetsData(
            icon = R.drawable.img_kakao_icon,
            name = "입출금통장",
            value = "1,000,000원"
        ),

        )

    AssetsInfoContainer(assetsList = assetsList, title = "입출금")
}