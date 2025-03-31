package com.kuit.kuit5.ui.home.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat
import com.kuit.kuit5_solutions.ui.theme.defaultBankSaladTypography

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(

            text = 100000.toDecimalFormat(),
            style = typography.head_02_B_20,
            color = colors.green
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}
