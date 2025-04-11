package com.kuit.kuit5.ui.shopping.screen

import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.shopping_componet.KbIcon
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun CreateAccountScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccountResult: () -> Unit
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.white)
    ) {
        KbIcon(icon = R.drawable.img_kbbank, account = "유의할 점", n = 320)

            Column(modifier = Modifier) {
                Text(
                    text = "5년동안 해지 없이 완납할 수 있는지 체크해야해요",
                    textAlign = TextAlign.Start,
                    style = typography.head_03_SB_16
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "만기가 길다는 건 그 긴 기간 동안 목돈이 묶인다는 말과 같아요. 때문에 중도에 해지할 가능성이 커서 희망한 혜택을 제대로 못 받을 수 있어요. 심지어 만기를 못 채우고 중도에 해지하면 감면받은 세금을 다시 추징한다고 해요. " +
                            "또, 청년도약계좌를 유지하는 동안 운용 수익을 늘릴 수 있는 다른 좋은 기회를 놓칠 수도 있어요.\n",
                    textAlign = TextAlign.Start,
                    style = typography.head_03_SB_16
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "내 수입과 지출을 잘 분석해 저축 여력이 충분한지 반드시 체크해야 해요. 저축 여력이 충분하지 않은 상태에서 무리하여 70만 원을 저축하기보다는, " +
                            "40만 원을 납입하여 해지 없이 완납하는 것이 더 합리적일 수 있어요.",
                    textAlign = TextAlign.Start,
                    style = typography.head_03_SB_16
                )


            }

        Button(
            onClick = {
                viewModel.addAccount()
                onNavigateToCreateAccountResult()
            },
            modifier = Modifier
                .width(320.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colors.gray300,
                contentColor = colors.black
            )
        )

        {

            Text(text = "확인")
        }
        //Text(text= "${viewModel.newAccount.value}")
    }
}