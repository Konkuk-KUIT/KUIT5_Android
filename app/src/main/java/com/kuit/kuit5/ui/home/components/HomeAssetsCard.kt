package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.HomeAssetsDetailData
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
    detailsList: List<HomeAssetsDetailData>,
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
                name = detail.name,
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
        title = "title",
        amount = "amount",
        buttonText = "버튼",
        description = listOf("description[0]", "description[1]", "description[2]"),
        detailsList = listOf(
            HomeAssetsDetailData(
                image = R.drawable.img_kakao_icon,
                name = "accountName1",
                amount = 1.toDecimalFormat(),
                changedAmount = 1.toDecimalFormat()
            ),
            HomeAssetsDetailData(
                image = R.drawable.img_kakao_icon,
                name = "accountName2",
                amount = 2.toDecimalFormat(),
                changedAmount = 2.toDecimalFormat()
            )
        ),
        bannerText = "샘플 배너 텍스트"


    )
}