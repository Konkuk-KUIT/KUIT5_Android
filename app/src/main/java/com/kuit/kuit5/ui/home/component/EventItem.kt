package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun EventItem(
    modifier: Modifier = Modifier,
    img: Int,
    text: String
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(
            modifier = Modifier.size(36.dp),
            painter = painterResource(id = img),
            contentDescription = "eventItem image",
        )
        Text(
            text = text,
            style = typography.body_01_M_14,
            color = colors.gray500
        )
    }
}

@Preview
@Composable
private fun EventItemPreview() {
    EventItem(img = R.drawable.img_home_allowance, text = "test")
}