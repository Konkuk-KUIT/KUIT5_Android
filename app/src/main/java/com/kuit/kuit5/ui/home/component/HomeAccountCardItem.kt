package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.Component.BankSaladButton
import com.kuit.kuit5.R
import com.kuit.kuit5.model.ButtonItem
import com.kuit.kuit5.ui.theme.Gray500

@Composable
fun HomeAccountCardItem(
    modifier: Modifier = Modifier,
    title: String,
    amount: String,
    buttonTitle: String,
    content: @Composable ColumnScope.() -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(horizontal = 20.dp, vertical = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(title, fontSize = 16.sp, color = Gray500, fontFamily = FontFamily(Font(R.font.pretendard_medium)))
                Spacer(modifier = Modifier.height(10.dp))
                Text(amount, fontSize = 20.sp, fontFamily = FontFamily(Font(R.font.pretendard_bold)))
            }
            BankSaladButton(item = ButtonItem(title = buttonTitle))

        }

        Spacer(modifier = Modifier.height(4.dp))


        Spacer(modifier = Modifier.height(12.dp))

        content()
    }


}

@Preview
@Composable
private fun HomeAccountCardItemPreview() {
    HomeAccountCardItem(
        title = "입출금 계좌",
        amount = "234,567원",
        buttonTitle = "송금"
    ) {
        //HomeAccountCardDetail()
        Spacer(modifier = Modifier.height(8.dp))
       // HomeAccountGoalCard()
    }
}