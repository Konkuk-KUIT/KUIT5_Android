package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .padding(start = 20.dp, top = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.align(Alignment.Start),
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.img_kb_label),
                contentDescription = "kb label"
            )
            Text(viewModel.newAccount.value, style = typography.head_02_B_20)

            viewModel.ProductInfoMap[viewModel.newAccount.value]?.forEach { (key, value) ->
                if (key != "caution")
                    Column(
                        modifier = modifier,
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Text(key, style = typography.head_03_R_16)
                        Text(value, style = typography.head_02_B_20)
                    }
            }
        }
        Button(
            onClick = {
                onNavigateToCreateAccount()
            }, modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = colors.gray300,
                contentColor = colors.black
            ),
            content = { Text("가입하기", style = typography.body_02_R_12) },
            shape = RoundedCornerShape(12.dp)
        )
    }
}