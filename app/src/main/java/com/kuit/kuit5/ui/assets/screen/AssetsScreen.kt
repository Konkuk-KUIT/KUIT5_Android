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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults.contentPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.F
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetsData
import com.kuit.kuit5.ui.assets.components.AssetsInfoContainer
import com.kuit.kuit5.ui.assets.components.AssetsMore
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import kotlin.collections.listOf

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssetsScreen(modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.white)
    ) {
        TopAppBar(
            modifier = Modifier.fillMaxWidth(), colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colors.white
        ), title = {
            Text(
                "자산", color = Color.Black, style = typography.head_01_B_24
            )
        }, actions = {
            Row(
                Modifier.padding(20.dp), horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_assets_money),
                    contentDescription = "money icon",
                    tint = colors.gray400
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_assets_gear),
                    contentDescription = "money icon",
                    tint = colors.gray400

                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_assets_bell),
                    contentDescription = "money icon",
                    tint = colors.gray400

                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_assets_stack),
                    contentDescription = "money icon",
                    tint = colors.gray400

                )

            }
        })
        // TopAppBar 제외한 지점


        Column(
            Modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollState)
        ) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column {
                    Text("쿠잇님의 순자산", style = typography.body_01_R_14)
                    Text("1,234,567원", style = typography.head_01_B_24)
                }
                Button(
                    modifier = Modifier
                        .size(58.dp, 38.dp)
                        .align(Alignment.CenterEnd),
                    contentPadding = PaddingValues(0.dp),
                    shape = RoundedCornerShape(6.dp),
                    onClick = {
                        print("ButtonClicked")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colors.gray200, contentColor = colors.gray500
                    )
                ) {
                    Text(
                        text = "분석", style = typography.head_04_SB_14
                    )
                }
            }
            Card(
                modifier = Modifier.padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(containerColor = colors.gray200),
                content = {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Image(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .size(42.dp),
                            painter = painterResource(R.drawable.img_assets_tmap),
                            contentDescription = "tmap image"
                        )
                        Spacer(Modifier.size(16.dp))
                        Column {

                            Text(
                                "티맵 대리 1만원 쿠폰 받으세요", style = typography.head_03_SB_16
                            )
                            Spacer(Modifier.size(5.dp))
                            Text(
                                "3월 한정 선착순 1만명 혜택",
                                style = typography.caption_01_R_10,
                                color = colors.gray500
                            )
                        }
                    }
                })

            Spacer(Modifier.size(22.dp))

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("계좌 · 현금", style = typography.head_03_B_16)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "1,234,567원",
                        style = typography.body_01_M_14,
                        color = colors.gray500,
                    )
                    Icon(
                        painter = painterResource(R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow",
                        tint = colors.gray500
                    )
                }
            }
            // 입출금

            Spacer(Modifier.size(30.dp))
            Column(
                Modifier.padding(horizontal = 20.dp),
                verticalArrangement = Arrangement.spacedBy(28.dp)
            ) {
                AssetsInfoContainer(
                    modifier = Modifier, title = "입출금", money = "234,567원", assetsList = listOf(
                        AssetsData(
                            icon = R.drawable.img_kakao_icon, name = "입출금통장", value = "234,567원"
                        ),

                        )
                )

                AssetsInfoContainer(
                    modifier = Modifier, title = "예금", money = "1,000,000원", assetsList = listOf(
                        AssetsData(
                            icon = R.drawable.img_kakao_icon, name = "정기예금", value = "1,000,000원"
                        ),
                    )
                )
                AssetsInfoContainer(
                    modifier = Modifier, title = "현금", money = "0원", assetsList = listOf(
                        AssetsData(
                            icon = R.drawable.img_shinhan_icon, name = "현금", value = "0원"
                        ),
                    )
                )
            }
            Spacer(Modifier.size(22.dp))
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(colors.gray200)
            )


            Column(Modifier.padding(vertical = 24.dp)) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("페이머니", style = typography.head_03_B_16)

                    Text(
                        "0원",
                        style = typography.body_01_M_14,
                        color = colors.gray500,

                        )


                }
                Spacer(Modifier.height(30.dp))
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.img_banksal_icon),
                            modifier = Modifier.size(30.dp),
                            tint = Color.Unspecified,
                            contentDescription = "뱅샐머니 아이콘"
                        )

                        Text(
                            "뱅샐머니", style = typography.body_01_R_14, color = colors.gray500
                        )
                    }
                    Text("0원", style = typography.body_01_M_14)
                }

            }

            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(colors.gray200)
            )

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 24.dp)
                    .align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("신용", style = typography.head_03_B_16)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "750점", style = typography.head_04_SB_14, color = colors.gray500
                    )
                    Icon(
                        painter = painterResource(R.drawable.ic_assets_right_arrow),
                        contentDescription = "right arrow",
                        tint = colors.gray500
                    )
                }

            }
            AssetsMore(title = "카드", icon = R.drawable.img_assets_card, content = "내게 맞는 추천카드는?")


            AssetsMore(title = "대출", icon = R.drawable.img_assets_loan, content = "내 최저 금리는?")

            AssetsMore(
                title = "보험",
                icon = R.drawable.img_assets_insuarance,
                content = "보험료 낸 만큼 보장받을 수 있을까?"
            )

            Box(
                Modifier
                    .size(360.dp, 78.dp)
                    .background(colors.gray200)
            ) {

                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        "편집하기", style = typography.body_01_M_14, color = colors.gray500
                    )
                    VerticalDivider(Modifier.height(22.dp), color = colors.gray400)
                    Text(
                        "추가하기", style = typography.body_01_M_14, color = colors.gray500
                    )

                }
            }


        }

    }
}


@Preview(heightDp = 2500, widthDp = 360)
@Composable
private fun AssetsScreenPreview() {
    AssetsScreen()

}