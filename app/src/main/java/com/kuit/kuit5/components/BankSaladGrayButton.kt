package com.kuit.kuit5.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun BankSaladGrayButton(
    modifier: Modifier = Modifier,
    value: String
) {
    Button(
        modifier = modifier.size(58.dp, 38.dp),
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(6.dp),
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = colors.gray200,
            contentColor = colors.gray500
        )
    ) {
        Text(
            text = value,
            style = typography.head_04_SB_14,
            color = colors.gray500
        )
    }


}

@Preview
@Composable
private fun BankSaladGrayButtonPreview() {
    BankSaladGrayButton(value = "송금")
}