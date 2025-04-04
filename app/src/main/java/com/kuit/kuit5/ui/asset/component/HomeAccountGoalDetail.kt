package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun HomeAccountGoalDetail(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(colors.apricot)
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
                Icon(
                    modifier = Modifier.size(28.dp),
                    painter = painterResource(id = R.drawable.img_pig_icon),
                    contentDescription = "pig icon",
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = "목표를 설정하고 종잣돈을 모아보세요",
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
private fun HomeAccountGoalDetailPreview() {
    HomeAccountGoalDetail()
}