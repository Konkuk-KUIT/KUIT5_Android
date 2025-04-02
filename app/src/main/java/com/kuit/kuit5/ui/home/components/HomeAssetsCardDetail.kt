package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeAssetsCardDetail(
    modifier: Modifier = Modifier,
    image: Int,
    amount: String,
    name: String,
    balanceChangeAmount: String? = null
) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(image),
                    contentDescription = "",
                    modifier = Modifier.size(30.dp)
                )
                Spacer(Modifier.width(10.dp))
                Column {
                    Text(
                        name,
                        style = typography.body_01_M_14,
                        color = colors.gray400
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        amount,
                        style = typography.body_01_M_14
                    )
                }
            }
            HomeBalanceChangeItem(balanceChangeAmount = balanceChangeAmount)
        }
        Spacer(Modifier.height(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeAssetsCardDetailPreview() {
    HomeAssetsCardDetail(
        image = R.drawable.img_kakao_icon,
        amount = 0.toDecimalFormat(),
        name = "샘플 계좌 이름",
        balanceChangeAmount = 5000.toDecimalFormat()
    )
}

