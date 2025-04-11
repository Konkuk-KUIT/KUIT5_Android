package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeAssetsDiagnosisCard(
    modifier: Modifier = Modifier,
    value: String
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = colors.gray200
        ),
        content = {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 14.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = value,
                        style = typography.body_02_R_12,
                        color = colors.black
                    )
                }
                Icon(
                    painter = painterResource(R.drawable.ic_assets_right_arrow),
                    contentDescription = "right arrow",
                    modifier = modifier.size(12.dp),
                    tint = colors.gray400
                )

            }
        }
    )
}

@Preview
@Composable
private fun HomeAssetsDiagnosisCardPreview() {
    HomeAssetsDiagnosisCard(value = "쌓인 예적금 이자 확인하고 진단받기")
}