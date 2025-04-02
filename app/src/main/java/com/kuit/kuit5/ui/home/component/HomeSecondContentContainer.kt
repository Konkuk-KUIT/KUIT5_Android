package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.component.grayButton
import com.kuit.kuit5.model.HomeContentData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeSecondContentContainer(
    title: String,
    value: Int,
    valueContent: String,
    bottomValue: String,
    grayButton: String,
    homeContentList: List<HomeContentData>,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(colors.gray100)
            .fillMaxWidth()
    ) {
        Column (
            modifier = Modifier
                .padding(vertical = 24.dp, horizontal = 20.dp)
                .fillMaxWidth()
        )
        {
            Row(){
                Column(){
                    Text(
                        text = title,
                        color = colors.gray500,
                        style = typography.head_03_R_16
                    )
                    Text(
                        modifier = Modifier.padding(top = 10.dp),
                        text = value.toDecimalFormat()+"원",
                        color = Color.Black,
                        style = typography.head_02_B_20
                    )
                    Text(
                        modifier = Modifier.padding(top = 10.dp),
                        text = valueContent,
                        color = colors.black,
                        style = typography.body_02_R_12
                    )
                }
                grayButton(
                    value = grayButton
                )
            }
            Spacer(modifier = Modifier.size(22.dp))
            homeContentList.forEach{ content->
                HomeSecondContentItem(content = content)
            }
            Spacer(modifier = Modifier.size(24.dp))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.gray200)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = bottomValue,
                        color = colors.black,
                        style = typography.body_02_R_12,
                        modifier = Modifier
                            .padding(start = 8.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.img_right_arrow_gray),
                        contentDescription = "right_arrow_gray",
                        modifier = Modifier
                            .size(12.dp)
                    )
                }
            }
        }
    }
}