package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.BoxData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun AssetConfirmItem(
    modifier: Modifier = Modifier,
    confirm:BoxData
) {
    Row(
        modifier=modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                modifier = modifier
                    .size(30.dp),
                painter = painterResource(id = confirm.icon),
                contentDescription = "asset icon",
                tint = Color.Unspecified
            )
            Spacer(modifier.size(10.dp))
            Text(
                text = confirm.question,
                style = typography.body_01_R_14,
                color = colors.gray500
            )
        }
        Column(
            modifier=Modifier.width(IntrinsicSize.Max)
        ){
            Text(
                text=confirm.confirms,
                color=colors.gray400,
                style = typography.body_01_R_14,
            )
            HorizontalDivider(
                modifier=modifier
                    .fillMaxWidth(),
                color= colors.gray300
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun AssetConfirmItemPreview() {
    val confirm = BoxData(
        icon = R.drawable.img_card_icon,
        question = "내게 맞는 추천 카드는?",
        confirms = "확인하기"
    )
    AssetConfirmItem(
        confirm = confirm
    )
}