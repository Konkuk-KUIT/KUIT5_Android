package com.kuit.kuit5.ui.home.screen

import android.view.RoundedCorner
import com.kuit.kuit5.R

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
import com.kuit.kuit5.ui.home_component.HomeBannerItem
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.kuit.kuit5.ui.home_component.Add_HomeAccountCardDetail
import com.kuit.kuit5.ui.home_component.AssetAccountCardDetail
import com.kuit.kuit5.ui.home_component.BankSaladGrayButton
import com.kuit.kuit5.ui.home_component.EventPackage
import com.kuit.kuit5.ui.home_component.HomeAccountCardDetail
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
        //TopAppBar
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors =
                TopAppBarDefaults.topAppBarColors(
                    containerColor = colors.gray100
                ),
            title = {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(R.drawable.ic_home_banksalad),
                    contentDescription = "banksalad Icon",
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
                        contentDescription = "home stack icon",
                        tint = Color.Unspecified

                    )

                }
            }
        )
        //TopAppBar 제외 나머지 영역
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollState)
        ) {
            HomeBannerItem()
            Spacer(modifier = Modifier.height(24.dp))
        }
        //Item package
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            EventPackage(img = R.drawable.ic_home_pager_mail, text = "용돈벌기")
            EventPackage(img = R.drawable.ic_home_pager_heart, text = "보험리모델링")
            EventPackage(img = R.drawable.ic_home_pager_money, text = "대츨찾기")
            EventPackage(img = R.drawable.ic_home_pager_card, text = "카드이벤트")
        }
        Spacer(modifier = Modifier.height(24.dp))
        //입출금 계좌
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            colors = CardDefaults.cardColors(containerColor = colors.white),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            )
            {
                Spacer(modifier = Modifier.height(24.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column() {
                        Text(
                            text = "입출금 계좌",
                            style = typography.head_03_R_16,
                            color = colors.gray500
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = 234567.toDecimalFormat() + "원", style = typography.head_02_B_20)

                        BankSaladGrayButton(text = "송금")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(text = "어제보다", style = typography.body_02_R_12, color = colors.gray400)
                    }
                }

                Spacer(modifier = Modifier.height(22.dp))
                HomeAccountCardDetail(
                    icon = R.drawable.kakao_bank,
                    accountValue = 234567,
                    accountCategory = "입출금통장",
                    lossvalue = 3300
                )
                Spacer(modifier = Modifier.height(24.dp))
                Add_HomeAccountCardDetail(
                    text = "목표를 설정하고 종잣돈을 모아보세요",
                    height = 56,
                    icon = R.drawable.ic_home_pig,
                    color = colors.apricot
                )
                 Spacer(modifier = Modifier.height(24.dp))

            }
        }
            //순자산
            Spacer(modifier=Modifier.height(24.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(containerColor = colors.white),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "순자산",
                                style = typography.head_03_R_16,
                                color = colors.gray500
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = 1234567.toDecimalFormat() + "원",
                                style = typography.head_02_B_20
                            )
                        }
                        BankSaladGrayButton(text = "송금")

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = buildAnnotatedString {
                                append("지난 방문일보다 ")
                                withStyle(style = SpanStyle(color = colors.green)) {
                                    append(4500.toDecimalFormat() + "원")
                                }
                                append(" 줄었어요")
                            },
                            style = typography.body_02_SB_12,
                            color = colors.black)
                    }
                    Spacer(modifier=Modifier.height(28.dp))
                    AssetAccountCardDetail(
                        icon = R.drawable.kakao_bank,
                        accountValue = 234567,
                        accountCategory = "계좌•현금",
                        lossvalue = 4500
                    )
                    Spacer(modifier=Modifier.height(24.dp))
                    AssetAccountCardDetail(
                        icon = R.drawable.kakao_bank,
                        accountValue = 1000000,
                        accountCategory = "예적금",
                        lossvalue = 10000
                    )
                    Spacer(modifier=Modifier.height(20.dp))
                    Add_HomeAccountCardDetail(
                        text = "쌓인 예적금 이자 확인하고 진단받기",
                        height = 40,
                        color =colors.gray200
                    )
                    Spacer(modifier=Modifier.height(24.dp))

                }

            }
        //이번 달 지출
        Spacer(modifier=Modifier.height(24.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            colors = CardDefaults.cardColors(containerColor = colors.white),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Spacer(modifier = Modifier.height(24.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "이번 달 지출",
                            style = typography.head_03_R_16,
                            color = colors.gray500
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = 1234567.toDecimalFormat() + "원",
                            style = typography.head_02_B_20
                        )
                    }
                    BankSaladGrayButton(text = "확인")

                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = buildAnnotatedString {
                            append("지난 같은 기간보다 ")
                            withStyle(style = SpanStyle(color = colors.green)) {
                                append(53000.toDecimalFormat() + "원")
                            }
                            append(" 덜 썻어요")
                        },
                        style = typography.body_02_SB_12,
                        color = colors.black)
                }
                Spacer(modifier=Modifier.height(28.dp))
                AssetAccountCardDetail(
                    icon = R.drawable.ic_home_won,
                    accountValue = 215000,
                    accountCategory = "오늘 지출"

                )
                Spacer(modifier=Modifier.height(24.dp))
                AssetAccountCardDetail(
                    icon = R.drawable.ic_home_won,
                    accountValue = 234567,
                    accountCategory = "어제 지출"

                )
                Spacer(modifier=Modifier.height(20.dp))
                Add_HomeAccountCardDetail(
                    text = "3월 카드 지출",
                    height = 40,
                    color =colors.gray200
                )
                Spacer(modifier=Modifier.height(24.dp))

            }

        }

    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 1350)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
