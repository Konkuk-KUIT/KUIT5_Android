package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel

@Composable
fun CreateAccountScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccountResult: () -> Unit,
) {
    Column {
        Button(onClick = {
            onNavigateToCreateAccountResult()
        }) {
            Text("CreateAccountScreen")
        }
        Text("${viewModel.newAccount.value}")
    }
}