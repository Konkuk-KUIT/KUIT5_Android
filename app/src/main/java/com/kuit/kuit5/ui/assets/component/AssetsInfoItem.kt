package com.kuit.kuit5.ui.assets.component

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetsData

@Composable
fun AssetsInfoItem(modifier: Modifier = Modifier, assets: AssetsData) {
    Row(
        modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                modifier = modifier.size(30.dp),
                painter = painterResource(assets.icon),
                contentDescription = "icon",
                tint = Color.Unspecified
            )
            Text(assets.name)
        }
        Text(assets.value)
    }
}

@Preview(showBackground = true)
@Composable
private fun AssetsInfoItemPreview() {
    val asset = AssetsData(icon = R.drawable.img_kakao_icon, name = "입출금통장", value = "1,000,000원")
    AssetsInfoItem(assets = asset)
}