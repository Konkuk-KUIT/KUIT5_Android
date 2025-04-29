package com.kuit.kuit5.ui.shopping.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ShoppingGrayButton(modifier: Modifier = Modifier, value: String, onClick: () -> Unit) {
    Button(
        modifier = modifier.size(width = 320.dp, height = 40.dp),
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(12.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = colors.gray300,
            contentColor = colors.gray500
        )
    ) {
        Text(
            text = value,
            style = typography.head_04_SB_14,
            color = colors.black
        )
    }
}