package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData2

@Composable
fun AssetComponent(
    modifier: Modifier = Modifier,
    title: String,
    assetList2: List<AssetData2>
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 16.dp)
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = title, fontSize = 16.sp, fontWeight = ExtraBold)
            Icon(
                painter = painterResource(id = R.drawable.ic_asset_plus),
                contentDescription = "plus icon",
                tint = Color(0xFF666668)
            )
        }
        Spacer(modifier = modifier.size(22.dp))
        assetList2.forEach { asset ->
            AssetInfoItem2(asset = asset)
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun AssetComponentPreview() {
    AssetComponent(
        title = "카드",
        assetList2 = listOf(
            AssetData2(
                icon = R.drawable.img_asset_card,
                name = "내가 맞는 추천카드는?"
            )
        )

    )

}