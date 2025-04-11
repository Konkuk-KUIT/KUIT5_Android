package com.kuit.kuit5.ui.shopping.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.navigation.Route
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun CreateAccountResultScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToShopping:() ->Unit
) {
    Column(modifier=modifier.fillMaxSize()) {
        Column(
            modifier=modifier
                .fillMaxSize()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "가입완료!",
                style = typography.head_02_B_20,
                color = colors.black
            )
        }
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.Bottom

        ) {
            Button(
                modifier = modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colors.gray300,
                    contentColor = colors.black
                ),
                shape = RoundedCornerShape(12.dp),
                onClick = {
                    onNavigateToShopping()
                }
            ) {
                Text(text = "금융쇼핑으로 이동")
            }
            //Text(text = "${viewModel.newAccount.value}")
        }
    }
}

@Preview
@Composable
private fun CreateAccountResultScreenPreview() {
    CreateAccountResultScreen(viewModel = viewModel()){}
}