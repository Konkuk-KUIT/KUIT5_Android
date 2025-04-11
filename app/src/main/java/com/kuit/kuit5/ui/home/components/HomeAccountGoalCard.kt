package com.kuit.kuit5.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
fun HomeAccountGoalCard(
    modifier: Modifier = Modifier,
    icon: Int,
    value: String
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = colors.apricot
        ),
        content = {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        modifier = modifier.size(28.dp),
                        painter = painterResource(id = icon),
                        contentDescription = "pig img"
                    )
                    Spacer(modifier = modifier.size(8.dp))
                    Text(
                        text = value,
                        style = typography.body_02_R_12,
                        color = colors.black
                    )
                }
                Icon(
                    painter = painterResource(R.drawable.ic_assets_right_arrow),
                    contentDescription = "right arrow",
                    modifier = modifier
                        .size(12.dp),
                    tint = colors.gray400
                )

            }
        }
    )
}

@Preview
@Composable
private fun HomeAccountGoalCardPreview() {
    HomeAccountGoalCard(icon = R.drawable.img_home_pig, value = "목표를 설정하고 종잣돈을 모아보세요")
}