package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.kuit.kuit5.ui.shopping.component.ProductImageCard
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.ui.theme.Gray300

@Composable
fun CreateAccountScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccountResult: ()-> Unit) {
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
                text = viewModel.productWarningTitle,
                style = typography.head_02_B_20,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = viewModel.productWarningBody,
                style = typography.head_03_R_16,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
            )
        }


        Button(
            onClick = {
                onNavigateToCreateAccountResult()
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
            Text(text = "확인")
        }


    }
}

//프리뷰용 함수
@Composable
fun CreateAccountScreenContent(
    modifier: Modifier = Modifier,
    onNavigateToCreateAccountResult: ()-> Unit)
 {
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
                text = "유의할 점",
                style = typography.head_02_B_20,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "5년 동안 해지 없이 완납할 수 있는지 체크해야 해요.\n" +
                        "\n" +
                        "만기가 길다는 건 그 긴 기간 동안 목돈이 묶인다는 말과 같아요. 때문에 중도에 해지할 가능성이 커서 희망한 혜택을 제대로 못 받을 수 있어요. 심지어 만기를 못 채우고 중도에 해지하면 감면받은 세금을 다시 추징한다고 해요. 또, 청년도약계좌를 유지하는 동안 운용 수익을 늘릴 수 있는 다른 좋은 기회를 놓칠 수도 있어요.\n" +
                        "\n" +
                        "내 수입과 지출을 잘 분석해 저축 여력이 충분한지 반드시 체크해야 해요. 저축 여력이 충분하지 않은 상태에서 무리하여 70만 원을 저축하기보다는, 40만 원을 납입하여 해지 없이 완납하는 것이 더 합리적일 수 있어요.",
                style = typography.head_03_R_16,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
            )
        }


        Button(
            onClick = {
                onNavigateToCreateAccountResult()
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
            Text(text = "확인")
        }


    }
}

@Preview
@Composable
private fun CreateAccountScreenPreview() {
    CreateAccountScreenContent(
        onNavigateToCreateAccountResult = {}
    )
}