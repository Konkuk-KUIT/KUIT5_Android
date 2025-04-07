package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.shopping.component.ProductImageCard
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.ui.theme.Gray300

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(bottom = 20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(modifier = Modifier.fillMaxWidth()) {
            ProductImageCard(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(20.dp)
            )
            Text(
                text = "KB 청년도약계좌",
                style = typography.head_02_B_20,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "가입 연령",
                style = typography.head_03_R_16,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "19~34세",
                style = typography.head_02_B_20,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "소득 기준",
                style = typography.head_03_R_16,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "연 6,000 만 원 이하",
                style = typography.head_02_B_20,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "월 납입 금액",
                style = typography.head_03_R_16,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "40만원 ~ 최대70만원",
                style = typography.head_02_B_20,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "정부 지원금",
                style = typography.head_03_R_16,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "납입액의 3~6%",
                style = typography.head_02_B_20,
                modifier = Modifier.padding(start = 20.dp)
            )
        }


        Button(
            onClick = {
                onNavigateToCreateAccount()
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
            Text(text = "가입하기")
        }
//            }
//
//
//            Text(text = "${viewModel.newAccount.value}")
//    }
        }
    }

    //프리뷰용 함수
    @Composable
    fun ProductInfoScreenContent(
        modifier: Modifier = Modifier,
        onNavigateToCreateAccount: () -> Unit
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(bottom = 20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Column(modifier = Modifier.fillMaxWidth()) {
                ProductImageCard(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                )
                Text(
                    text = "KB 청년도약계좌",
                    style = typography.head_02_B_20,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "가입 연령",
                    style = typography.head_03_R_16,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "19~34세",
                    style = typography.head_02_B_20,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "소득 기준",
                    style = typography.head_03_R_16,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "연 6,000 만 원 이하",
                    style = typography.head_02_B_20,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "월 납입 금액",
                    style = typography.head_03_R_16,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "40만원 ~ 최대70만원",
                    style = typography.head_02_B_20,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "정부 지원금",
                    style = typography.head_03_R_16,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "납입액의 3~6%",
                    style = typography.head_02_B_20,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }


            Button(
                onClick = {
                    onNavigateToCreateAccount()
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
                Text(text = "가입하기")
            }


        }
    }

    @Preview
    @Composable
    private fun ProductInfoScreenPreview() {
        ProductInfoScreenContent(
            onNavigateToCreateAccount = {}
        )
    }