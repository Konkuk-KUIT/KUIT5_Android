package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.BoxData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ConfirmContainer(
    modifier: Modifier = Modifier,
    title:String,
    confirmList:List<BoxData>
    ) {
    Column(
        modifier=modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ){
    Row(
        modifier=modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text=title,
            style = typography.head_03_B_16,
        ) //ex)카드,대출,보험
        Icon(
            painter = painterResource(id = R.drawable.ic_assets_plus),
            contentDescription = "plus icon",
            tint = colors.gray400
        )
    }
        confirmList.forEach {
            confirm -> AssetConfirmItem(confirm = confirm)
        }
    }
}

@Preview
@Composable
private fun ConfirmContainerPreview() {
    val confirmList = listOf(
        BoxData(
            icon = R.drawable.img_card_icon,
            question = "내게 맞는 추천 카드는?",
            confirms = "확인하기"
        )
    )
    ConfirmContainer(
        title="카드",
        confirmList = confirmList
    )
}