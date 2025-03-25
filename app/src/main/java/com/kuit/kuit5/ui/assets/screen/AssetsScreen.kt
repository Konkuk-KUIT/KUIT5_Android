package com.kuit.kuit5.ui.assets.screen

import android.R.attr.contentDescription
import android.R.attr.onClick
import android.widget.Space
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults.contentPadding
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetsData
import com.kuit.kuit5.ui.assets.component.AssetsInfoContainer
import com.kuit.kuit5.ui.assets.component.AssetsInfoItem
import kotlin.collections.listOf

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssetsScreen(modifier: Modifier = Modifier) {
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
                    "자산",
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
            },
            actions = {
                Row(
                    Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_money),
                        contentDescription = "money icon",
                        tint = Color(0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_gear),
                        contentDescription = "money icon",
                        tint = Color(0xff9FA5B0)

                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_bell),
                        contentDescription = "money icon",
                        tint = Color(0xff9FA5B0)

                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_stack),
                        contentDescription = "money icon",
                        tint = Color(0xff9FA5B0)

                    )

                }
            }
        )
        // TopAppBar 제외한 지점
        Column(modifier.fillMaxWidth()) {
            Box(
                modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column {
                    Text("쿠잇님의 순자산", fontSize = 14.sp, fontWeight = FontWeight.W400)
                    Text("1,234,567원", fontSize = 24.sp, fontWeight = FontWeight.W700)
                }
                Button(
                    modifier = modifier
                        .size(58.dp, 38.dp)
                        .align(Alignment.CenterEnd),
                    contentPadding = PaddingValues(0.dp),
                    shape = RoundedCornerShape(6.dp),
                    onClick = {
                        print("ButtonClicked")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffF3F4F6),
                        contentColor = Color(0xff666668)
                    )
                ) {
                    Text("분석", fontWeight = FontWeight.Bold)
                }
            }
            Card(
                modifier = modifier
                    .padding(horizontal = 20.dp)
                    ,
                colors = CardDefaults.cardColors(containerColor = Color(0xffF3F4F6)),
                content = {
                    Row(
                        modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Image(
                            modifier = modifier
                                .clip(RoundedCornerShape(12.dp))
                                .size(42.dp),
                            painter = painterResource(R.drawable.img_assets_tmap),
                            contentDescription = "tmap image"
                        )
                        Spacer(modifier.size(16.dp))
                        Column {

                            Text(
                                "티맵 대리 1만원 쿠폰 받으세요",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W600
                            )
                            Spacer(modifier.size(5.dp))
                            Text("3월 선착순 1만명 혜택", fontSize = 10.sp, color = Color(0xff666668))
                        }
                    }
                }
            )

            Spacer(Modifier.size(22.dp))

            Row(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("계좌 · 현금")
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("1,234,567원")
                    Icon(
                        painter = painterResource(R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow"
                    )
                }
            }
            // 입출금

            Spacer(Modifier.size(30.dp))
            Column(modifier.padding(horizontal = 20.dp)) {
                AssetsInfoContainer(
                    modifier = modifier,
                    title = "입출금",
                    assetsList = listOf(
                        AssetsData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "1,000,000원"
                        ),
                        AssetsData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "1,000,000원"
                        ),
                        AssetsData(
                            icon = R.drawable.img_kakao_icon,
                            name = "입출금통장",
                            value = "1,000,000원"
                        ),

                        )
                )
            }
            Spacer(modifier.size(22.dp))
            Spacer(modifier.fillMaxWidth().height(10.dp).background(Color(0xffF3F4F6)), )
        }

    }
}

@Preview
@Composable
private fun AssetsScreenPreview() {
    AssetsScreen()

}