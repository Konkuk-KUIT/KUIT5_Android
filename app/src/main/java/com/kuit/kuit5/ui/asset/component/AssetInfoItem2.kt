package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.input.key.Key.Companion.D
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.model.AssetData2

@Composable
fun AssetInfoItem2(
    modifier: Modifier = Modifier,
    asset: AssetData2
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,

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
            Spacer(modifier = modifier.size(10.dp))
            Text(text = asset.name, fontSize = 14.sp, color = Color(0xFF666668))
        }

        Text("확인하기",color = Color(0xFF9FA5B0) )
    }


}

@Preview(showBackground = true)
@Composable
private fun AssetInfoItem2() {
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