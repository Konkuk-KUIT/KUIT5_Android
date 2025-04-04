package com.kuit.kuit5.ui.home_component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5_solutions.ui.theme.defaultBankSaladTypography

@Composable
fun BankSaladGrayButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: ()-> Unit ={}
) {
    Box(
        modifier=Modifier
        .background(
        color= colors.gray200,
        shape= RoundedCornerShape(6.dp)
    )
        .width(58.dp)
        .height(38.dp)
        .clickable{onClick()},
        contentAlignment = Alignment.Center

    ){
        Text(
            text= text,
            style = typography.head_04_SB_14,
            color= colors.gray500
        )


    }




}


@Preview
@Composable
private fun BankSaladGrayButtonPreview() {
    BankSaladGrayButton(text = "확인")
}