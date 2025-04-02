package com.kuit.kuit5.ui.components

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun BankSaladGrayButton(modifier: Modifier = Modifier, text: String = "버튼") {

    Button(
        onClick = {
            print("ButtonClicked")
        },
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
        shape = RoundedCornerShape(6.dp),
        colors = ButtonDefaults.textButtonColors(colors.gray200)
    ) {
        Text(text, style = typography.head_04_SB_14, color = colors.gray500)
    }

}

@Preview
@Composable
private fun BSGBPrev() {
    BankSaladGrayButton()
}