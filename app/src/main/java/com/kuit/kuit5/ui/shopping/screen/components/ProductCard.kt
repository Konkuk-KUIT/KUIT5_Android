package com.kuit.kuit5.ui.shopping.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ProductCard(modifier: Modifier = Modifier, viewModel: ShoppingViewModel, onNavigateToProductInfo: () -> Unit, image: Int, accountName: String) {
    Card(modifier = Modifier.padding(20.dp), colors = CardDefaults.cardColors(colors.gray100), elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 27.dp, end = 20.dp, bottom = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.img_kb_label),
                contentDescription = "item image"
            )
            Text(accountName, modifier = Modifier.align(Alignment.Start), style = typography.head_02_B_20)
            Button(
                onClick = {
                    viewModel.creatingAccountName(accountName)
                    onNavigateToProductInfo()
                }, modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colors.gray300,
                    contentColor = colors.black
                ), content = { Text("정보조회", style = typography.body_02_R_12) }
            )


        }
    }
}