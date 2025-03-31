package com.kuit.kuit5.ui.home.screen

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.HomeBannerData
import com.kuit.kuit5.ui.home.components.HomeAccountCard
import com.kuit.kuit5.ui.home.components.HomeBannerItem
import com.kuit.kuit5.ui.home.components.HomeEventItem
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.gray100),
    ) {
        TopAppBar(
            title = {
                Image(
                    painter = painterResource(R.drawable.img_home_logo),
                    contentDescription = "main logo",
                    modifier = Modifier.size(24.dp)
                )
            },
            actions = {
                Row(
                    Modifier.padding(20.dp), horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_topbar_bell),
                        contentDescription = "topappbar bell icon",
                        tint = colors.gray400
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_topbar_stack),
                        contentDescription = "topappbar stack icon",
                        tint = colors.gray400

                    )
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = colors.gray100
            )
        )

        // topAppBar 제외한 화면

        Column(
            Modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollState),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)

        ) {
//            HomeBannerItem(
//                caption = "3월에만 받을 수 있는",
//                title = "최대 17만원 용돈받기",
//                image = R.drawable.img_banner_money
//            )
            val pagerState = rememberPagerState(pageCount = {
                5
            })

            val bannerItemList =
                listOf<HomeBannerData>(
                    HomeBannerData(
                        caption = "3월에 받을 수 있는",
                        title = "최대 17만원 용돈받기",
                        image = R.drawable.img_banner_money
                    ),
                    HomeBannerData(
                        caption = "최대 0.5% 금리 할인 혜택 도착",
                        title = "3월 한정 대출 쿠폰 받기",
                        image = R.drawable.img_banner_present
                    ),
                    HomeBannerData(
                        caption = "지금 바로 참여하세요",
                        title = "에어팟 맥스 무제한 뽑기",
                        image = R.drawable.img_banner_airpodsmax
                    ),
                    HomeBannerData(
                        caption = "똑똑한 운전자들의 선택",
                        title = "자동차보험 한눈에 비교하기",
                        image = R.drawable.img_banner_car
                    ),
                    HomeBannerData(
                        caption = "똑똑한 건대생들의 선택",
                        title = "쿠잇에서 컴포즈 한번에 뿌시기",
                        image = R.drawable.img_bannor_konkuk
                    ),
                )


            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 20.dp),
                pageSpacing = 20.dp
//                verticalAlignment = Alignment.CenterVertically
//                적용 안되는 이유?

            ) { page ->
                HomeBannerItem(
                    caption = bannerItemList[page].caption,
                    title = bannerItemList[page].title,
                    image = bannerItemList[page].image,
                    page = page+1
                )

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 36.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                HomeEventItem(image = R.drawable.img_home_allowance, text = "용돈벌기")
                HomeEventItem(image = R.drawable.img_home_insurance, text = "보험리모델링")
                HomeEventItem(image = R.drawable.img_home_bundle, text = "대출찾기")
                HomeEventItem(image = R.drawable.img_home_card, text = "카드이벤트")
            }
            HomeAccountCard()

        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 2500)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}