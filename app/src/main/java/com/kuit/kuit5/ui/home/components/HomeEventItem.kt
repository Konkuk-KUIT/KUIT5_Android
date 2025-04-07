package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
fun HomeEventItem(modifier: Modifier = Modifier, image: Int, text: String) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(image),
            contentDescription = "home event image",
            modifier = Modifier.size(36.dp)
        )
        Spacer(Modifier.height(10.dp))
        Text(text, style = typography.body_01_M_14, color = colors.gray500)

    }
}

@Preview(showBackground = true)
@Composable
private fun HomeEventItemPrev() {
    HomeEventItem(image = R.drawable.img_home_allowance, text = "용돈벌기")
}