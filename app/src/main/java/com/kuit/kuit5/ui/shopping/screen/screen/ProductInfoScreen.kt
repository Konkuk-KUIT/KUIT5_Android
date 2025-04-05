package com.kuit.kuit5.ui.shopping.screen.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit5.ui.shopping.screen.viewmodel.ShoppingViewModel

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount: () -> Unit
) {
    Column {
        Button(
            onClick = {
                onNavigateToCreateAccount()

            }
        ){
            Text(text = "ProductInfoScreen")
        }
        Text(text = "${viewModel.newAccount.value}")
    }

}