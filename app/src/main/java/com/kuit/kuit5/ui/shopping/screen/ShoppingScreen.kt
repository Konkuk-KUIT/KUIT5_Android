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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.component.ProductCard
import com.kuit.kuit5.ui.shopping.component.ShoppingGrayButton
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToProductInfo:() -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = colors.gray100)
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        ProductCard(
            productImg = viewModel.KBProduct.img,
            productName = viewModel.KBProduct.name,
            onClick = onNavigateToProductInfo
        )
    }
}

@Preview
@Composable
private fun ShoppingScreenPreview() {
    //val viewModel: ShoppingViewModel = viewModel()
    val viewModel = viewModel<ShoppingViewModel>()
    ShoppingScreen(viewModel = viewModel) { }
}