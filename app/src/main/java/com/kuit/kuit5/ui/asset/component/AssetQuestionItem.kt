package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetQuestionData

@Composable
fun AssetQuestionItem(modifier: Modifier = Modifier, assetQuestionData: AssetQuestionData) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = assetQuestionData.icon),
                contentDescription = "asset card icon",
                modifier = modifier.size(30.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = modifier.size(10.dp))
            Text(text = assetQuestionData.question, fontSize = 14.sp, color = Color(0xFF666668))
        }

        Column(
            modifier = modifier.width(IntrinsicSize.Max) // Column의 너비를 자식 크기에 맞춤
        ) {
            Text(
                text = "확인하기",
                fontSize = 14.sp,
                color = Color(0xFF9FA5B0),
                //textDecoration = TextDecoration.Underline
            )
            HorizontalDivider(
                modifier = modifier.fillMaxWidth(),
                color = Color(0xFF9FA5B0)
            )
        }
    }
}

@Preview
@Composable
private fun AssetQuestionItemPreview(
) {
    val assetQuestionData = AssetQuestionData(
        icon = R.drawable.img_asset_card_icon,
        question = "내가 맞는 추천카드는?"
    )
    AssetQuestionItem(assetQuestionData = assetQuestionData)
}