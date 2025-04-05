package com.kuit.kuit5.ui.shopping.screen.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit5.ui.shopping.screen.viewmodel.ShoppingViewModel

@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToProductInfo: () -> Unit
) {
    Column(modifier = modifier) {
        Button(
            onClick = {
                onNavigateToProductInfo()

            }
        ) {
            Text(text = "Shopping Screen")
        }

    }
}