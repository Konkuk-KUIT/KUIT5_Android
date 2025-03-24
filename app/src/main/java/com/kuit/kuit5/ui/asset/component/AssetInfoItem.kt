package com.kuit.kuit5.ui.asset.component
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit5.model.AssetData
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.sp


@Composable
fun AssetInfoItem(
    modifier: Modifier = Modifier,
    asset: AssetData
) {
   Row(
       modifier = modifier
           .fillMaxWidth(),
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.SpaceBetween
   ){
       Row(
           verticalAlignment = Alignment.CenterVertically
       ){
           Icon(
               modifier = modifier
                   .size(30.dp),
               painter = painterResource(id = asset.icon),
               contentDescription = "asset icon",
               tint = Color.Unspecified
           )
           Text(
               modifier = modifier.padding(10.dp),
               text = asset.name,
               color = Color(0xFF666668),
               fontSize = 14.sp,
           )
       }
       Text(
           text = asset.value,
           color = Color.Black,
           fontSize = 14.sp
       )
   }
}