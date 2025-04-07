package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.Gray400

@Composable
fun HomeAssetsDiagnosisCard(
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFFF6F7F9))
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.pretendard_regular)),
            color = colors.black,
            modifier = Modifier.weight(1f)
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_asset_right_arrow),
            contentDescription = null,
            tint = Gray400
        )
    }
}

@Preview
@Composable
private fun HomeAssetsDiagnosisCardPreview() {
    HomeAssetsDiagnosisCard(text = "쌓인 예적금 이자 확인하고 진단받기")
}