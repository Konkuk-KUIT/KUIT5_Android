package com.kuit.kuit5.ui.home.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.HomeData
import com.kuit.kuit5.ui.home.components.HomeAccountCardItem
import com.kuit.kuit5.ui.home.components.HomeAssetsCardItem
import com.kuit.kuit5.ui.home.components.HomeBannerItem
import com.kuit.kuit5.ui.home.components.HomeEventItem
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.util.toDecimalFormat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.gray100)
    ) {
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = colors.gray100
            ),
            title = {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(R.drawable.img_home_banksalad),
                    contentDescription = "banksalad img",
                    tint = Color.Unspecified
                )
            },
            actions = {
                Row(
                    modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_bell),
                        contentDescription = "bell icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_stack),
                        contentDescription = "stack icon",
                        tint = Color(0xFF9FA5B0)
                    )
                }
            }
        )
        // TopAppBar
        Column(
            modifier = Modifier.verticalScroll(state = scrollState)
        ) {
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 24.dp)) {
                HomeBannerItem(
                    caption = "3월에만 받을 수 있는",
                    value = "최대 17만원 용돈받기",
                    icon = R.drawable.img_home_cash
                )
            }
            // HomeBannerItem -  (Todo: HorizontalPager 구현하기)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp, vertical = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                HomeEventItem(
                    icon = R.drawable.img_home_money_letter,
                    value = "용돈벌기"
                )
                HomeEventItem(
                    icon = R.drawable.img_home_remodeling,
                    value = "보험리모델링"
                )
                HomeEventItem(
                    icon = R.drawable.img_home_money_pocket,
                    value = "대출찾기"
                )
                HomeEventItem(
                    icon = R.drawable.img_home_card,
                    value = "카드이벤트"
                )
            }
            //HomeEventItem

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, 0.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                HomeAccountCardItem(
                    account = "입출금 계좌",
                    money = 234567.toDecimalFormat()+"원"
                )
                //HomeAccountCardItem
                HomeAssetsCardItem(
                    asset = "순자산",
                    money = 1234567.toDecimalFormat()+"원",
                    noticeStart = "지난 방문일보다",
                    noticeMiddle = 4500.toDecimalFormat()+"원",
                    noticeEnd = "줄었어요",
                    button = "송금",
                    assetList = listOf(
                        HomeData(
                            asset = "계좌 · 현금",
                            money = 234567.toDecimalFormat()+"원",
                            changedMoney = 4500.toDecimalFormat()+"원",
                            icon = R.drawable.img_kakao_icon
                        ),
                        HomeData(
                            money = 1000000.toDecimalFormat()+"원",
                            asset = "예적금",
                            changedMoney = 10000.toDecimalFormat()+"원",
                            icon = R.drawable.img_kakao_icon
                        )
                    ),
                    cardValue = "쌓인 예적금 이자 확인하고 진단받기",
                    isArrow = true
                )
                HomeAssetsCardItem(
                    asset = "이번 달 지출",
                    money = 198000.toDecimalFormat()+"원",
                    noticeStart = "지난달 같은 기간보다",
                    noticeMiddle = 53000.toDecimalFormat()+"원",
                    noticeEnd = "덜 썼어요",
                    button = "확인",
                    assetList = listOf(
                        HomeData(
                            asset = "오늘 지출",
                            money = 21500.toDecimalFormat() + "원",
                            changedMoney = "",
                            icon = R.drawable.img_home_bank
                        ),
                        HomeData(
                            money = 3500.toDecimalFormat()+"원",
                            asset = "어제 지출",
                            changedMoney = "",
                            icon = R.drawable.img_home_bank
                        )
                    ),
                    cardValue = "3월 카드 지출",
                    isArrow = false
                )
                //HomeAssetsCardItem
            }
            Spacer(modifier = Modifier.size(16.dp))
        }

    }


//    Text(
//        text = 100000.toDecimalFormat(),
//        style = typography.head_03_B_16,
//        color = colors.blue
//    )
}

@Preview(showBackground = true, heightDp = 1600)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}