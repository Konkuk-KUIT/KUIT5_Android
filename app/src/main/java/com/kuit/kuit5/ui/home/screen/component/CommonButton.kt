package com.kuit.kuit5.ui.home.screen.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme


@Composable
fun CommonButton(
    modifier: Modifier = Modifier,
    title: String,
    onClick: () -> Unit = {}

){
    Button(
        modifier = modifier
            .height(38.dp),
        shape = RoundedCornerShape(6.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = BankSaladTheme.colors.gray200),
        onClick = onClick,
    ){
        Text(
            text = title,
            style = BankSaladTheme.typography.head_04_SB_14,
            color = BankSaladTheme.colors.gray500
        )
    }

}

@Preview (showBackground = true,
    backgroundColor = 0xFFFFFFFF)
@Composable
private fun CommonButtonPreview(){
    CommonButton(
        title = "송금",
        modifier = Modifier,
        onClick = {}
    )
}