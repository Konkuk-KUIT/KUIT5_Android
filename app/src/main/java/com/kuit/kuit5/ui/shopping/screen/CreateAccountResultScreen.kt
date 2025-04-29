package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.ui.shopping.components.ShoppingGrayButton
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun CreateAccountResultScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToShopping: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colors.white)
    ) {
        Text(text = "가입완료!", style = typography.head_02_B_20, modifier=Modifier.align(Alignment.Center))

        Box(modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter).padding(20.dp)) {
            ShoppingGrayButton(
                modifier = Modifier.padding(top = 167.dp),
                "금융쇼핑으로 이동",
                onClick = { onNavigateToShopping() }
            )
        }
    }


    /*Column {
        Button(
            onClick = {
                onNavigateToShopping()
            }
        ) {
            Text(text = "CreateAccountResultScreen")
        }
        Text(text = "${viewModel.newAccount.value}")
    }*/
}

@Preview
@Composable
private fun CreateAccountResultScreenPreview() {
    CreateAccountResultScreen(
        viewModel = viewModel()
    ) {}
}