package com.kuit.kuit5.ui.shopping.screen.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit5.ui.shopping.screen.viewmodel.ShoppingViewModel

@Composable
fun CreateAccountScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccountResult: () -> Unit
    ) {
    Column {
        Button(
            onClick = {
                viewModel.addAccount()
                onNavigateToCreateAccountResult()

            }
        ){
            Text(text = "CreateAccountScreen")
        }

        Text(text = "${viewModel.newAccount.value}")
    }

}