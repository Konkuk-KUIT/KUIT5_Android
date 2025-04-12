package com.kuit.kuit5.ui.home.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme

@Composable
fun HomeBannerItem(
    subtitle: String,
    title: String,
    indicatorText: String,
    imageResId: Int
) {
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
                    text = subtitle,
                    style = BankSaladTheme.typography.caption_01_R_10,
                    color = BankSaladTheme.colors.gray500
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = title,
                        style = BankSaladTheme.typography.head_04_SB_14,
                        color = BankSaladTheme.colors.black
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
                    painter = painterResource(id = imageResId),
                    contentDescription = "image"
                )
                Text(
                    text = indicatorText,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .offset(x = (-4).dp, y = 1.dp)
                        .background(
                            color = BankSaladTheme.colors.gray400.copy(alpha = 0.8f),
                            shape = RoundedCornerShape(90)
                        )
                        .padding(horizontal = 6.dp, vertical = 4.dp),
                    color = BankSaladTheme.colors.white,
                    style = BankSaladTheme.typography.caption_01_R_10
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewHomeBannerItem() {
    HomeBannerItem(
        subtitle = "3월에만 받을 수 있는",
        title = "최대 17만원 용돈받기",
        indicatorText = "1 / 5",
        imageResId = R.drawable.img_dollar_icon
    )

}