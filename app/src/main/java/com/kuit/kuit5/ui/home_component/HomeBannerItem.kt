package com.kuit.kuit5.ui.home_component

import android.R.attr.bottom
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeBannerItem(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = colors.white),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = "3월에만 받을 수 있는",
                    style = typography.caption_01_R_10,
                    color = colors.gray500
                )

                Spacer(modifier = Modifier.height(10.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "최대 17만원 용돈받기",
                        style = typography.head_04_SB_14,
                        color = colors.black
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Icon(
                        modifier = Modifier.size(14.dp),
                        painter = painterResource(id = R.drawable.ic_home_rightarrow),
                        contentDescription = "right arrow"
                    )
                }
                Spacer(modifier = Modifier.height(14.dp))
            }
            Box(modifier = Modifier) {
                Image(
                    modifier = Modifier
                        .padding(20.dp)
                        .size(40.dp),
                    painter = painterResource(id = R.drawable.ic_home_banner_money),
                    contentDescription = "papermoney"
                )
                Card(
                    modifier = Modifier
                        .padding(end = 10.dp, bottom = 2.dp)
                        .width(32.dp)
                        .height(18.dp)
                        .align(Alignment.BottomEnd),
                    shape = RoundedCornerShape(9.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0X999FA5B0))
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "1/5",
                            style = typography.head_05_B_10,
                            color = colors.white
                        )
                    }
                }

            }
        }

    }


}

@Preview
@Composable
private fun HomeBanneritem() {
    HomeBanneritem()
}