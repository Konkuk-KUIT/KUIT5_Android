package com.kuit.kuit5.ui.shopping.screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme

@Composable
fun ProductDetailSection(
    label: String,
    value: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = label,
            style = BankSaladTheme.typography.head_03_R_16,
            color = Color(0XFF000000)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = value,
            style = BankSaladTheme.typography.head_02_B_20,
            color = Color(0XFF000000)
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewProductDetailSection() {

    ProductDetailSection(label = "가입 연령", value = "19~34세")

}