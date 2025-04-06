package com.kuit.kuit5.ui.shopping.screen.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme

@Composable
fun ConfirmButton(
    text: String,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        colors = ButtonDefaults.buttonColors(containerColor = BankSaladTheme.colors.gray300),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
            text = text,
            style = BankSaladTheme.typography.body_02_R_12,
            color = BankSaladTheme.colors.black
        )
    }
}

@Preview
@Composable
private fun PreviewConfirmButton() {
    ConfirmButton(
        text = "가입하기",
        onClick = {}
    )
}
