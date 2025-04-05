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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.ui.asset.component.AssetCheckContainer
import com.kuit.kuit5.ui.asset.component.AssetInfoContainer

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
            modifier = modifier.fillMaxWidth(),
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
                    modifier = modifier.padding(20.dp),
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
            modifier = modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollState)
        ) {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Column(
                    modifier = modifier
                ) {
                    Text(
                        text = "쿠잇님의 순자산"
                    )
                    Text(
                        text = "1,234,567원",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Button(
                    modifier = modifier
                        .size(58.dp, 38.dp)
                        .align(Alignment.CenterEnd),
                    contentPadding = PaddingValues(0.dp),
                    shape = RoundedCornerShape(6.dp),
                    onClick = {
                        // TODO: 버튼 액션 추가하기
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF3F4F6),
                        contentColor = Color(0xFF666668)
                    ),
                ) {
                    Text(
                        text = "분석",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = modifier.size(14.dp))
            // Tmap 광고
            Card(
                modifier = modifier
                    .padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF3F4F6)
                ),
                content = {
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            modifier = modifier.size(42.dp),
                            painter = painterResource(id = R.drawable.img_assets_tmap),
                            contentDescription = "tmap"
                        )
                        Spacer(modifier = modifier.size(16.dp))
                        Column {
                            Text(
                                text = "티맵 대리 1만원 쿠폰 받으세요",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = modifier.size(10.dp))
                            Text(
                                text = "3월 한정 선착순 1만명 혜택",
                                fontSize = 10.sp,
                                color = Color(0xFF666688)

                            )
                        }
                    }
                }
            )
            Spacer(modifier = modifier.size(22.dp))
            // 계좌, 현금
            Row(
                modifier = modifier
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
                        text = "1,234,567원",
                        color = Color(0xFF666688)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow"
                    )
                }
            }
            // 입출금
            Spacer(modifier = modifier.size(30.dp))
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                AssetInfoContainer(
                    modifier = modifier,
                    title = "입출금",
                    balance = "234,567원",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "234,567원"
                        )
                    )
                )
                Spacer(modifier = modifier.size(28.dp))
                AssetInfoContainer(
                    modifier = modifier,
                    title = "예금",
                    balance = "1,000,000원",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "정기예금",
                            value = "1,000,000원"
                        )
                    )
                )
                Spacer(modifier = modifier.size(28.dp))
                AssetInfoContainer(
                    modifier = modifier,
                    title = "현금",
                    balance = "0원",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_assets_sh,
                            name = "현금",
                            value = "0원"
                        )
                    )
                )
            }
            Spacer(modifier = modifier.size(22.dp))
            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = modifier.size(24.dp))
            //페이머니
            Column(
                modifier = modifier
                    .padding(horizontal = 20.dp)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        text = "페이머니",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "0원",
                        color = Color(0xFF666668)
                    )
                }
                Spacer(modifier = modifier.size(30.dp))
                Row(
                    modifier = modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = modifier,
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.img_assets_banksal),
                            contentDescription = "banksal image",
                            tint = Color.Unspecified
                        )
                        Text(text = "뱅샐머니")
                    }
                    Text(text = "0원")
                }
            }
            Spacer(modifier = modifier.size(22.dp))
            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            //신용
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(68.dp)
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "신용",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "750점")
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow",

                        )
                }
            }
            // 확인하기 x3
            Column {
                Spacer(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(0xFFF3F4F6))
                )
                AssetCheckContainer(
                    modifier = modifier,
                    asset = AssetData(
                        icon = R.drawable.img_assets_card,
                        name = "카드",
                        value = "내가 맞는 추천카드는?"
                    )
                )
                Spacer(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(0xFFF3F4F6))
                )
                AssetCheckContainer(
                    modifier = modifier,
                    asset = AssetData(
                        icon = R.drawable.img_assets_house,
                        name = "대출",
                        value = "내 최저 금리는?"
                    )
                )
                Spacer(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(0xFFF3F4F6))
                )
                AssetCheckContainer(
                    modifier = modifier,
                    asset = AssetData(
                        icon = R.drawable.img_assets_shield,
                        name = "보험",
                        value = "보험료 낸 만큼 보장받을 수 있을까?"
                    )
                )
            }
            // 편집하기 | 추가하기
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(78.dp)
                    .background(Color(0xFFF3F4F6)),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "편집하기",
                    color = Color(0xFF666668)
                )
                VerticalDivider(
                    modifier = modifier
                        .height(22.dp)
                        .padding(horizontal = 46.dp),
                    color = Color(0xFF9FA5B0)
                )
                Text(
                    text = "추가하기",
                    color = Color(0xFF666668)
                )
            }
            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(Color.Black)
            )
        }
    }
}

//프리뷰 단축키: Prev
@Preview(showBackground = true)
@Composable
private fun AssetsScreenPreview() {
    AssetsScreen()
}