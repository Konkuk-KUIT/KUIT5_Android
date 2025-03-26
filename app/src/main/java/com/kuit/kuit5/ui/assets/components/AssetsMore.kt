package com.kuit.kuit5.ui.assets.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.assets.screen.AssetsScreen

@Composable
fun AssetsMore(
    modifier: Modifier = Modifier,
    title: String,
    icon: Int,
    content: String,
) {

    Column(
        Modifier.padding(horizontal = 20.dp),
    ) {
        Row(
            modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(title, fontWeight = FontWeight.W700)
            Icon(
                painter = painterResource(R.drawable.ic_assets_plus),
                contentDescription = "plus",
                tint = Color(0xff9FA5B0)
            )
        }

        Spacer(modifier.height(24.dp))

        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = "icon",
                    modifier = modifier.size(30.dp),
                    tint = Color.Unspecified
                )
                Spacer(modifier.width(10.dp))
                Text(content, fontSize = 14.sp, color = Color(0xff666668))
            }
            Column {
                Text("확인하기", fontSize = 14.sp, color = Color(0xff9FA5B0))
                Spacer(Modifier.width(4.dp))
                HorizontalDivider(Modifier.width(50.dp))
            }
        }
        Spacer(Modifier.size(22.dp))
    }

}

@Preview(showBackground = true)
@Composable
private fun AssetsMorePreview() {

    Box(modifier = Modifier.fillMaxSize()) {
        AssetsMore(title = "카드", icon = R.drawable.img_banksal_icon, content = "내게 맞는 추천카드는?")
    }


}