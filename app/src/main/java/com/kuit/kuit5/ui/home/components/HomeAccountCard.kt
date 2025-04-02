package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.HomeAccountDetailData
import com.kuit.kuit5.ui.components.BankSaladGrayButton
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeAccountCard(modifier: Modifier = Modifier, accountList: List<HomeAccountDetailData>) {
    Box(
        Modifier
            .padding(horizontal = 20.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(colors.white)
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp, horizontal = 20.dp)


        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(verticalArrangement = Arrangement.SpaceBetween) {
                    Text("입출금 계좌", style = typography.head_03_R_16, color = colors.gray500)
                    Spacer(Modifier.height(10.dp))
                    Text(234567.toDecimalFormat(), style = typography.head_02_B_20)
                }
                BankSaladGrayButton(text = "송금")

            }
            Spacer(Modifier.height(16.dp))
            Text(
                "어제보다",
                modifier = Modifier.align(Alignment.End),
                style = typography.body_02_R_12,
                color = colors.gray400
            )
            Spacer(Modifier.height(22.dp))
            accountList.forEach { accountDetail ->
                HomeAccountCardDetail(
                    image = accountDetail.image,
                    accountName = accountDetail.accountName,
                    amount = accountDetail.amount,
                    balanceChangeAmount = accountDetail.balanceChangeAmount
                )
            }
            Box(
                Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.apricot),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(R.drawable.img_home_pig),
                            contentDescription = "",
                            modifier = Modifier.size(28.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text("목표를 설정하고 종잣돈을 모아보세요", style = typography.body_02_R_12)

                    }
                    Icon(
                        painter = painterResource(R.drawable.ic_right_arrow),
                        contentDescription = "",
                        modifier = Modifier.size(12.dp),
                        tint = colors.gray400
                    )
                }
            }


        }
    }
}

@Preview()
@Composable
private fun HomeAccountCardPrev() {
    HomeAccountCard(
        accountList = listOf(
            HomeAccountDetailData(
                image = R.drawable.img_kakao_icon,
                amount = 1.toDecimalFormat(),
                accountName = "Sample Account Name",
                balanceChangeAmount = 1.toDecimalFormat()
            ), HomeAccountDetailData(
                image = R.drawable.img_kakao_icon,
                amount = 1.toDecimalFormat(),
                accountName = "Sample Account Name",
                balanceChangeAmount = 1.toDecimalFormat()
            ), HomeAccountDetailData(
                image = R.drawable.img_kakao_icon,
                amount = 1.toDecimalFormat(),
                accountName = "Sample Account Name",
                balanceChangeAmount = 1.toDecimalFormat()
            )
        )
    )
}