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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssetsScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
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
                            contentDescription = "money Icon",
                            tint = Color(0XFF9FA5B0)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_gear),
                            contentDescription = "gear Icon",
                            tint = Color(0XFF9FA5B0)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_bell),
                            contentDescription = "bell Icon",
                            tint = Color(0XFF9FA5B0)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_stack),
                            contentDescription = "stack Icon",
                            tint = Color(0XFF9FA5B0)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White
                )
            )
        },
        containerColor = Color.White
    ) { innerPadding ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White),
            contentPadding = PaddingValues(bottom = 30.dp)
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Column {
                        Text("쿠잇님의 순자산", color = Color.Black, fontSize = 14.sp)
                        Text("1,234,567원", color = Color.Black, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    }
                    Button(
                        modifier = Modifier
                            .size(58.dp, 38.dp)
                            .align(Alignment.CenterEnd),
                        contentPadding = PaddingValues(0.dp),
                        shape = RoundedCornerShape(6.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF3F4F6),
                            contentColor = Color(0xFF666668)
                        )
                    ) {
                        Text("분석", fontSize = 14.sp)
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(14.dp)) }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFF3F4F6))
                ) {
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
                            Text("티맵 대리 1만원 쿠폰 받으세요", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            Text("3월 한정 선착순 1만명 혜택", color = Color.Black, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(22.dp)) }
//계좌, 현금
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "계좌・현금",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "1,234,567원",
                            color = Color(0xFF666668),
                            fontSize = 14.sp
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                            contentDescription = "right arrow",
                            tint = Color(0xFF666668)
                        )
                    }
                }}
            item {
                Spacer(modifier = Modifier.size(30.dp))}

            item {
                // 입출금
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    AssetInfoContainer(
                        modifier = Modifier,
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
                    Spacer(modifier = Modifier.size(28.dp))
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
                    Spacer(modifier = Modifier.size(28.dp))
                    AssetInfoContainer(
                        modifier = Modifier,
                        title = "현금",
                        value = "0원",

                        assetList = listOf(
                            AssetData(
                                icon = R.drawable.img_shinhan_icon,
                                name = "현금",
                                value = "1,000,000원",
                            ),
                        )
                    )
                }}
            item {
                Spacer(modifier = Modifier.size(22.dp))

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(color = 0xFFF3F4F6))
                )}
            item {

                Spacer(modifier = Modifier.size(22.dp))}

            item {
                //페이머니

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "페이머니",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "0원",
                        color = Color(0xFF666668)
                    )
                }}
            item {



                Spacer(modifier = Modifier.size(22.dp))}
            item {

//뱅샐머니


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {

                    Row(
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.img_banksalad_icon),
                            contentDescription = "Banksalad",
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        Text(
                            text = "뱅샐머니",
                            color = Color(color = 0XFF666668),
                            fontSize = 14.sp
                        )


                    }
                    Text(
                        text = "0원",
                        color = Color.Black,
                        fontSize = 14.sp
                    )

                }}

            item {
                Spacer(modifier = Modifier.size(28.11.dp))
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(color = 0xFFF3F4F6))
                )
            }


            item {
                Spacer(modifier = Modifier.size(22.dp))}

            item {
                //신용
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "신용",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "750점",
                            color = Color(0xFF666668),
                            fontSize = 14.sp
                        )
                        Spacer(modifier = Modifier.size(4.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                            contentDescription = "right arrow",
                            tint = Color(0xFF666668)

                        )
                    }

                }}

            item {
                Spacer(modifier = Modifier.size(26.dp))
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(color = 0xFFF3F4F6))
                )}
            item {

//카드
                Spacer(modifier = Modifier.size(22.dp))}
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "카드",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_plus),
                            contentDescription = "plus",
                            tint = Color(0xFF9FA5B0)
                        )
                    }

                }}
            item {

                Spacer(modifier = Modifier.size(30.dp))}
            item {

//추천카드
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {

                    Row(
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.img_card_icon),
                            contentDescription = "Recommend Card",
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        Text(
                            text = "내가 맞는 추천카드는?",
                            color = Color(color = 0XFF666668),
                            fontSize = 14.sp
                        )


                    }
                    Text(
                        text = "확인하기",
                        color = Color(color = 0XFF9FA5B0),
                        fontSize = 14.sp
                    )

                }}

            item {
                Spacer(modifier = Modifier.size(26.dp))
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(color = 0xFFF3F4F6))
                )
            }
            item {

                Spacer(modifier = Modifier.size(22.dp))}

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "대출",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_plus),
                            contentDescription = "plus",
                            tint = Color(0xFF9FA5B0)
                        )
                    }

                }}
            item {


                Spacer(modifier = Modifier.size(30.dp))}
            item {
//대출
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {

                    Row(
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.img_loan_icon),
                            contentDescription = "low loan",
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        Text(
                            text = "내 최저 금리는?",
                            color = Color(color = 0XFF666668),
                            fontSize = 14.sp
                        )


                    }
                    Text(
                        text = "확인하기",
                        color = Color(color = 0XFF9FA5B0),
                        fontSize = 14.sp
                    )

                }}

            item {
                Spacer(modifier = Modifier.size(26.dp))
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .background(Color(color = 0xFFF3F4F6))
                )}


            item {
                Spacer(modifier = Modifier.size(22.dp))}

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "보험",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_plus),
                            contentDescription = "plus",
                            tint = Color(0xFF9FA5B0)
                        )
                    }

                }}

            item {

                Spacer(modifier = Modifier.size(30.dp))}

            item {

//보험
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {

                    Row(
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.img_insurance_icon),
                            contentDescription = "insurance",
                        )
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(
                            text = "보험료 낸 만큼 보장받을 수 있을까?",
                            color = Color(color = 0XFF666668),
                            fontSize = 14.sp
                        )


                    }
                    Text(
                        text = "확인하기",
                        color = Color(color = 0XFF9FA5B0),
                        fontSize = 14.sp
                    )

                }}
            item {
                Spacer(modifier = Modifier.size(26.dp))}


            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF3F4F6))
                        .padding(vertical = 14.dp)
                ) {
                    Row(
                        modifier = Modifier.align(Alignment.Center),
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        Text(
                            text = "편집하기",
                            color = Color(0XFF666668),
                            fontSize = 14.sp
                        )
                        Spacer(modifier = Modifier.width(46.dp))


                        Box(
                            modifier = Modifier
                                .width(1.dp)
                                .height(14.dp)
                                .background(Color(0xFFD9D9D9))
                        )
                        Spacer(modifier = Modifier.width(46.dp))
                        Text(
                            text = "추가하기",
                            color = Color(0XFF666668),
                            fontSize = 14.sp
                        )

                    }

                }}


            }

    }
}




@Preview(showBackground = true,
    widthDp = 360,
    heightDp = 1362)
@Composable
fun AssetsScreenPreview() {
    AssetsScreen(
        modifier = Modifier
            .width(360.dp)
            .height(1362.dp)
    )
    }
