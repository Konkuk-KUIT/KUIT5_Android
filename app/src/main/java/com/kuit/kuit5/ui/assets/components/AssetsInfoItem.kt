package com.kuit.kuit5.ui.assets.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.kuit.kuit5.model.AssetsData

@Composable
fun AssetsInfoItem(assets: AssetsData, modifier: Modifier = Modifier,) {
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
            Spacer(modifier.width(10.dp))
            Text(assets.name, color = Color(0xff666668), fontSize = 14.sp)
        }
        Text(assets.value, fontWeight = FontWeight.W500, fontSize = 14.sp)
    }
}

