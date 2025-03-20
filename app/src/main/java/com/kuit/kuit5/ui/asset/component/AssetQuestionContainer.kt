package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
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
import com.kuit.kuit5.model.AssetQuestionData

@Composable
fun AssetQuestionContainer(modifier: Modifier = Modifier, title : String, questionDataList: List<AssetQuestionData>) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = title, fontSize = 16.sp, color = Color.Black, fontWeight = FontWeight.Bold)
            Icon(painter = painterResource(id = R.drawable.ic_asset_add),
                contentDescription = "asset add icon",
                tint = Color(0xFF9FA5B0),
            )
        }
        Spacer(modifier = modifier.size(30.dp))
        Column(
            modifier = modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            questionDataList.forEach {
                AssetQuestionItem(assetQuestionData = it)
            }
        }
    }
}

@Preview
@Composable
private fun AssetQuestionContainerPreview() {
    val questionDataList = listOf(
        AssetQuestionData(
            icon = R.drawable.img_asset_card_icon,
            question = "내게 맞는 추천카드는?"
        ),
        AssetQuestionData(
            icon = R.drawable.img_asset_card_icon,
            question = "내가 자주 사용한 카드는?"
        ),
        AssetQuestionData(
            icon = R.drawable.img_asset_card_icon,
            question = "카드 사용내역이 가장 많은 카드는?"
        ),
    )
    AssetQuestionContainer(title = "카드", questionDataList = questionDataList)
}