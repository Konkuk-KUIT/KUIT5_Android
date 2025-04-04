package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun BankSaladGrayButton(
    modifier: Modifier = Modifier,
    text:String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Button(
            modifier = Modifier
                .size(58.dp, 38.dp)
                .align(Alignment.CenterEnd),
            contentPadding = PaddingValues(0.dp), //패딩
            shape = RoundedCornerShape(6.dp), //각진 정도
            colors = ButtonDefaults.buttonColors(
                containerColor = colors.gray200, // 배경색 설정
                contentColor = colors.black // 내용 색상 설정
            ),
            onClick = {
                //TODO:버튼 액션 추가하기
            },


            ) {
            Text(
                text = text,
                style = typography.head_03_SB_14,
                color = colors.gray500
            )
        }
    }
}

@Preview
@Composable
private fun BankSaladGrayButtonPreview() {
    BankSaladGrayButton(text="하이")
}