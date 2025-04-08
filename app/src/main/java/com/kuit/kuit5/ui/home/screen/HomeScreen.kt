package com.kuit.kuit5.ui.home.screen

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import com.kuit.kuit5.component.GrayButton
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.model.HomeContentData
import com.kuit.kuit5.ui.asset.component.FinanceItem
import com.kuit.kuit5.ui.home.component.HomeQuickMenuItem
import com.kuit.kuit5.ui.home.component.HomeContentContainer

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        //TopAppBar
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = colors.white
            ),
            title = {
                Image(
                    modifier = Modifier
                        .padding(4.dp)
                        .size(24.dp),
                    painter = painterResource(id = R.drawable.img_home_icon),
                    contentDescription = "home icon",
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
        //TopAppBar 제외
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollState)
        ) {
            //17만원 용돈받기 창
            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(colors.white)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            modifier = Modifier
                                .padding(start = 16.dp, top = 14.dp, bottom = 10.dp),
                            text = "3월에만 받을 수 있는",
                            color = colors.gray500,
                            style = typography.caption_01_R_10
                        )
                        Row(
                            modifier = Modifier
                                .padding(start = 16.dp, bottom = 14.dp),
                        ) {
                            Text(
                                "최대 17만원 용돈받기",
                                color = colors.black,
                                style = typography.head_04_SB_14
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                                contentDescription = "right arrow",
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp, bottom = 10.dp, end = 20.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(width = 50.dp, height = 40.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_greencash_icon),
                                contentDescription = "greencash icon",
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .size(40.dp)
                            )
                            Box(
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .background(
                                        colors.gray400.copy(alpha = 0.8f),
                                        shape = RoundedCornerShape(9.dp)
                                    )
                                    .size(width = 32.dp, height = 18.dp)
                                    .padding(6.dp, 4.dp)
                            ) {
                                Text(
                                    text = "1 / 5",
                                    color = Color.White,
                                    style = typography.caption_01_R_10
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.size(24.dp))

            //용돈 보험 대출 카드
            Row(
                modifier = Modifier
                    .padding(start = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                HomeQuickMenuItem(
                    icon = R.drawable.img_q1_icon,
                    value = "용돈벌기"
                )
                HomeQuickMenuItem(
                    icon = R.drawable.img_q2_icon,
                    value = "보험리모델링"
                )
                HomeQuickMenuItem(
                    icon = R.drawable.img_q3_icon,
                    value = "대출찾기"
                )
                HomeQuickMenuItem(
                    icon = R.drawable.img_q4_icon,
                    value = "카드이벤트"
                )
            }

            //입출금 계좌
            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 24.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(colors.white)
            ) {
                Column(
                    modifier = Modifier
                        .padding(vertical = 24.dp, horizontal = 20.dp)
                )
                {
                    Row() {
                        Column() {
                            Text(
                                "입출금 계좌",
                                color = colors.gray500,
                                style = typography.head_03_R_16
                            )
                            Text(
                                modifier = Modifier.padding(top = 10.dp),
                                text = 234567.toDecimalFormat() + "원",
                                color = Color.Black,
                                style = typography.head_02_B_20
                            )
                        }
                        GrayButton(
                            value = "송금"
                        )
                    }
                    Spacer(modifier = Modifier.size(16.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = "어제보다",
                            color = colors.gray400,
                            style = typography.body_02_R_12
                        )
                    }
                    Spacer(modifier = Modifier.size(22.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(30.dp),
                                painter = painterResource(id = R.drawable.img_kakao_icon),
                                contentDescription = "asset icon",
                                tint = Color.Unspecified
                            )
                            Column(
                                modifier = Modifier.padding(start = 10.dp)
                            ) {
                                Text(
                                    text = 234567.toDecimalFormat() + "원",
                                    color = colors.black,
                                    style = typography.body_01_M_14
                                )
                                Spacer(modifier = Modifier.size(4.dp))
                                Text(
                                    text = "입출금 통장",
                                    color = colors.gray400,
                                    style = typography.body_02_R_12
                                )
                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = R.drawable.img_bluetriangle_icon),
                                contentDescription = "greencash icon",
                                modifier = Modifier
                                    .size(width = 16.dp, height = 10.dp)
                            )
                            Text(
                                text = 3300.toDecimalFormat() + "원",
                                color = colors.blue,
                                style = typography.body_01_M_14
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                                contentDescription = "right arrow",
                            )
                        }
                    }
                    Spacer(modifier = Modifier.size(24.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.apricot)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_pig_icon),
                                    contentDescription = "pig",
                                    modifier = Modifier
                                        .size(28.dp)
                                )
                                Text(
                                    text = "목표를 설정하고 종잣돈을 모아보세요",
                                    color = colors.black,
                                    style = typography.body_02_R_12,
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                )
                            }
                            Image(
                                painter = painterResource(id = R.drawable.img_right_arrow_gray),
                                contentDescription = "right_arrow_gray",
                                modifier = Modifier
                                    .size(12.dp)
                            )
                        }
                    }
                }
            }

            //순자산
            HomeContentContainer(
                modifier = Modifier.fillMaxWidth(),
                title = "순자산",
                value = 1234567,
                valueContent = buildAnnotatedString {
                    append("지난 방문일보다 ")
                    pushStyle(SpanStyle(color = colors.green))
                    append("4500원")
                    pop()
                    append(" 줄었어요")
                },
                bottomValue = "쌓인 예적금 이자 확인하고 진단받기",
                grayButton = "송금",
                homeContentList = listOf(
                    HomeContentData(
                        icon = R.drawable.img_kakao_icon,
                        value = 234567,
                        title = "계좌 · 현금",
                        changeValue = 4500,
                        textBoolean = true
                    ),
                    HomeContentData(
                        icon = R.drawable.img_kakao_icon,
                        value = 1000000,
                        title = "예적금",
                        changeValue = 10000,
                        textBoolean = false
                    )
                )
            )

            Spacer(modifier = Modifier.size(16.dp))

            //이번 달 지출
            HomeContentContainer(
                modifier = Modifier.fillMaxWidth(),
                title = "이번 달 지출",
                value = 198000,
                valueContent = buildAnnotatedString {
                    append("지난달 같은 기간보다 ")
                    pushStyle(SpanStyle(color = colors.green))
                    append("53,000원")
                    pop()
                    append(" 덜 썼어요")
                },
                bottomValue = "3월 카드 지출",
                grayButton = "확인",
                homeContentList = listOf(
                    HomeContentData(
                        icon = R.drawable.img_won_icon,
                        value = 21500,
                        title = "오늘 지출",
                        changeValue = 0,
                        textBoolean = false
                    ),
                    HomeContentData(
                        icon = R.drawable.img_won_icon,
                        value = 3500,
                        title = "어제 지출",
                        changeValue = 0,
                        textBoolean = false
                    )
                )
            )
        }
    }
}
