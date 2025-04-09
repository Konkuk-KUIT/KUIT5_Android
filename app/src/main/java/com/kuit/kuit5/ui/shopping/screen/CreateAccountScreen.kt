package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.ui.shopping.component.ShoppingGrayButton
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun CreateAccountScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccountResult: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = colors.gray100),
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                painter = painterResource(viewModel.KBProduct.infoImg),
                contentDescription = "kb image",
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = "유의할 점",
                style = typography.head_02_B_20
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                text = viewModel.KBProduct.precaution,
                style = typography.head_03_R_16
            )

        }
        ShoppingGrayButton(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(horizontal = 20.dp, vertical = 20.dp),
            text = "확인",
            onClick = onNavigateToCreateAccountResult
        )
    }
}

@Preview
@Composable
private fun CreateAccountScreenPreview() {
    val viewModel = viewModel<ShoppingViewModel>()
    CreateAccountScreen(viewModel = viewModel){}
}