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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData

@Composable
fun AssetConfirmItem(
    modifier: Modifier = Modifier,
    confirm:AssetData
) {
    Row(
        modifier=modifier
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
                painter = painterResource(id = confirm.icon),
                contentDescription = "asset icon",
                tint = Color.Unspecified
            )
            Spacer(modifier.size(10.dp))
            Text(
                text = confirm.name,
                fontSize = 14.sp
            )
        }
        Column(){
            Text(
                text=confirm.value,
                color=Color(0xFF9FA580),
                fontSize = 14.sp
            )
            HorizontalDivider(
                modifier=modifier
                    .width(50.dp),
                color= Color(0xFFD9D9D9)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun AssetConfirmItemPreview() {
    val confirm = AssetData(
        icon = R.drawable.img_card_icon,
        name = "내게 맞는 추천 카드는?",
        value = "확인하기"
    )
    AssetConfirmItem(
        confirm = confirm
    )
}