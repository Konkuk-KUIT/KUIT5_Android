package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.HomeContentData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeSecondContentItem(
    content: HomeContentData,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                modifier = Modifier
                    .size(30.dp),
                painter = painterResource(id = content.icon),
                contentDescription = "asset icon",
                tint = Color.Unspecified
            )
            Column(
                modifier = Modifier.padding(start = 10.dp)
            ){
                Text(
                    text = content.value.toDecimalFormat()+"원",
                    color = colors.gray400,
                    style = typography.body_01_M_14
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = content.title,
                    color = colors.black,
                    style = typography.body_01_M_14
                )
            }
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_assets_right_arrow),
            contentDescription = "right arrow",
        )
    }
}