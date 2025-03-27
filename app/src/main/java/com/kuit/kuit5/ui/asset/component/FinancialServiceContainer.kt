package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R

@Composable
fun FinancialServiceContainer(
    modifier: Modifier = Modifier,
    title: String,
    content: String,
    img: Int
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = title, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Icon(
                painter = painterResource(id = R.drawable.ic_assets_plus),
                contentDescription = "plus icon",
                tint = Color(0xFF9FA5B0)
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = img),
                    contentDescription = "card image"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = content, fontSize = 14.sp, color = Color(0xFF666668))
            }
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "확인하기", fontSize = 14.sp, color = Color(0xFF9FA5B0))
                HorizontalDivider(
                    modifier = Modifier.width(50.dp),
                    color = Color(0xFF9FA5B0)
                )
            }

        }
    }

}

@Preview
@Composable
private fun FinancialServiceContainerPreview() {
    FinancialServiceContainer(title = "카드", content = "내게 맞는 추천카드는?", img = R.drawable.img_assets_card)
}