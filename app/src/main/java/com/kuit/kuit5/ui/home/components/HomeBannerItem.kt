package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography


@Composable
fun HomeBannerItem(
    modifier: Modifier = Modifier,
    caption: String,
    title: String,
    image: Int,
    page: Int
) {
    Box(
        modifier
            .size(320.dp, 60.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(colors.white)

    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 10.dp, bottom = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(Modifier.fillMaxHeight()) {
                Spacer(Modifier.height(2.dp))
                Text(caption, color = colors.gray500, style = typography.caption_01_R_10)
                Spacer(Modifier.height(10.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(title, style = typography.head_04_SB_14)
                    Spacer(Modifier.width(2.dp))
                    Icon(
                        painter = painterResource(R.drawable.ic_right_arrow),
                        contentDescription = "right arrow",
                    ) // 이거왜가운데정렬안됨???
                }
                Spacer(Modifier.height(4.dp))
            }

            Box {
                Image(
                    painter = painterResource(image),
                    contentDescription = "",
                    modifier = Modifier.padding(end = 10.dp)
                )
                Box(
                    Modifier
                        .size(32.dp, 18.dp)
                        .clip(RoundedCornerShape(9.dp))
                        .background(colors.gray400.copy(alpha = 0.8f))
                        .align(Alignment.BottomEnd)
                ) {
                    Text(
                        "$page / 5",
                        style = typography.caption_01_R_10,
                        color = colors.white.copy(alpha = 0.8f),
                        modifier = Modifier.align(
                            Alignment.Center
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xffF6F7F9)
@Composable
private fun HomeBannerItemPrev() {
    HomeBannerItem(
        caption = "3월에만 받을 수 있는",
        title = "최대 17만원 용돈 받기",
        image = R.drawable.img_banner_money,
        page = 1
    )
}