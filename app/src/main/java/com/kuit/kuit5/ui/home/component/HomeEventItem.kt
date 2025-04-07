package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.EventItem
import com.kuit.kuit5.ui.theme.Gray500

@Composable
fun HomeEventItem(modifier: Modifier = Modifier,
                  asset: EventItem
) {
    Column( horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        Image(
            painter = painterResource(id = asset.icon),
            contentDescription = asset.name,
            modifier = Modifier
                .size(36.dp)

        )
        Spacer(modifier = Modifier.size(10.dp))
        Text(
            text = asset.name,
            fontSize = 14.sp,
            color = Gray500,
            fontFamily = FontFamily(Font(R.font.pretendard_medium))
        )
    }
}

@Preview
@Composable
private fun HomeEventItemPreview() {
    val sampleItem = EventItem(
        icon = R.drawable.img_home_inmoney,
        name = "용돈벌기",
    )

    HomeEventItem(asset = sampleItem)
}