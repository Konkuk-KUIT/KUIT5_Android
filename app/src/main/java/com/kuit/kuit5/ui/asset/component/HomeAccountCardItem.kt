package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeAccountCardItem(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(colors.white)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Column() {
                    Text(
                        text = "입출금 계좌",
                        style = typography.head_03_R_16,
                        color = colors.gray500
                    )
                    Spacer(modifier=modifier.size(10.dp))
                    Text(
                        text = 234567.toDecimalFormat() + "원",
                        style = typography.head_02_B_20,
                        color = colors.black
                    )
                }
                Column(modifier = Modifier.wrapContentWidth()) {
                    BankSaladGrayButton(text = "송금")
                }
            }
            Spacer(modifier=modifier.size(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "어제보다",
                    style = typography.body_02_R_12,
                    color = colors.gray400,
                    )
            }
            Spacer(modifier=modifier.size(24.dp))
            HomeAccountCardDetail()
            Spacer(modifier=modifier.size(26.dp))
            HomeAccountGoalDetail()
        }
    }
}

@Preview
@Composable
private fun HomeAccountCardItemPreview() {
    HomeAccountCardItem()
}