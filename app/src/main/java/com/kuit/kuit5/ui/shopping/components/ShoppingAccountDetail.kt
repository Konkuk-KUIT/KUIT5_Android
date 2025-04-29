package com.kuit.kuit5.ui.shopping.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ShoppingAccountDetail(
    modifier: Modifier = Modifier,
    title: String,
    content: String
) {

    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = title,
            style = typography.head_03_R_16,
            modifier = modifier.padding(bottom = 10.dp)
        )
        Text(text = content, style = typography.head_02_B_20)
    }


}


@Preview(showBackground = true)
@Composable
private fun ShoppingAccountDetailPreview() {
    ShoppingAccountDetail(title = "가입 연령", content = "19~34세")
}