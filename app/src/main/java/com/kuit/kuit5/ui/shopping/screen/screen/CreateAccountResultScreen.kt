package com.kuit.kuit5.ui.shopping.screen.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.ui.shopping.screen.component.ConfirmButton
import com.kuit.kuit5.ui.shopping.screen.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors

@Composable
fun CreateAccountResultScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToShopping: () -> Unit
) {

    BackHandler {
        onNavigateToShopping()
    }

    Scaffold(
        containerColor = Color.White,
        bottomBar = {
            ConfirmButton(
                text = "금융쇼핑으로 이동",
                onClick = {
                    viewModel.addAccount()
                    onNavigateToShopping()  // 해당 페이지로 네비게이션
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding)
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


            Text(
                text = "${viewModel.newAccount.value}",
                color = Color.Transparent
            )
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
private fun CreateAccountResultScreenPreview() {
    val viewModel = viewModel<ShoppingViewModel>()


    CreateAccountResultScreen(
        viewModel = viewModel
    ){}
}