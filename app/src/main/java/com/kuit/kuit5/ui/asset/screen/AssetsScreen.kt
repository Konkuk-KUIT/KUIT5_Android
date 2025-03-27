package com.kuit.kuit5.ui.asset.screen

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.model.AssetData2
import com.kuit.kuit5.ui.asset.component.AssetInfoContainer
import com.kuit.kuit5.ui.asset.component.AssetInfoItem
import com.kuit.kuit5.ui.asset.component.AssetInfoItem2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssetsScreen(modifier: Modifier = Modifier) {

    var scrollState = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
    ) {
        TopAppBar(
            modifier = Modifier.
            fillMaxWidth(),
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
                    modifier = Modifier.
                    padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_money),
                        contentDescription = "Money Icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_gear),
                        contentDescription = "Gear Icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_bell),
                        contentDescription = "Bell Icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_stack),
                        contentDescription = "Stack Icon",
                        tint = Color(0xFF9FA5B0)
                    )
                }
            }
        )
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
                        text = "쿠잇님의 총자산",
                        fontSize = 14.sp
                    )
                    Text(
                        text = "1234567원",
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
                        // TODO: 버튼액션 추가
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF3F4F6),
                        contentColor = Color(0xFF666668)
                    )
                ) {
                    Text(
                        text = "분석"
                    )
                }

            }
            Spacer(modifier = Modifier.size(14.dp))
            Card(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF3F4F6)
                ),
                content = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                horizontal = 16.dp,
                                vertical = 16.dp
                            ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            modifier = Modifier.size(40.dp),
                            painter = painterResource(id = R.drawable.img_assets_tmap),
                            contentDescription = "T map"
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "티맵 대리 1만원 쿠폰 받으세요",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                modifier = modifier
                                    .padding(top = 10.dp),
                                text = "3월 한정 선착순 1만명 혜택",
                                fontSize = 10.sp,
                                color = Color(0xFF666668)
                            )
                        }
                    }

                }
            )
            Spacer(modifier = Modifier.size(22.dp));

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "계좌 · 현금",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "1234567원",
                        color = Color(0xFF666668)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic__assets_pointer),
                        contentDescription = "pointer"
                    )
                }
            }
            //입출금

            Spacer(modifier = Modifier.size(30.dp));

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                verticalArrangement = Arrangement.spacedBy(28.dp)
            ) {
                AssetInfoContainer(
                    title = "입출금",
                    asset = AssetData(
                        icon = R.drawable.img_assets_kakaobank,
                        name = "입출금통장",
                        value = "234,567원"
                    )
                    /*assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_assets_kakaobank,
                            name = "입출금통장",
                            value = "1,000,000원"
                        ),
                        AssetData(
                            icon = R.drawable.img_assets_kakaobank,
                            name = "정기예금",
                            value = "1,000,000원"
                        ),
                        AssetData(
                            icon = R.drawable.img_assets_sinhan,
                            name = "현금",
                            value = "1,000,000원"
                        ),

                    ) */
                )
                AssetInfoContainer(
                    title = "예금",
                    asset = AssetData(
                        icon = R.drawable.img_assets_kakaobank,
                        name = "정기예금",
                        value = "1,000,000원"
                    )
                )
                AssetInfoContainer(
                    title = "현금",
                    asset = AssetData(
                        icon = R.drawable.img_assets_sinhan,
                        name = "현금",
                        value = "0원"
                    )
                )
            }
            Spacer(modifier = Modifier.size(22.dp));
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 24.dp,
                        bottom = 30.dp,
                        start = 20.dp,
                        end = 20.dp
                    ),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "페이머니",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "0원",
                    color = Color(0xFF666668),
                    fontSize = 14.sp
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                AssetInfoItem(
                    asset = AssetData(
                        icon = R.drawable.img_assets_banksell,
                        name = "뱅셀머니",
                        value = "0원"
                    )
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 22.dp,
                        bottom = 24.dp
                    )
                    .height(10.dp)
                    .background(color = Color(0xFFF3F4F6))
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "신용",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "750점",
                        fontSize = 14.sp,
                        color = Color(0xFF666668),
                        fontWeight = FontWeight.Bold
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic__assets_pointer),
                        contentDescription = "pointer"
                    )
                }

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                AssetInfoItem2(
                    asset = AssetData2(
                        icon2 = R.drawable.img_assets_card,
                        name2 = "내게 맞는 추천 카드는?",
                        topic = "카드"
                    )
                )
                AssetInfoItem2(
                    asset = AssetData2(
                        icon2 = R.drawable.img_assets_won,
                        name2 = "내 최저 금리는?",
                        topic = "대출"
                    )
                )
                AssetInfoItem2(
                    asset = AssetData2(
                        icon2 = R.drawable.img_assets_shield,
                        name2 = "보험료 낸 만큼 보장받을 수 있을까?",
                        topic = "보험"
                    )
                )

            }

            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .height(78.dp)
                    .background(color = Color(0xFFFF3F4F6))
            ) {
                Row(
                    modifier = modifier
                        .fillMaxSize()
                        .padding(horizontal = 84.dp,),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "편집하기",
                        fontSize = 14.sp,
                        color = Color((0xFF666668))
                    )
                    VerticalDivider(
                        modifier = modifier
                            .padding(
                                start = 45.dp,
                                end = 45.dp)
                            .height(24.dp)
                            .width(2.dp),
                        color = Color(0xFF9FA5B0)
                    )
                    Text(
                        text = "추가하기",
                    fontSize = 14.sp,
                    color = Color((0xFF666668))
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AssetsScreenPreview() {
    AssetsScreen()
}
