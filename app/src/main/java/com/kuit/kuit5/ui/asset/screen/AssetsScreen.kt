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
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.ui.asset.component.AssetInfoContainer
import com.kuit.kuit5.ui.asset.component.AssetInfoContainer_second
import com.kuit.kuit5.ui.asset.component.AssetInfoItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssetsScreen(modifier: Modifier = Modifier) {
    val scrollstate = rememberScrollState()

    Column(
        modifier = Modifier
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
                        painter = painterResource(id = R.drawable.ic_asset_mone_svg),
                        contentDescription = "money icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_asset_setting),
                        contentDescription = "setting icon",
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
            }

        )
        //TopAppBar 제외한 화면
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollstate)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column(
                    modifier = modifier
                ) {
                    Text("쿠잇님의 순자산")
                    Text("1,234,567원")
                }
                Button(
                    modifier = Modifier
                        .size(58.dp, 38.dp)
                        .align(Alignment.CenterEnd),

                    contentPadding = PaddingValues(0.dp),
                    shape = RoundedCornerShape(6.dp),

                    onClick = {
                        //todo 액션 버튼 추가
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF3F4F6),
                        contentColor = Color(0xFF666668)
                    )

                ) {
                    Text("분석")
                }

            }
            Spacer(modifier = modifier.size(14.dp))
            //tmap 광고
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
                            .padding(horizontal = 16.dp, vertical = 16.dp)
                    ) {
                        Image(
                            modifier = modifier.size(42.dp),
                            painter = painterResource(id = R.drawable.ic_tmap),
                            contentDescription = "tmap"

                        )
                        Spacer(modifier = modifier.size(16.dp))
                        Column {
                            Text("티맵 대리 1만원 쿠폰 받으세요")
                            Text("3월 한정 선착순 1만명 혜택")

                        }
                    }
                }

            )
            Spacer(modifier = modifier.size(22.dp))

            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "계좌 · 현금",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Row() {
                    Text("1,234,567원")
                    Icon(
                        painter = painterResource(id = R.drawable.ic_vector),
                        contentDescription = "right arrow",
                    )
                }

            }
            Spacer(modifier = modifier.size(30.dp))
            //입출금
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                AssetInfoContainer(
                    modifier = modifier,
                    title = "입출금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.kakao_bank,
                            name = "   입출금 통장",
                            value = "234,567원"

                        ),
                    )
                )

                Spacer(modifier = Modifier.height(28.dp))

                AssetInfoContainer(
                    modifier = modifier,
                    title = "예금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.kakao_bank,
                            name = "   정기예금",
                            value = "1,000,000원"

                        ),
                    )
                )
                Spacer(modifier = Modifier.height(28.dp))

                AssetInfoContainer(
                    modifier = modifier,
                    title = "현금",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.ic_money,
                            name = "   현금",
                            value = "0원"

                        ),
                    )
                )



                Spacer(modifier = modifier.size(22.dp))

            }
            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))

            )

            Spacer(modifier = modifier.size(22.dp))
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "페이머니",
                        fontSize = 16.sp, fontWeight = FontWeight.Bold
                    )

                    Text("0원")

                }
                Spacer(modifier = Modifier.height(30.dp))


                SingleAssetExample()

                Spacer(modifier = modifier.size(22.dp))


            }

            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))

            )

            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Spacer(modifier = modifier.size(20.dp))
                Row(
                    modifier = modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "신용",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Row() {
                        Text("750점")
                        Icon(
                            painter = painterResource(id = R.drawable.ic_vector),
                            contentDescription = "right arrow",
                        )
                    }


                }
                Spacer(modifier = modifier.size(20.dp))

            }

        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(10.dp)
                .background(Color(0xFFF3F4F6))

        )
        Column(
            modifier = modifier
                .fillMaxWidth()
        ) {
            Column {
                AssetInfoContainer_second(
                    modifier = modifier,
                    title = "카드",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.ic_card,
                            name = "   내게 맞는 추천카드는?",
                            value = "확인하기"

                        ),
                    )

                )

                //Spacer(modifier=modifier.size(22.dp))

            }
            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))

            )
            Column() {
                AssetInfoContainer_second(
                    modifier = modifier,
                    title = "대출",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.ic_bankhouse,
                            name = "   내 최저 금리는?",
                            value = "확인하기"

                        ),
                    )
                )


            }
            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(Color(0xFFF3F4F6))

            )
            Column() {
                AssetInfoContainer_second(
                    modifier = modifier,
                    title = "보험",
                    assetList = listOf(
                        AssetData(
                            icon = R.drawable.ic_defend,
                            name = "   보험료 낸 만큼 보상받을 수 있을까?",
                            value = "확인하기"

                        ),
                    )
                )

                // Spacer(modifier = modifier.size(22.dp))
            }


        }
        Card(
            modifier = modifier,
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF3F4F6)
            ),
            content = {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(78.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {


                    Text(text = "편집하기")
                    Row() {
                        Image(
                            modifier = modifier.size(22.dp),
                            painter = painterResource(id = R.drawable.ic_vertical_line),

                            contentDescription = "plus"
                        )
                    }
                    Text(text = "추가하기")

                }
            }

        )
    }
}

@Composable
fun SingleAssetExample(modifier: Modifier = Modifier) {
    AssetInfoItem(
        asset = AssetData(
            icon = R.drawable.ic_bank_s,
            name = "   뱅셀샐머니",
            value = "0원"
        )
    )
}


@Preview(showBackground = true, heightDp = 2200)
@Composable
private fun AssetScreenPreview() {
    AssetsScreen()
    //SingleAssetExample()
}