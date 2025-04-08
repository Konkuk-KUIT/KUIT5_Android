package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.screen.components.ProductCard
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToProductInfo: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(colors.gray100),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProductCard(viewModel = viewModel, onNavigateToProductInfo = { onNavigateToProductInfo() }, image = R.drawable.img_kb_label, accountName = "KB 청년도약계좌")
        ProductCard(viewModel = viewModel, onNavigateToProductInfo = { onNavigateToProductInfo() }, image = R.drawable.img_kb_label, accountName = "KB 청년도약계좌")
        ProductCard(viewModel = viewModel, onNavigateToProductInfo = { onNavigateToProductInfo() }, image = R.drawable.img_kb_label, accountName = "KB 청년도약계좌")

        Text(text = "Shopping Screen")
    }
}

