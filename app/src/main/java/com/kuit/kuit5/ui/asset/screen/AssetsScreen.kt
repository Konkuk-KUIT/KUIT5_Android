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
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.model.AssetData2
import com.kuit.kuit5.ui.asset.component.AssetComponent
import com.kuit.kuit5.ui.asset.component.AssetInfoContainer

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssetsScreen(modifier: Modifier = Modifier) {

    val scrollstate = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TopAppBar(modifier = Modifier.fillMaxWidth(), colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White
        ), title = {
            Text(
                text = "자산", color = Color.Black, fontSize = 24.sp, fontWeight = FontWeight.Bold
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
                        painter = painterResource(id = R.drawable.ic_asset_gear),
                        contentDescription = "gear icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_bell),
                        contentDescription = "bell icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_stack),
                        contentDescription = "stack icon",
                        tint = Color(0xFF9FA5B0)
                    )
                }
            })
        //TopAppBar 제외한 화면
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(state = scrollstate)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Column(
                    modifier = modifier
                ) {
                    Text("쿠잇님의 순자산")
                    Text("1,234,567원", fontSize = 24.sp, fontWeight = ExtraBold)
                }
                Button(
                    modifier = Modifier
                        .size(58.dp, 38.dp)
                        .align(Alignment.CenterEnd),
                    contentPadding = PaddingValues(0.dp),
                    shape = RoundedCornerShape(6.dp),
                    onClick = {
                        // TODO:버튼 액션 추가하기
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF3F4F6),
                        contentColor = Color(0xFF666668)
                    )
                ) {
                    Text("분석")
                }
            }
            Spacer(modifier = Modifier.size(14.dp))
            //Tmap광고
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
                            .padding(horizontal = 16.dp, vertical = 16.dp)
                    ) {
                        Image(
                            modifier = Modifier.size(42.dp),
                            painter = painterResource(id = R.drawable.img_assets_tmap),
                            contentDescription = "tmap"
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        Column {
                            Text(
                                "티맵 대리 1만원 쿠폰 받으세요",
                                fontSize = 16.sp,
                                fontWeight = ExtraBold
                            )
                            Text(
                                "3월 한정 선착순 1만명 혜택",
                                fontSize = 10.sp,
                                color = Color(0xFF666668)
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
                    fontSize = 16.sp,
                    fontWeight = ExtraBold
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "1,234,567원", color = Color(0xFF666668))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_right_arrow),
                        contentDescription = "right arrow",
                        tint = Color(0xFF666668)
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
                    modifier = Modifier,
                    title = "입출금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "234,567원"
                        ),
//                        AssetData(
//                            icon = R.drawable.img_kakao_icon,
//                            name = "입출금통장",
//                            value = "1,000,000원"
//                        ),
//                        AssetData(
//                            icon = R.drawable.img_kakao_icon,
//                            name = "입출금통장",
//                            value = "1,000,000원"
//                        )
                    )
                )
                Spacer(modifier = Modifier.size(30.dp))
                AssetInfoContainer(
                    modifier = Modifier,
                    title = "예금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_kakao_icon,
                            name = "정기예금",
                            value = "1,000,000원"
                        )
                    )

                )
                Spacer(modifier = Modifier.size(30.dp))
                AssetInfoContainer(
                    modifier = Modifier,
                    title = "현금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.img_shinhan_icon,
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
            //페이머니
            Spacer(modifier = Modifier.size(22.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        text = "페이머니",
                        fontSize = 16.sp,
                        fontWeight = ExtraBold
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "0원",color = Color(0xFF666668))

                    }
                }
                Spacer(modifier = Modifier.size(30.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_asset_pay),
                            contentDescription = "pay icon",
                            tint=Color.Unspecified
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("뱅샐머니", fontSize = 14.sp,color=Color(0xFF666668))

                    }

                    Text(text = "0원")


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
            Spacer(modifier = Modifier.size(22.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("신용", fontSize = 16.sp, fontWeight = ExtraBold)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "750점", fontSize = 14.sp, color = Color(0xFF666668))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_right_arrow),
                        contentDescription = "right arrow",
                        tint = Color(0xFF666668)
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

            AssetComponent(
                modifier = Modifier,
                title = "카드",
                assetList2 = listOf(
                    AssetData2(
                        icon = R.drawable.img_asset_card,
                        name = "내가 맞는 추천카드는?"
                    )

                )

            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))

            )
            AssetComponent(
                modifier = Modifier,
                title = "금리",
                assetList2 = listOf(
                    AssetData2(
                        icon = R.drawable.img_asset_house,
                        name = "내 최저 금리는?"
                    )
                )
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))

            )
            AssetComponent(
                modifier = Modifier,
                title = "보험",
                assetList2 = listOf(
                    AssetData2(
                        icon = R.drawable.img_asset_insurance,
                        name = "보험료 낸 만큼 보장받을 수 있을까?"
                    )
                )
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(78.dp)
                    .background(Color(0xFFF3F4F6))
            ) {
                Row(
                    modifier = Modifier.align(Alignment.Center),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("편집하기")

                    Spacer(modifier = Modifier.width(12.dp))

                    VerticalDivider(
                        modifier = Modifier
                            .height(20.dp)
                            .width(1.dp),
                        color = Color(0xFFD9D9D9)
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text("추가하기")
                }
            }

        }
    }
}


@Preview(showBackground = true, heightDp = 3000)
@Composable
private fun AssetsScreenPreview() {
    AssetsScreen()
}