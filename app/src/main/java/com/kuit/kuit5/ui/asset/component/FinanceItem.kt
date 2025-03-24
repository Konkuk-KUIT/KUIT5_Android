package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData

@Composable
fun FinanceItem(
    modifier: Modifier = Modifier,
    title: String,
    value: String,
    icon: Int
) {
    Column (){
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                modifier = modifier,
                text = title,
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                modifier = modifier
                    .size(14.dp),
                painter = painterResource(id = R.drawable.ic_assets_plus),
                contentDescription = "plus",
                tint = Color.Unspecified
            )
        }
        Spacer(modifier=modifier.size(30.dp))
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
                    painter = painterResource(id = icon),
                    contentDescription = "asset icon",
                    tint = Color.Unspecified
                )
                Text(
                    modifier = modifier.padding(10.dp),
                    text = value,
                    color = Color(0xFF666668),
                    fontSize = 14.sp,
                )
            }
            Column(){
                Text(
                    text = "확인하기",
                    color = Color(0xFF9FA5B0),
                    fontSize = 14.sp,
                    textDecoration = TextDecoration.Underline
                )
            }

        }
    }
}