package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData2
import kotlin.contracts.contract
import androidx.compose.ui.unit.sp

@Composable
fun AssetInfoItem2(
    modifier: Modifier = Modifier,
    asset: AssetData2
){
    HorizontalDivider(
        modifier = modifier
            .height(10.dp)
            .background(color = Color(0xFFF3F4F6))
    )
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    top = 24.dp,
                    bottom = 30.dp
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = asset.topic,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_assets_plus),
                contentDescription = "plus",
                tint = Color(0xFF9FA5B0)
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = modifier
                        .size(30.dp),
                    painter = painterResource(id = asset.icon2),
                    contentDescription = "asset icon 2",
                    tint = Color.Unspecified
                )
                Text(
                    modifier = modifier
                        .padding(start = 10.dp),
                    text = asset.name2,
                    fontSize = 14.sp,
                    color = Color(0xFF666668)
                )
            }
            Column(

            ){
                Text(
                    text = "확인하기",
                    fontSize = 14.sp,
                    color = Color(0xFF9FA5B0)
                )
                HorizontalDivider(modifier = modifier
                    .height(1.dp)
                    .width(50.dp)
                    .background(color = Color(0xFF9FA5B0))
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AssetInfoItem2Preview() {
    val asset = AssetData2(
        icon2 = R.drawable.img_assets_kakaobank,
        name2 = "입출금통장",
        topic = "카드"
    )
    AssetInfoItem2(
        asset = asset
    )
}