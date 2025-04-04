package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.Image
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R

@Composable
fun AssetSummaryRow(
    modifier: Modifier = Modifier,
    sectionTitle: String, //Bold한 제목
    iconResId: Int, // 아이콘
    summaryTitle: String, // 아이콘 옆 텍스트
    actionText: String
) {
    Column(modifier = modifier.fillMaxWidth()) {
        // 상단: 섹션 제목 + 플러스 아이콘
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = sectionTitle,
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
            )

            Icon(
                modifier = Modifier.size(16.dp),
                painter = painterResource(id = R.drawable.ic_assets_plus),
                contentDescription = "plus icon",
                tint = Color(0XFF9FA5B0)
            )
        }

        Spacer(modifier = Modifier.size(30.dp)) // 제목과 아래 Row 간격

        // 하단: 아이콘 + 설명 + 확인하기
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = iconResId),
                    contentDescription = summaryTitle
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    text = summaryTitle,
                    color = Color(0XFF666668),
                    fontSize = 14.sp,
                )
            }

            Text(
                text = actionText,
                color = Color(0XFF9FA5B0),
                fontSize = 14.sp,
            )
        }
    }
}
