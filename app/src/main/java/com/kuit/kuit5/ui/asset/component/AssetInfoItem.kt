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
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun AssetInfoItem(
    modifier: Modifier = Modifier,
    asset:AssetData
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
                painter = painterResource(id = asset.icon),
                contentDescription = "asset icon",
                tint = Color.Unspecified
            )
            Spacer(modifier.size(10.dp))
            Text(
                text = asset.name,
                style = typography.body_01_R_14,
                color = colors.gray500
            )
        }
        Text(
            text=asset.value,
            style = typography.body_01_M_14
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AssetInfoItemPreview() {
    val asset = AssetData(
        icon = R.drawable.img_kakao_icon,
        name = "입출금통장",
        value = "1,000,000원"
    )
    AssetInfoItem(
        asset = asset
    )
}