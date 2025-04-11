package com.kuit.kuit5.ui.asset.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import com.kuit.kuit5.R
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.ui.asset.component.AssetInfoContainer
import com.kuit.kuit5.ui.asset.component.FinanceItem
import androidx.compose.foundation.layout.width
import androidx.compose.ui.text.style.TextDecoration
import com.kuit.kuit5.component.grayButton
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssetsScreen(modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White
            ),
            title = {
                Text(
                    text = "자산",
                    color = colors.black,
                    style = typography.head_01_B_24
                )
            },
            actions = {
                Row(
                    modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_money),
                        contentDescription = "money icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_gear),
                        contentDescription = "gear icon",
                        tint = Color(0xFF9FA5B0)
                    )
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
        // TopAppBar 제외한 화면
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollState)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        "쿠잇님의 순자산",
                        color = colors.black,
                        style = typography.head_03_R_14
                    )
                    Text(
                        "1,234,567원",
                        color = colors.black,
                        style = typography.head_01_B_24
                    )
                }
                grayButton(
                    value = "분석"
                )
            }
            Spacer(modifier = Modifier.size(14.dp))
            Card(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF3F4F6),
                ),
                content = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 16.dp)
                    ) {
                        Image(
                            modifier = Modifier
                                .size(42.dp),
                            painter = painterResource(id = R.drawable.img_assets_tmap),
                            contentDescription = "tmap"
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        Column {
                            Text(
                                "티맵 대리 1만원 쿠폰 받으세요",
                                color = colors.black,
                                style = typography.head_03_SB_16
                            )
                            Spacer(modifier = Modifier.size(10.dp))
                            Text(
                                "3월 한정 선착순 1만명 혜택",
                                color = Color(0xFF666668),
                                style = typography.caption_01_R_10
                            )
                        }
                    }
                }
            )
            Spacer(modifier = Modifier.size(22.dp))
            //계좌, 현금
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "계좌 · 현금",
                    color = colors.black,
                    style = typography.head_03_B_16
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "1,234,567원",
                        color = Color(0xFF666668),
                        style = typography.body_01_M_14
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow",
                    )
                }

            }
            Spacer(modifier = Modifier.size(30.dp))
            //입출금
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                AssetInfoContainer(
                    modifier = modifier,
                    title = "입출금",
                    value = "234,567원",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "234,567원"
                        ),
                    )
                )
            }
            Spacer(modifier = Modifier.size(28.dp))
            //예금
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                AssetInfoContainer(
                    modifier = Modifier,
                    title = "예금",
                    value = "1,000,000원",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "정기예금",
                            value = "1,000,000원"
                        ),
                    )
                )
            }
            Spacer(modifier = Modifier.size(28.dp))
            //현금
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                AssetInfoContainer(
                    modifier = Modifier,
                    title = "현금",
                    value = "0원",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_cash_icon,
                            name = "현금",
                            value = "0원"
                        ),
                    )
                )
            }
            Spacer(modifier = Modifier.size(22.dp))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = Modifier.size(24.dp))
            //뱅셀머니
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier,
                        text = "페이머니",
                        color = colors.black,
                        style = typography.head_03_B_16
                    )
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "0원",
                        color = colors.gray500,
                        style = typography.body_01_M_14
                    )
                }
                Spacer(modifier = Modifier.size(30.dp))
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
                            painter = painterResource(id = R.drawable.img_sell_icon),
                            contentDescription = "asset icon",
                            tint = Color.Unspecified
                        )
                        Text(
                            modifier = Modifier.padding(10.dp),
                            text = "뱅샐머니",
                            color = colors.gray500,
                            style = typography.head_03_R_14
                        )
                    }
                    Column() {
                        Text(
                            modifier = Modifier.padding(10.dp),
                            text = "0원",
                            color = colors.black,
                            style = typography.body_01_M_14
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.size(22.dp))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = Modifier.size(24.dp))
            //신용
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "신용",
                    color = colors.black,
                    style = typography.head_03_B_16
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "750점",
                        color = Color(0xFF666668),
                        style = typography.head_04_SB_14
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow",
                    )
                }

            }
            Spacer(modifier = Modifier.size(30.dp))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = Modifier.size(24.dp))
            //카드 대출 보험
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                FinanceItem(
                    title = "카드",
                    value = "내게 맞는 추천 카드는?",
                    icon = R.drawable.img_card_icon,
                )
                Spacer(modifier = Modifier.size(30.dp))
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(0xFFF3F4F6))
                )
                Spacer(modifier = Modifier.size(24.dp))
                FinanceItem(
                    title = "대출",
                    value = "내 최저 금리는?",
                    icon = R.drawable.img_loan_icon,
                )
                Spacer(modifier = Modifier.size(30.dp))
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(0xFFF3F4F6))
                )
                Spacer(modifier = Modifier.size(24.dp))
                FinanceItem(
                    title = "보험",
                    value = "보험료 낸 만큼 보장받을 수 있을까?",
                    icon = R.drawable.img_insurance_icon,
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            //편집하기 추가히기
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F6F8))
                    .height(78.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "편집하기",
                    color = colors.gray500,
                    style = typography.body_01_M_14
                )
                Spacer(modifier = Modifier.width(16.dp))
                Box(
                    modifier = Modifier
                        .height(22.dp)
                        .width(1.dp)
                        .background(Color(0xFF9FA5B0))
                        .padding(horizontal = 16.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(horizontal = 16.dp),
                    text = "추가하기",
                    color = colors.gray500,
                    style = typography.body_01_M_14
                )
            }
        }
    }
}

@Preview
@Composable
private fun AssetsScreenPreview() {
    AssetsScreen()
}