package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeEventItem(
    modifier: Modifier = Modifier,
    icon: Int,
    value: String
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Icon(
            modifier = modifier.size(36.dp),
            painter = painterResource(icon),
            contentDescription = "EventItem img",
            tint = Color.Unspecified
        )
        Text(
            text = value,
            style = typography.body_01_M_14,
            color = colors.gray500
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeEventItemPreview() {
    HomeEventItem(
        icon = R.drawable.img_home_money_letter,
        value = "용돈벌기"
    )
}