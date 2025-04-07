package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.EventData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeEventItem(
    modifier: Modifier = Modifier,
    eventList: List<EventData>
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 36.dp), //벽과의 간격
        horizontalArrangement = Arrangement.SpaceBetween //사진들 사이의 간격
    ) {
        eventList.forEach { event ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.size(36.dp),
                    painter = painterResource(id = event.icon),
                    contentDescription = event.text //사진에 대한 설명을 하단 text로 넣음
                )
                Text(
                    text = event.text,
                    style = typography.body_01_M_14,
                    color = colors.black
                )
            }
        }
    }
}

@Preview(widthDp = 360)
@Composable
private fun HomeEventItemPreview() {
    val EventList = listOf(
        EventData(
            icon = R.drawable.img_moneymail_icon,
            text = "용돈벌기"
        ),
        EventData(
            icon = R.drawable.img_heart_icon,
            text = "보험리모델링"
        ),
        EventData(
            icon = R.drawable.img_moneypocket_icon,
            text = "대출찾기"
        ),
        EventData(
            icon = R.drawable.img_bluecard_icon,
            text = "카드이벤트"
        ),
    )
    HomeEventItem(eventList = EventList)
}