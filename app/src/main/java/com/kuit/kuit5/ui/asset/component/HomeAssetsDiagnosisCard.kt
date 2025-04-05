package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeAssetsDiagnosisCard(
    modifier: Modifier = Modifier,
    text:String
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(colors.gray200)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 14.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = text,
                    style = typography.body_02_R_12,
                    color = colors.black
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                contentDescription = "right arrow",
                tint = colors.gray400
            )
        }
    }
}

@Preview
@Composable
private fun HomeAssetsDiagonosisCardPreview() {
    HomeAssetsDiagnosisCard(text="쌓인 예적금 이자 확인하고 진단받기")
}