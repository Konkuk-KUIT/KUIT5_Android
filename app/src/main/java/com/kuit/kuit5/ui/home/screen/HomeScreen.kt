package com.kuit.kuit5.ui.home.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AccountDetailItem
import com.kuit.kuit5.model.BannerItem
import com.kuit.kuit5.model.EventItem
import com.kuit.kuit5.ui.home.component.HomeAccountCardDetail
import com.kuit.kuit5.ui.home.component.HomeAccountCardItem
import com.kuit.kuit5.ui.home.component.HomeAssetsCardDetail
import com.kuit.kuit5.ui.home.component.HomeAssetsDiagnosisCard
import com.kuit.kuit5.ui.home.component.HomeBannerItem
import com.kuit.kuit5.ui.home.component.HomeEventItem
import com.kuit.kuit5.ui.home.component.HomeExpenseCard
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.ui.theme.Gray400

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val scrollstate = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .verticalScroll(scrollstate)
    ) {
        //TopAppBar
        TopAppBar(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent), title = {},
            navigationIcon = {
                Row(modifier = modifier) {
                    Icon(
                        painter = painterResource(id = R.drawable.img_home_face),
                        contentDescription = "face icon",
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .padding(20.dp)
                            .size(24.dp)
                    )
                }

            },
            actions = {
                Row(modifier = modifier) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_bell),
                        contentDescription = "bell icon",
                        tint = Color(0xFF9FA5B0),
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Spacer(modifier = Modifier.size(16.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_stack),
                        contentDescription = "bell icon",
                        tint = Color(0xFF9FA5B0),
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Spacer(modifier = Modifier.size(13.dp))
                }
            }
        )
        //HomeBannerItem
        val hBannerItem = BannerItem(
            icon = R.drawable.img_home_money,
            name = "3월에만 받을 수 있는",
            value = "최대 17만원 용돈받기"
        )

        HomeBannerItem(asset = hBannerItem)
        Spacer(modifier = Modifier.size(13.dp))

        //HomeEventItem
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            val inmoneyItem = EventItem(
                icon = R.drawable.img_home_inmoney,
                name = "용돈벌기",
            )

            HomeEventItem(asset = inmoneyItem)

            Spacer(modifier = Modifier.size(28.dp))

            val reheartItem = EventItem(
                icon = R.drawable.img_home_reheart,
                name = "보험리모델링",
            )

            HomeEventItem(asset = reheartItem)

            Spacer(modifier = Modifier.size(28.dp))

            val pouchtItem = EventItem(
                icon = R.drawable.img_home_pouch,
                name = "대출찾기",
            )

            HomeEventItem(asset = pouchtItem)

            Spacer(modifier = Modifier.size(28.dp))

            val cardItem = EventItem(
                icon = R.drawable.img_home_card,
                name = "카드이벤트",
            )

            HomeEventItem(asset = cardItem)


        }
        Spacer(modifier = Modifier.size(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {

            HomeAccountCardItem(
                title = "입출금 계좌",
                amount = "234,567원",
                buttonTitle = "송금"
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        "어제보다",
                        style = typography.body_02_R_12,
                        color = Gray400
                    )
                }
                val firstcardItem = AccountDetailItem(
                    amountText = "234,567원",
                    accountType = "입출금통장",
                    changeText = "3,300원"
                )

                HomeAccountCardDetail(item = firstcardItem)
                Spacer(modifier = Modifier.height(8.dp))
                // HomeAccountGoalCard()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.apricot) // 연한 오렌지색 배경
                        .padding(horizontal = 12.dp)
                        .height(56.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.img_home_pig), // 돼지 아이콘
                        contentDescription = "저금 아이콘",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(28.dp)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(
                        text = "목표를 설정하고 종잣돈을 모아보세요",
                        style = typography.body_02_R_12,
                        //modifier = Modifier.weight(1f)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_right_arrow),
                        contentDescription = null,
                        tint = Gray400
                    )
                }
            }
        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(16.dp)
                .background(Color(0xFFF3F4F6))

        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            HomeAccountCardItem(
                title = "순자산",
                amount = "1,234,567원",
                buttonTitle = "송금"
            ) {
                Row {
                    Text(
                        text = "지난 방문일보다 ",
                        style = typography.body_01_R_14,
                        color = colors.black
                    )
                    Text(
                        text = "4,500원",
                        style = typography.body_01_R_14,
                        color = colors.green
                    )

                    Text(
                        text = " 줄었어요",
                        style = typography.body_01_R_14,
                        color = colors.black
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))


                val firstassetItem = AccountDetailItem(
                    accountType = "계좌 · 현금",
                    amountText = "234,567원",
                    changeText = "4,500원"
                )
                HomeAssetsCardDetail(item = firstassetItem)

                Spacer(modifier = Modifier.height(8.dp))


                val secondassetItem = AccountDetailItem(
                    accountType = "예적금",
                    amountText = "1,000,000원",
                    changeText = "10,000원"
                )
                HomeAssetsCardDetail(item = secondassetItem)
                Spacer(modifier = Modifier.height(8.dp))
                HomeAssetsDiagnosisCard(text = "쌓인 예적금 이자 확인하고 진단받기")
            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(16.dp)
                .background(Color(0xFFF3F4F6))

        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp) // 좌우 20dp
        ) {
            HomeAccountCardItem(
                title = "이번 달 지출",
                amount = "198,000원",
                buttonTitle = "확인"
            ) {
                Row {
                    Text(
                        text = "지난달 같은 기간보다 ",
                        style = typography.body_01_R_14,
                        color = colors.black
                    )
                    Text(
                        text = "53,000원",
                        style = typography.body_01_M_14,
                        color = colors.green
                    )

                    Text(
                        text = " 덜 썼어요",
                        style = typography.body_01_R_14,
                        color = colors.black

                    )
                }

                Spacer(modifier = Modifier.height(8.dp))
                HomeExpenseCard(
                    title = "오늘 지출",
                    amount = "21,500원"
                )
                Spacer(modifier = Modifier.height(8.dp))
                HomeExpenseCard(
                    title = "어제 지출",
                    amount = "3,500원"
                )
                Spacer(modifier = Modifier.height(8.dp))
                HomeAssetsDiagnosisCard(text = "3월 카드 지출")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true, heightDp = 3000)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}