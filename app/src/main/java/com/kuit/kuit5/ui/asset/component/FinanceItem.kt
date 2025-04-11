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
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun FinanceItem(
    title: String,
    value: String,
    icon: Int,
    modifier: Modifier = Modifier
) {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier,
                text = title,
                color = colors.black,
                style = typography.head_03_B_16
            )
            Icon(
                modifier = Modifier
                    .size(14.dp),
                painter = painterResource(id = R.drawable.ic_assets_plus),
                contentDescription = "plus",
                tint = Color.Unspecified
            )
        }
        Spacer(modifier = Modifier.size(30.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = icon),
                    contentDescription = "asset icon",
                    tint = Color.Unspecified
                )
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = value,
                    color = colors.gray500,
                    style = typography.head_03_R_14
                )
            }
            Column() {
                Text(
                    text = "확인하기",
                    color = colors.gray400,
                    style = typography.head_03_R_14,
                    textDecoration = TextDecoration.Underline
                )
            }

        }
    }
}