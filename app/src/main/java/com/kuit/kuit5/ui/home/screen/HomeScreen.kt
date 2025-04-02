package com.kuit.kuit5.ui.home.screen

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.component.BankSaladGrayButton
import com.kuit.kuit5.ui.home.component.AccountInfoInAccountCardContainer
import com.kuit.kuit5.ui.home.component.AccountInfoInAssetCardContainer
import com.kuit.kuit5.ui.home.component.AdditionalCard
import com.kuit.kuit5.ui.home.component.DailySpendInfoInMonthlySpendCardContainer
import com.kuit.kuit5.ui.home.component.EventItem
import com.kuit.kuit5.ui.home.component.HorizontalBannerCard
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
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
        // TopAppBar
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.topAppBarColors(containerColor = colors.gray100),
            title = {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(R.drawable.img_home_banksaladlogo),
                    contentDescription = "banksalad logo",
                    tint = Color.Unspecified
                )
            },
            actions = {
                Row(
                    modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_home_bell),
                        contentDescription = "home bell icon",
                        tint = Color.Unspecified
                    )
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_home_stack),
                        contentDescription = "home bell icon",
                        tint = Color.Unspecified
                    )
                }
            }
        )
        // TopAppBar 제외 나머지 영역
        Column(
            modifier = Modifier.fillMaxWidth().verticalScroll(state = scrollState)
        ) {
            // horizontalPager
            HorizontalBannerCard()
            Spacer(modifier = Modifier.height(24.dp))
            // Item Event
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                EventItem(img = R.drawable.img_home_allowance, text = "용돈벌기")
                EventItem(img = R.drawable.img_home_insuranceremodeling, text = "보험리모델링")
                EventItem(img = R.drawable.img_home_findloan, text = "대출찾기")
                EventItem(img = R.drawable.img_home_cardevent, text = "카드이벤트")
            }
            Spacer(modifier = Modifier.height(24.dp))
            // 입출금 계좌
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(containerColor = colors.white),
                shape = RoundedCornerShape(16.dp),
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)
                ) {
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(text = "입출금 계좌", style = typography.head_03_R_16, color = colors.gray500)
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = 234567.toDecimalFormat()+"원", style = typography.head_02_B_20)
                        }
                        BankSaladGrayButton(text = "송금")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(text = "어제보다", style = typography.body_02_R_12, color = colors.gray400)
                    }
                    Spacer(modifier = Modifier.height(22.dp))
                    AccountInfoInAccountCardContainer(
                        icon = R.drawable.img_kakao_icon,
                        accountValue = 234567,
                        accountCategory = "입출금통장",
                        isSurplus = false,
                        profitOrLossValue = 3300
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    AdditionalCard(
                        text = "목표를 설정하고 종잣돈을 모아보세요",
                        height = 56,
                        icon = R.drawable.img_home_pig,
                        color = colors.apricot
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            // 순자산 카드
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(containerColor = colors.white),
                shape = RoundedCornerShape(16.dp),
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)
                ) {
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(text = "순자산", style = typography.head_03_R_16, color = colors.gray500)
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = 1234567.toDecimalFormat()+"원", style = typography.head_02_B_20)
                        }
                        BankSaladGrayButton(text = "송금")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = buildAnnotatedString {
                                append("지난 방문일보다 ")
                                withStyle(style = SpanStyle(color = colors.green)) {
                                    append(4500.toDecimalFormat()+"원")
                                }
                                append(" 줄었어요")
                            },
                            style = typography.body_02_SB_12,
                            color = colors.black
                        )
                    }
                    Spacer(modifier = Modifier.height(28.dp))
                    AccountInfoInAssetCardContainer(
                        icon = R.drawable.img_kakao_icon,
                        accountValue = 234567,
                        accountCategory = "계좌 · 현금",
                        isSurplus = true,
                        profitOrLossValue = 4500
                    )
                    AccountInfoInAssetCardContainer(
                        icon = R.drawable.img_kakao_icon,
                        accountValue = 1000000,
                        accountCategory = "예적금",
                        isSurplus = false,
                        profitOrLossValue = 10000
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    AdditionalCard(text = "쌓인 예적금 이자 확인하고 진단받기")
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            // 이번 달 지출
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(containerColor = colors.white),
                shape = RoundedCornerShape(16.dp),
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)
                ) {
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(text = "이번 달 지출", style = typography.head_03_R_16, color = colors.gray500)
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = 198000.toDecimalFormat()+"원", style = typography.head_02_B_20)
                        }
                        BankSaladGrayButton(text = "확인")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = buildAnnotatedString {
                                append("지난달 같은 기간보다 ")
                                withStyle(style = SpanStyle(color = colors.green)) {
                                    append(53000.toDecimalFormat()+"원")
                                }
                                append(" 덜 썼어요")
                            },
                            style = typography.body_02_SB_12,
                            color = colors.black
                        )
                    }
                    Spacer(modifier = Modifier.height(28.dp))
                    DailySpendInfoInMonthlySpendCardContainer(
                        icon = R.drawable.img_home_spendicon,
                        accountValue = 21500,
                        accountCategory = "오늘 지출"
                    )
                    DailySpendInfoInMonthlySpendCardContainer(
                        icon = R.drawable.img_home_spendicon,
                        accountValue = 3500,
                        accountCategory = "어제 지출"
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    AdditionalCard(text = "3월 카드 지출")
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true, heightDp = 2000)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}





















