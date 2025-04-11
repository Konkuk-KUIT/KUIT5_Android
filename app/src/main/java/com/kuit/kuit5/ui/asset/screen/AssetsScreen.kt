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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.ui.asset.component.AssetCheckContainer
import com.kuit.kuit5.ui.asset.component.AssetInfoContainer
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
                    style = typography.head_01_B_24,
                    color = colors.black
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
                        text = "쿠잇님의 순자산",
                        style = typography.body_01_R_14,
                        color = colors.black,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                    Text(
                        text = "1,234,567원",
                        style = typography.head_01_B_24,
                        color = colors.black
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
                        contentColor = colors.gray500,
                    ),
                ) {
                    Text(
                        text = "분석",
                        style = typography.head_04_SB_14,
                        color = colors.gray500,
                    )
                }
            }
            Spacer(modifier = Modifier.size(14.dp))
            // Tmap 광고
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
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            modifier = Modifier.size(42.dp),
                            painter = painterResource(id = R.drawable.img_assets_tmap),
                            contentDescription = "tmap"
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        Column {
                            Text(
                                text = "티맵 대리 1만원 쿠폰 받으세요",
                                style = typography.head_03_SB_16,
                                color = colors.black
                            )
                            Spacer(modifier = Modifier.size(10.dp))
                            Text(
                                text = "3월 한정 선착순 1만명 혜택",
                                style = typography.caption_01_R_10,
                                color = colors.gray500
                            )
                        }
                    }
                }
            )
            Spacer(modifier = Modifier.size(22.dp))
            // 계좌, 현금
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "계좌 · 현금",
                    style = typography.head_03_B_16,
                    color = colors.black
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "1,234,567원",
                        style = typography.body_01_M_14,
                        color = colors.gray500
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow"
                    )
                }
            }
            // 입출금
            Spacer(modifier = Modifier.size(30.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                AssetInfoContainer(
                    modifier = Modifier,
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
                Spacer(modifier = Modifier.size(28.dp))
                AssetInfoContainer(
                    modifier = Modifier,
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
                Spacer(modifier = Modifier.size(28.dp))
                AssetInfoContainer(
                    modifier = Modifier,
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
            Spacer(modifier = Modifier.size(22.dp))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            Spacer(modifier = Modifier.size(24.dp))
            //페이머니
            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        text = "페이머니",
                        style = typography.head_03_B_16,
                        color = colors.black
                    )
                    Text(
                        text = "0원",
                        style = typography.body_01_M_14,
                        color = colors.gray500
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
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.img_assets_banksal),
                            contentDescription = "banksal image",
                            tint = Color.Unspecified
                        )
                        Text(
                            text = "뱅샐머니", style = typography.body_01_R_14,
                            color = colors.gray500
                        )
                    }
                    Text(
                        text = "0원", style = typography.body_01_M_14,
                        color = colors.black
                    )
                }
            }
            Spacer(modifier = Modifier.size(22.dp))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))
            )
            //신용
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(68.dp)
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "신용",
                    style = typography.head_03_B_16,
                    color = colors.black
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "750점", style = typography.head_04_SB_14,
                        color = colors.gray500
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow",
                        )
                }
            }
            // 확인하기 x3
            Column {
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(0xFFF3F4F6))
                )
                AssetCheckContainer(
                    modifier = Modifier,
                    icon = R.drawable.img_assets_card,
                    name = "카드",
                    description = "내가 맞는 추천카드는?"

                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(0xFFF3F4F6))
                )
                AssetCheckContainer(
                    modifier = Modifier,
                    icon = R.drawable.img_assets_house,
                    name = "대출",
                    description = "내 최저 금리는?"
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(0xFFF3F4F6))
                )
                AssetCheckContainer(
                    modifier = Modifier,
                    icon = R.drawable.img_assets_shield,
                    name = "보험",
                    description = "보험료 낸 만큼 보장받을 수 있을까?"
                )
            }
            // 편집하기 | 추가하기
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(78.dp)
                    .background(Color(0xFFF3F4F6)),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "편집하기",
                    style = typography.body_01_M_14,
                    color = colors.gray500
                )
                VerticalDivider(
                    modifier = Modifier
                        .height(22.dp)
                        .padding(horizontal = 46.dp),
                    color = Color(0xFF9FA5B0)
                )
                Text(
                    text = "추가하기",
                    style = typography.body_01_M_14,
                    color = colors.gray500
                )
            }
//            Spacer(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(150.dp)
//                    .background(Color.Black)
//            )
        }
    }
}

//프리뷰 단축키: Prev
@Preview(showBackground = true, heightDp = 1500 )
@Composable
private fun AssetsScreenPreview() {
    AssetsScreen()
}