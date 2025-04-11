package com.kuit.kuit5

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
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
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = colors.white,
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 3.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 27.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)

            ) {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    painter = painterResource(id = R.drawable.img_kb_label1),
                    contentDescription = "img_kb_label",
                )
                Text(
                    text = "KB 청년도약계좌",
                    style = typography.head_02_B_20,
                    color = colors.black
                )
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colors.gray300,
                        contentColor = colors.black
                    ),
                    shape = RoundedCornerShape(12.dp),
                    onClick = {
                        onNavigateToProductInfo()
                    }
                ) {
                    Text(
                        text = "정보조회",
                        style = typography.body_02_R_12,
                        color = colors.black
                    )
                }
                // 필요한 경우, ViewModel 데이터 보여줄 수 있음
                // Text(text = "${viewModel.newAccount.value}")
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800, showBackground = true)
@Composable
private fun ShoppingScreenPreview() {
    ShoppingScreen(viewModel = viewModel()) {}
}
