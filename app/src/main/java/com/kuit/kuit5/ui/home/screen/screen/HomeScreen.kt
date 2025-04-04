package com.kuit.kuit5.ui.home.screen.screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.home.screen.component.HomeAccountContainer
import com.kuit.kuit5.ui.home.screen.component.HomeAssetContainer
import com.kuit.kuit5.ui.home.screen.component.HomeAssetsDiagnosisCard
import com.kuit.kuit5.ui.theme.BankSaladTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Image(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.img_banksalady_icon),
                        contentDescription = "Banksalad"
                    )
                },
                actions = {
                    Row(modifier = Modifier.padding(17.dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_bell),
                            contentDescription = "bell Icon",
                            tint = Color(0XFF9FA5B0)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_stack),
                            contentDescription = "stack Icon",
                            tint = Color(0XFF9FA5B0)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
            )
        },
        containerColor = Color(0xFFF5F5F5)
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding) // ✅ 이게 scaffold 내부 padding임
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(bottom = 80.dp)
        ) {


            Spacer(modifier = Modifier.height(14.dp))

            // 카드
            Card(
                modifier = Modifier.padding(horizontal = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            "3월에만 받을 수 있는",
                            style = BankSaladTheme.typography.caption_01_R_10,
                            color = BankSaladTheme.colors.gray500,
                        )
                        Spacer(modifier = Modifier.height(10.dp))


                        Row(
                            modifier = Modifier,
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            Text(
                                "최대 17만원 용돈받기",
                                style = BankSaladTheme.typography.head_04_SB_14,
                                color = BankSaladTheme.colors.black,
                            )


                            Spacer(modifier = Modifier.padding(2.dp))

                            Icon(
                                painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                                contentDescription = "right arrow",
                                tint = BankSaladTheme.colors.gray500

                            )


                        }
                    }
                    Box(modifier = Modifier.size(width = 50.dp, height = 40.dp)) {
                        Image(
                            modifier = Modifier.size(40.dp),
                            painter = painterResource(id = R.drawable.img_dollar_icon),
                            contentDescription = "dollar"
                        )
                        Text(
                            text = "1 / 5",
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .offset(x = (-4).dp, y = (1).dp)// 위치 조정
                                .background(
                                    color = BankSaladTheme.colors.gray400.copy(alpha = 0.8f), // 투명도
                                    shape = RoundedCornerShape(90)
                                )
                                .padding(horizontal = 6.dp, vertical = 4.dp),
                            color = BankSaladTheme.colors.white,
                            style = BankSaladTheme.typography.caption_01_R_10
                        )


                    }


                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 아이콘 Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 36.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    modifier = Modifier.size(36.dp),
                    painter = painterResource(R.drawable.img_allow_icon),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(36.dp),
                    painter = painterResource(R.drawable.img_heart_icon),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(36.dp),
                    painter = painterResource(R.drawable.img_moneybag_icon),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(36.dp),
                    painter = painterResource(R.drawable.img_cardevent_icon),
                    contentDescription = ""
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // 텍스트 Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 29.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "용돈벌기",
                    style = BankSaladTheme.typography.body_01_M_14,
                    color = BankSaladTheme.colors.gray500
                )
                Text(
                    "보험리모델링",
                    style = BankSaladTheme.typography.body_01_M_14,
                    color = BankSaladTheme.colors.gray500
                )
                Text(
                    "대출찾기",
                    style = BankSaladTheme.typography.body_01_M_14,
                    color = BankSaladTheme.colors.gray500
                )
                Text(
                    "카드이벤트",
                    modifier = Modifier.offset(x = 6.dp),
                    style = BankSaladTheme.typography.body_01_M_14,
                    color = BankSaladTheme.colors.gray500
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 입출금 카드
            HomeAccountContainer()
            Spacer(modifier = Modifier.height(16.dp))

            HomeAssetContainer()
            Spacer(modifier = Modifier.height(16.dp))

            HomeAssetsDiagnosisCard()
            Spacer(modifier = Modifier.height(16.dp))


        }
    }
}


@Preview(showBackground = true,
    heightDp = 1400)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()

}









