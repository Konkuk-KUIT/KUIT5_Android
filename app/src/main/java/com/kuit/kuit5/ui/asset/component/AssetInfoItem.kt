package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
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
fun AssetInfoItem(modifier: Modifier = Modifier,
                  asset: AssetData) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(painter = painterResource(id = asset.icon), contentDescription = "asset icon", modifier = modifier.size(30.dp), tint = Color.Unspecified)
            Spacer(modifier = modifier.size(10.dp))
            Text(text = asset.name, fontSize = 14.sp, color = Color(0xFF666668))
        }
        Text(text = asset.value, fontSize = 14.sp, color = Color.Black, fontWeight = FontWeight.Medium)
    }
}

@Preview
@Composable
private fun AssetInfoItemPreview() {
    val asset = AssetData(
        icon = R.drawable.img_kakao_icon,
        name = "입출금통장",
        value = "234,567원"
    )
    AssetInfoItem(asset = asset)
}