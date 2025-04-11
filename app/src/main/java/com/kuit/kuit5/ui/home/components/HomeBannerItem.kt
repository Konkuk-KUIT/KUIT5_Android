package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    value: String,
    icon: Int
) {
    Box(
        modifier = modifier
//            .width(320.dp)
            .height(60.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(color = colors.white)
    ) {
        Row(
            modifier = modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = modifier.padding(top = 12.dp, bottom = 12.dp)) {
                Text(
                    modifier = modifier.padding(bottom = 8.dp),
                    text = caption,
                    style = typography.caption_01_R_10
                )
                Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        modifier = modifier.padding(end = 2.dp),
                        text = value,
                        style = typography.head_04_SB_14
                    )
                    Icon(
                        modifier = modifier
                            .size(14.dp)
                            .padding(start = 2.dp),
                        painter = painterResource(R.drawable.ic_assets_right_arrow),
                        contentDescription = "arrow icon",
                        tint = colors.black
                    )
                }
            }
            Icon(
                modifier = modifier.size(40.dp),
                painter = painterResource(icon),
                contentDescription = "homebanneritem img",
                tint = Color.Unspecified
            )
        }
    }
}

@Preview
@Composable
private fun HomeBannerItemPreview() {
    HomeBannerItem(
        caption = "3월에만 받을 수 있는",
        value = "최대 17만원 용돈받기",
        icon = R.drawable.img_home_cash
    )
}