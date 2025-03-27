package com.kuit.kuit5.ui.asset.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.model.AssetQuestionData
import com.kuit.kuit5.ui.asset.component.AssetInfoContainer
import com.kuit.kuit5.ui.asset.component.AssetQuestionContainer

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
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
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
                        tint = Color(color = 0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_gear),
                        contentDescription = "gear icon",
                        tint = Color(color = 0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_bell),
                        contentDescription = "bell icon",
                        tint = Color(color = 0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_stack),
                        contentDescription = "stack icon",
                        tint = Color(color = 0xFF9FA5B0)
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
            Column(modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                    ) {
                        Text(text = "채민지님의 순자산", color = Color.Black, fontSize = 14.sp)
                        Text(
                            text = "1,234,567원",
                            color = Color.Black,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Button(
                        modifier = Modifier
                            .size(58.dp, 38.dp)
                            .align(Alignment.CenterEnd),
                        contentPadding = PaddingValues(0.dp),
                        shape = RoundedCornerShape(6.dp),
                        onClick = {
                            // TODO: 버튼 액션 추가하기
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF3F4F6),
                            contentColor = Color(0xFF666668),

                            )
                    ) {
                        Text(text = "분석", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                    }
                }

                Spacer(modifier = Modifier.size(14.dp))

                // Tmap 광고
                Card(
                    modifier = Modifier,
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFF3F4F6),
                    ),
                    content = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_assets_tmap),
                                contentDescription = "tmap",
                                modifier = Modifier.size(42.dp)
                            )
                            Spacer(modifier = Modifier.size(16.dp))
                            Column {
                                Text(
                                    text = "티맵 대리 1만원 쿠폰 받으세요",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                                Text(
                                    text = "3월 한정 선착순 1만명 혜택",
                                    fontSize = 10.sp,
                                    color = Color(0xFF666668)
                                )
                            }
                        }
                    }
                )
                Spacer(modifier = Modifier.size(22.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "계좌·현금",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "1,234,567원",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF666668)
                        )
                        Spacer(modifier = Modifier.size(4.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_asset_right_arrow),
                            contentDescription = "right arrow",
                            tint = Color(0xFF666668)
                        )
                    }
                }

                Spacer(modifier = Modifier.size(30.dp))
                // 입출금
                AssetInfoContainer(
                    title = "입출금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "234,567원"
                        ),
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "234,567원"
                        ),
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "234,567원"
                        )
                    ),
                    totalMoney = "703,701원"
                )
                Spacer(modifier = Modifier.size(28.dp))
                // 예금
                AssetInfoContainer(
                    title = "예금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "정기예금",
                            value = "1,000,000원"
                        ),
                    ),
                    totalMoney = "1,000,000원"
                )

                Spacer(modifier = Modifier.size(28.dp))
                // 현금
                AssetInfoContainer(
                    title = "현금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_shinhan_icon,
                            name = "현금",
                            value = "0원"
                        ),
                    ),
                    totalMoney = "0원"
                )

            }

            Spacer(modifier = Modifier.size(22.dp))
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = Modifier.size(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "신용",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "750점",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF666668)
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_right_arrow),
                        contentDescription = "right arrow",
                        tint = Color(0xFF666668)
                    )
                }
            }
            Spacer(modifier = Modifier.size(24.dp))
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = Modifier.size(24.dp))
            Row(modifier = Modifier.padding(horizontal = 20.dp)) {
                AssetQuestionContainer(
                    modifier = Modifier, title = "카드", questionDataList = listOf(
                        AssetQuestionData(
                            icon = R.drawable.img_asset_card_icon,
                            question = "내게 맞는 추천카드는?"
                        )
                    )
                )
            }
            Spacer(modifier = Modifier.height(22.dp))
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(modifier = Modifier.padding(horizontal = 20.dp)) {
                AssetQuestionContainer(
                    modifier = Modifier,
                    title = "대출",
                    questionDataList = listOf(
                        AssetQuestionData(
                            icon = R.drawable.img_asset_loan_icon,
                            question = "내 최저 금리는?"
                        )
                    )
                )
            }
            Spacer(modifier = Modifier.height(22.dp))
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(modifier = Modifier.padding(horizontal = 20.dp)) {
                AssetQuestionContainer(
                    modifier = Modifier,
                    title = "보험",
                    questionDataList = listOf(
                        AssetQuestionData(
                            icon = R.drawable.img_asset_insurance_icon,
                            question = "보험료 낸 만큼 보장받을 수 있을까?",
                        )
                    )
                )
            }
            Spacer(modifier = Modifier.height(22.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF3F4F6))
                .padding(vertical = 32.dp)
                ,

                horizontalArrangement = Arrangement.Center,
                ) {
                Text(text = "편집하기", color = Color(0xFF666668), fontSize = 14.sp, fontWeight = FontWeight.Medium)
                Spacer(Modifier.width(46.dp))
                VerticalDivider(
                    modifier = Modifier
                        .height(22.dp)
                        .width(1.dp)
                        .background(Color(0xFF9FA5B0))
                )
                Spacer(Modifier.width(46.dp))
                Text(text = "추가하기", color = Color(0xFF666668), fontSize = 14.sp, fontWeight = FontWeight.Medium)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun AssetScreenPreview() {
    AssetsScreen()
}