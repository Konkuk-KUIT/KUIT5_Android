package com.kuit.kuit5.ui.home.component

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.BannerItem
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.ui.theme.Gray500

@Composable
fun HomeBannerItem(modifier: Modifier = Modifier,
                   asset: BannerItem
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White)
            .height(60.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(modifier = Modifier.padding(start = 16.dp)) {

            Text(
                text = asset.name,
                fontSize = 10.sp,
                color = Gray500,
                fontFamily = FontFamily(Font(R.font.pretendard_regular))
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = asset.value,
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.pretendard_semibold))

                )
                Spacer(modifier = Modifier.width(4.dp)) // 텍스트와 아이콘 사이 여백
                Icon(
                    painter =painterResource(id = R.drawable.ic_asset_right_arrow),
                    contentDescription = "Arrow Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(14.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(end = 20.dp)
                .size(40.dp),
            contentAlignment = Alignment.BottomEnd
        ) {
            // 이미지 (배경)
            Image(
                painter = painterResource(id = asset.icon),
                contentDescription = asset.name,
                modifier = Modifier.size(40.dp)
            )

            androidx.compose.material3.Card(
                modifier = Modifier
                    .offset(x = 4.dp, y = (-4).dp) // 위치 미세 조정
                    .width(32.dp)
                    .height(18.dp),
                shape = RoundedCornerShape(9.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF999FA5B0)
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "1 / 5",
                        fontSize = 10.sp,
                        color = Color.White
                    )
                }
            }
        }



    }
    }



@Preview
@Composable
private fun HomeBannerItemPteview() {
    val sampleItem = BannerItem(
        icon = R.drawable.img_home_money,
        name = "3월에만 받을 수 있는",
        value = "최대 17만원 용돈받기"
    )

    HomeBannerItem(asset = sampleItem)
}