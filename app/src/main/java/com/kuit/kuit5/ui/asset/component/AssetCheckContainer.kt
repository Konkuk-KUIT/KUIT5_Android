package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun AssetCheckContainer(
    modifier: Modifier = Modifier,
    asset: AssetData
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Spacer(modifier = modifier.size(24.dp))
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = asset.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_assets_plus),
                contentDescription = "plus",
                tint = Color(0xFF9FA5B0)
            )
        }
        Spacer(modifier = modifier.size(30.dp))
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Icon(
                    modifier = modifier.size(30.dp),
                    painter = painterResource(id = asset.icon),
                    contentDescription = "assets check image",
                    tint = Color.Unspecified
                )
                Text(
                    text = asset.value,
                    fontSize = 14.sp
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "확인하기",
                    fontSize = 14.sp,
                    color = Color(0xFF9FA5B0)
                )
                HorizontalDivider(
                    modifier = modifier
                        .padding(top = 4.dp)
                        .width(50.dp),
                    color = Color(0xFF9FA5B0)
                )
            }
        }
        Spacer(modifier = modifier.size(22.dp))

    }
}

@Preview(showBackground = true)
@Composable
private fun AssetCheckContainerPreview() {
    val asset = AssetData(
        icon = R.drawable.img_assets_card,
        name = "카드",
        value = "내가 맞는 추천카드는?"
    )
    AssetCheckContainer(asset = asset)
}