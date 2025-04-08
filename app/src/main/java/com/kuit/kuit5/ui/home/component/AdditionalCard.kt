package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun AdditionalCard(
    modifier: Modifier = Modifier,
    text: String,
    height: Int = 40,
    color: Color = colors.gray200,
    icon: Int? = null
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(height.dp),
        colors = CardDefaults.cardColors(containerColor = color),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (icon != null) {
                    Icon(
                        modifier = Modifier.padding(end = 8.dp).size(28.dp),
                        painter = painterResource(id = icon),
                        contentDescription = "additionalCard icon",
                        tint = Color.Unspecified,
                    )
                }
                Text(
                    text = text,
                    style = typography.body_02_R_12,
                    color = colors.black
                )
            }
            Icon(
                modifier = Modifier.size(12.dp),
                painter = painterResource(id = R.drawable.ic_home_additionalcardrightarrow),
                contentDescription = "right arrow",
                tint = Color.Unspecified
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AdditionalCardPreview() {
    AdditionalCard(
        text = "쌓인 예적금 이자 확인하고 진단받기"
    )
//    AdditionalCard(
//        text = "목표를 설정하고 종잣돈을 모아보세요",
//        height = 56,
//        icon = R.drawable.img_home_pig,
//        color = colors.apricot
//    )
}