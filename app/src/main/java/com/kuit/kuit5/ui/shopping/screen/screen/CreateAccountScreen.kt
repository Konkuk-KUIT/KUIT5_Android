package com.kuit.kuit5.ui.shopping.screen.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.screen.component.ConfirmButton
import com.kuit.kuit5.ui.shopping.screen.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors


@Composable
fun CreateAccountScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel = ShoppingViewModel(),
    onNavigateToCreateAccountResult: () -> Unit = {}
) {
    Scaffold(
        containerColor = Color.White,
        bottomBar = {
            ConfirmButton(
                text = "확인",
                onClick = {
                    viewModel.addAccount()
                    onNavigateToCreateAccountResult()  // 해당 페이지로 네비게이션
                }
            )
        }
    ) { innerPadding ->
        Card(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = colors.white)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 20.dp, end = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .height(145.dp),
                painter = painterResource(R.drawable.img_kb_label),
                contentDescription = "KB로고",
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp)
            ) {
                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "유의할 점",
                    style = BankSaladTheme.typography.head_02_B_20,
                    color = colors.black
                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "5년 동안 해지 없이 완납할 수 있는지 체크해야 해요.\n" +
                            "\n" +
                            " 만기가 길다는 건 그 긴 기간 동안 목돈이 묶인다는 말과 같아요. 때문에 중도에 해지할 가능성이 커서 희망한 혜택을 제대로 못 받을 수 있어요. 심지어 만기를 못 채우고 중도에 해지하면 감면받은 세금을 다시 추징한다고 해요. 또, 청년도약계좌를 유지하는 동안 운용 수익을 늘릴 수 있는 다른 좋은 기회를 놓칠 수도 있어요.\n" +
                            "\n" +
                            " 내 수입과 지출을 잘 분석해 저축 여력이 충분한지 반드시 체크해야 해요. 저축 여력이 충분하지 않은 상태에서 무리하여 70만 원을 저축하기보다는, 40만 원을 납입하여 해지 없이 완납하는 것이 더 합리적일 수 있어요.",
                            style = BankSaladTheme.typography.head_03_R_16,
                            color = colors.black

                )

                Text(
                    text = "${viewModel.newAccount.value}",
                    color = Color.Transparent
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
fun PreviewCreateAccountScreenn() {
    CreateAccountScreen()
}