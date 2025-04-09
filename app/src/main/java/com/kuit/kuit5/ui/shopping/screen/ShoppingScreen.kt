package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.ui.theme.Gray300

@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToProductInfo: () -> Unit
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(0.9f),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Image(
                    modifier = Modifier
                        .height(145.dp)
                        .align(Alignment.CenterHorizontally),
                    painter = painterResource(id = R.drawable.img_kb_label),
                    contentDescription = "kb_label"
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = viewModel.accountName, style = typography.head_02_B_20)
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { onNavigateToProductInfo()},
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(280.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Gray300,
                        contentColor = Color.Black)
                ) {
                    Text(text = "정보조회")
                }
            }

        }
    }
}

//프리뷰용 함수
@Composable
fun ShoppingScreenContent(
    modifier: Modifier = Modifier,
    onNavigateToProductInfo: () -> Unit
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(0.9f),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Image(
                    modifier = Modifier
                        .height(145.dp)
                        .align(Alignment.CenterHorizontally),
                    painter = painterResource(id = R.drawable.img_kb_label),
                    contentDescription = "kb_label"
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "KB 청년도약계좌", style = typography.head_02_B_20)
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { onNavigateToProductInfo()},
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(280.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Gray300,
                        contentColor = Color.Black)
                    ) {
                    Text(text = "정보조회")
                }
            }

        }
    }
}


@Preview
@Composable
private fun ShoppingScreenPreview() {
    ShoppingScreenContent(
        onNavigateToProductInfo = {}
    )
}