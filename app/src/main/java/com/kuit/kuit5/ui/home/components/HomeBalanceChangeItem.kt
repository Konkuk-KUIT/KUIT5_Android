package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeBalanceChangeItem(modifier: Modifier = Modifier, isChanged: Boolean) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        if (isChanged) {
            Icon(
                painter = painterResource(R.drawable.ic_home_polygon),
                contentDescription = "",
                tint = colors.blue
            )
            Text(4500.toDecimalFormat(), style = typography.body_01_M_14, color = colors.blue)
        }
        Icon(
            painter = painterResource(R.drawable.ic_right_arrow),
            contentDescription = "",
            tint = colors.gray500
        )

    }
}