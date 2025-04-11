package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun CreatAccountResultScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToShopping: () -> Unit
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colors.white)
    ) {

        Column(modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                text="가입완료!",
                style = typography.head_02_B_20)
        }
            Button(
                onClick = {
                    onNavigateToShopping()
                },
                modifier = Modifier
                    .width(280.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colors.gray300,
                    contentColor = colors.black
                )

            ) {

                Text(text = "금융쇼핑으로 이동")
            }

            // Text(text="${viewModel.newAccount.value}")

    }
}