package com.kuit.kuit5.ui.shopping.screen.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.shopping.screen.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors

@Composable
fun CreateAccountResultScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel = ShoppingViewModel(),
    onNavigateToShopping: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 20.dp, vertical = 20.dp)
    ) {
        Column(
            modifier = modifier
                .align(Alignment.Center)
        ) {
            Text(
                text = "가입완료!",
                style = BankSaladTheme.typography.head_02_B_20,
                color = colors.black
            )
        }

        Button(
            onClick = onNavigateToShopping,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            colors = ButtonDefaults.buttonColors(containerColor = colors.gray300),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = "금융쇼핑으로 이동",
                style = BankSaladTheme.typography.body_02_R_12,
                color = colors.black
            )
        }

        Text(
            text = "${viewModel.newAccount.value}",
            color = Color.Transparent
        )
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
private fun PreviewCreateAccountResultScreen() {
    CreateAccountResultScreen()
}