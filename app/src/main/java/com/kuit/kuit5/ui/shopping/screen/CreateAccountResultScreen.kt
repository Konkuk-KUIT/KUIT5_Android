package com.kuit.kuit5.ui.shopping.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import androidx.navigation.NavController
import com.kuit.kuit5.navigation.Route
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.ui.theme.Gray300

@Composable
fun CreateAccountResultScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    navController: NavController,
    onNavigateToShopping: () -> Unit
) {

    BackHandler {
        navController.popBackStack(route = "shopping", inclusive = false)
    }
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = viewModel.completetext,
            style = typography.head_02_B_20
        )
        Spacer(modifier = Modifier.height(392.dp))
        Button(
            onClick = {
                onNavigateToShopping()
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(320.dp)
                .height(40.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Gray300,
                contentColor = Color.Black
            )
        ) {
            Text(text = "금융쇼핑으로 이동")
        }
//        Text(text="${viewModel.newAccount.value}")
    }
}

