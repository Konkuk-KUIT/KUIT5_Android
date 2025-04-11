package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.components.BankSaladGrayButton
import com.kuit.kuit5.model.HomeData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeAssetsCardItem(
    modifier: Modifier = Modifier,
    asset: String,
    money: String,
    noticeStart: String,
    noticeMiddle: String,
    noticeEnd: String,
    button: String,
    assetList: List<HomeData>,
    cardValue: String,
    isArrow: Boolean
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(color = colors.white)
            .padding(20.dp, 24.dp)
    ) {
        Column(modifier = modifier.fillMaxWidth()) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = asset,
                        style = typography.head_03_R_16,
                        color = colors.gray500,
                        modifier = modifier.padding(bottom = 10.dp)
                    )
                    Text(
                        text = money,
                        style = typography.head_02_B_20,
                        color = colors.black
                    )
                }
                BankSaladGrayButton(value = button)
            }
            Row(modifier = modifier.padding(bottom = 28.dp)) {
                Text(
                    text = noticeStart+" ",
                    style = typography.body_02_R_12,
                    color = colors.black
                )
                Text(
                    text = noticeMiddle+" ",
                    style = typography.body_02_SB_12,
                    color = colors.green
                )
                Text(
                    text = noticeEnd,
                    style = typography.body_02_R_12,
                    color = colors.black
                )
            }
            Column(
                modifier = modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                assetList.forEach { asset ->
                    HomeAssetsCardDetail(asset = asset, isArrow = isArrow)
                }
            }
            Spacer(modifier = modifier.size(24.dp))
            HomeAssetsDiagnosisCard(value = cardValue)
        }
    }
}

@Preview
@Composable
private fun HomeAssetsCardItem() {
    val assetList = listOf(
        HomeData(
            asset = "계좌 · 현금",
            money = "234,567원",
            changedMoney = "4,500원",
            icon = R.drawable.img_kakao_icon
        ),
        HomeData(
            money = "1,000,000원",
            asset = "예적금",
            changedMoney = "10,000원",
            icon = R.drawable.img_kakao_icon
        ),
    )
    HomeAssetsCardItem(
        asset = "순자산",
        money = "1,234,567원",
        noticeStart = "지난 방문일보다",
        noticeMiddle = "4,500원",
        noticeEnd = "줄었어요",
        button = "송금",
        assetList = assetList,
        cardValue = "쌓인 예적금 이자 확인하고 진단받기",
        isArrow = true
    )
}