package com.kuit.kuit5.ui.shopping.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.ui.shopping.component.ShoppingGrayButton
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun CreateAccountResultScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToShopping: () -> Unit
) {
    BackHandler {
        onNavigateToShopping()
    }
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = colors.gray100),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "가입완료!",
            style = typography.head_02_B_20
        )
        ShoppingGrayButton(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(horizontal = 20.dp, vertical = 20.dp),
            text = "금융쇼핑으로 이동",
            onClick = onNavigateToShopping
        )
    }

}

@Preview
@Composable
private fun CreateAccountResultScreenPreview() {
    val viewModel = viewModel<ShoppingViewModel>()
    CreateAccountResultScreen(viewModel = viewModel) {}
}