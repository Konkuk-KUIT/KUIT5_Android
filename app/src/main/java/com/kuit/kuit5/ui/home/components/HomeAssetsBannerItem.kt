package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeAssetsBannerItem(modifier: Modifier = Modifier, text: String) {
    Box(
        Modifier
            .size(280.dp, 40.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(colors.gray200),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp), // Text가 잘려 vertical padding 말고 Alignment 적용
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text, style = typography.body_02_R_12)
            Icon(
                painter = painterResource(R.drawable.ic_right_arrow),
                contentDescription = "",
                modifier = Modifier.size(12.dp),
                tint = colors.gray400
            )
        }
    }
}
