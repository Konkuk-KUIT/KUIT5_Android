package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData

@Composable
fun AssetInfoItem(
    modifier: Modifier = Modifier,
    asset: AssetData,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = modifier
                        .size(30.dp),
                    painter = painterResource(id = asset.icon),
                    contentDescription = "asset icon",
                    tint = Color.Unspecified
                )
                Text(
                    modifier = modifier
                        .padding(start = 10.dp),
                    text = asset.name,
                    fontSize = 14.sp,
                    color = Color(0xFF666668)
                )
            }
            Text(
                text = asset.value,
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AssetInfoItemPreview() {
    val asset = AssetData(
        icon = R.drawable.img_assets_kakaobank,
        name = "입출금통장",
        value = "1,000,000원"
    )
    AssetInfoItem(
        asset = asset
    )
}