package com.kuit.kuit5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.kuit.kuit5.model.AccountData
import com.kuit.kuit5.model.EventData
import com.kuit.kuit5.model.NetAssetData
import com.kuit.kuit5.ui.asset.component.HomeAccountCardItem
import com.kuit.kuit5.ui.asset.component.HomeAssetsCardItem
import com.kuit.kuit5.ui.asset.component.HomeBannerItem
import com.kuit.kuit5.ui.asset.component.HomeEventItem
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.util.toDecimalFormat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.gray100),
    ) {
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = colors.white
            ),
            title = {
                Icon(
                    painter = painterResource(id = R.drawable.img_banksalad_icon),
                    contentDescription = "banksalad icon",
                    modifier = Modifier.size(24.dp),
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
                        tint = colors.gray400
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_stack),
                        contentDescription = "stack icon",
                        tint = colors.gray400
                    )
                }
            }
        )
        Spacer(modifier = Modifier.size(14.dp))

        //TopAppBar 제외하고
        //카드
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollState),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            HomeBannerItem() //옆으로 넘어가는 카드 출력
            Spacer(modifier = Modifier.size(8.dp)) //그 아래에 간격 좀 주고

            //사진과 텍스트
            HomeEventItem(
                eventList = listOf(
                    EventData(
                        icon = R.drawable.img_moneymail_icon,
                        text = "용돈벌기"
                    ),
                    EventData(
                        icon = R.drawable.img_heart_icon,
                        text = "보험리모델링"
                    ),
                    EventData(
                        icon = R.drawable.img_moneypocket_icon,
                        text = "대출찾기"
                    ),
                    EventData(
                        icon = R.drawable.img_bluecard_icon,
                        text = "카드이벤트"
                    ),
                )
            )
            //입출금 계좌
            val accountLists = listOf(
                AccountData(
                    icon = R.drawable.img_kakao_icon,
                    money = 234567.toDecimalFormat()+"원",
                    title="입출금통장",
                    dropMoney = 3300.toDecimalFormat()+"원"
                )
            )
            HomeAccountCardItem(
                title = "입출금 계좌",
                total_money = 234567,
                info1 = "어제보다",
                button_name = "송금",
                AccountDataList = accountLists,
            )
            //순자산
            val accountList = listOf(
                NetAssetData(
                    icon = R.drawable.img_kakao_icon,
                    title = "계좌 · 현금",
                    money = 234567.toDecimalFormat() + "원",
                    dropMoney = 4500.toDecimalFormat() + "원"
                ),
                NetAssetData(
                    icon = R.drawable.img_kakao_icon,
                    title = "예적금",
                    money = 1000000.toDecimalFormat() + "원",
                    dropMoney = 10000.toDecimalFormat() + "원"
                )
            )
            val spendList = listOf(
                NetAssetData(
                    icon = R.drawable.img_won_icon,
                    title = "오늘 지출",
                    money = 21500.toDecimalFormat() + "원",
                    dropMoney = ""
                ),
                NetAssetData(
                    icon = R.drawable.img_won_icon,
                    title = "어제 지출",
                    money = 3500.toDecimalFormat() + "원",
                    dropMoney = ""
                )
            )
            HomeAssetsCardItem(
                title = "순자산",
                total_money = 1234567,
                info1 = "지난 방문일보다 ",
                info2 = 4500,
                info3 = "줄었어요",
                button_name = "송금",
                text = "쌓인 예적금 이자 확인하고 진단받기",
                NetAssetDataList = accountList,
            )
            //이번달 지출
            HomeAssetsCardItem(
                title = "이번달 지출",
                total_money = 198000,
                info1 = "지난달 같은 기간보다 ",
                info2 = 53000,
                info3 = "덜썼어요",
                button_name = "확인",
                text="3월 카드 지출",
                NetAssetDataList = spendList,
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 800, showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}