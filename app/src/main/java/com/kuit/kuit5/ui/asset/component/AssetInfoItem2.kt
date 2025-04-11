package com.kuit.kuit5.ui.asset.component
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit5.model.AssetData
import androidx.compose.material3.Icon

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R

@Composable
fun AssetInfoItem2(modifier: Modifier = Modifier,
                  asset : AssetData

) {
    Row(
        modifier=Modifier
            .fillMaxWidth(),
        verticalAlignment= Alignment.CenterVertically,
        horizontalArrangement= Arrangement.SpaceBetween
    ){
        Row(verticalAlignment=Alignment.CenterVertically){
            Icon(
                modifier= Modifier
                    .size(30.dp),
                painter= painterResource(id= asset.icon),
                contentDescription="asset icon",
                tint = Color.Unspecified
            )
            Text(text= asset.name)
        }
        Text(text=asset.value)
    }
}

@Preview(showBackground = true)
@Composable
private fun AsseInfoItemPreview() {
    val asset =AssetData(
        icon= R.drawable.kakao_bank,
        name= "입출금 통장",
        value = "1,000,000원" ,

    )
    AssetInfoItem2(
        asset= asset
    )
}