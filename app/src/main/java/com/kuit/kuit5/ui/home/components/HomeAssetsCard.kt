package com.kuit.kuit5.ui.home.components

import android.R.attr.text
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
import com.kuit.kuit5.model.HomeDetailData
import com.kuit.kuit5.ui.components.BankSaladGrayButton
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
        /**
         * @param description List의 size는 3 이어야만 함.
         */

fun HomeAssetsCard(
    modifier: Modifier = Modifier,
    title: String,
    amount: String,
    buttonText: String,
    description: List<String>,
    detailsList: List<HomeDetailData>,
    bannerText: String
) {
    Column(
        Modifier
            .width(320.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(colors.white)
            .padding(vertical = 24.dp, horizontal = 20.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(verticalArrangement = Arrangement.SpaceBetween) {
                Text(title, style = typography.head_03_R_16, color = colors.gray500)
                Spacer(Modifier.height(10.dp))
                Text(amount, style = typography.head_02_B_20)
            }
            BankSaladGrayButton(text = buttonText)

        }
        Spacer(Modifier.height(16.dp))
        Row {
            Text(
                description[0],
                style = typography.body_02_R_12,
            )
            Text(
                " ${description[1]} ",
                style = typography.body_02_SB_12,
                color = colors.green
            )
            Text(
                description[2],
                style = typography.body_02_R_12,
            )
        }
        Spacer(Modifier.height(22.dp))
        detailsList.forEach { detail ->
            HomeAssetsCardDetail(
                image = detail.image,
                amount = detail.amount,
                accountName = detail.accountName,
                changedAmount = detail.changedAmount
            )
        }

        HomeAssetsBannerItem(text = bannerText)


    }
}


@Preview
@Composable
private fun HomeAssetsCardPrev() {


    HomeAssetsCard(
        title = "순자산",
        amount = 234567.toDecimalFormat(),
        buttonText = "송금",
        description = listOf("지난 방문일보다", 4500.toDecimalFormat(), "줄었어요"),
        detailsList = listOf(
            HomeDetailData(
                image = R.drawable.img_kakao_icon,
                accountName = "계좌 · 현금",
                amount = 234567.toDecimalFormat(),
                changedAmount = 4500.toDecimalFormat()
            ),
            HomeDetailData(
                image = R.drawable.img_kakao_icon,
                accountName = "예적금",
                amount = 1000000.toDecimalFormat(),
                changedAmount = 10000.toDecimalFormat()
            )
        ),
        bannerText = "쌓인 예적금 이자 확인하고 진단받기"


    )
}