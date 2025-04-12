package com.kuit.kuit5.ui.shopping.screen

import android.hardware.display.DeviceProductInfo
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.ShoppingData
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToProductInfo: () -> Unit
) {
    val product = ShoppingData(
        icon = R.drawable.img_kb_label,
        title = "KB 청년도약계좌",
        age = "19~34세",
        income = "연 6,000만 원 이하",
        month = "40만원 ~ 최대 70만원",
        government = "납입액의 3~6%",
        explanation = """
    5년 동안 해지 없이 완납할 수 있는지 체크해야 해요.

    만기가 길다는 건 그 긴 기간 동안 목돈이 묶인다는 말과 같아요. 
    때문에 중도에 해지할 가능성이 커서 희망한 혜택을 제대로 못 받을 수 있어요. 
    심지어 만기를 못 채우고 중도에 해지하면 감면받은 세금을 다시 추징한다고 해요. 
    또, 청년도약계좌를 유지하는 동안 운용 수익을 올릴 수 있는 다른 좋은 기회를 놓칠 수도 있어요.

    내 수입과 지출을 잘 분석해 저축 여력이 충분한지 반드시 체크해야 해요. 
    저축 여력이 충분하지 않은 상태에서 매달 최대 70만 원을 저축하다가는 
    40만 원을 납입하며 해지 없이 완납하는 것이 더 합리적일 수 있어요.
""".trimIndent()
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 20.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(colors.white)
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 27.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_kb_label),
                    contentDescription = "kb",
                    modifier = Modifier
                        .size(width = 280.dp, height = 145.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    text = "KB 청년도약계좌",
                    style = typography.head_02_B_20
                )
                Spacer(modifier = Modifier.size(20.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Button(
                        modifier = Modifier
                            .size(280.dp, 40.dp)
                            .align(Alignment.CenterEnd),
                        contentPadding = PaddingValues(0.dp),
                        shape = RoundedCornerShape(12.dp),
                        onClick = {
                            viewModel.selectProduct(product)
                            onNavigateToProductInfo()
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colors.gray300,
                            contentColor = colors.black
                        )
                    ) {
                        Text(
                            text = "정보조회",
                            style = typography.body_02_R_12
                        )
                    }
                }
            }
        }
    }
}