package com.kuit.kuit5.Component


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.model.ButtonItem
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.Gray200

@Composable
fun BankSaladButton(
    item: ButtonItem,
    modifier: Modifier = Modifier) {
    Box(modifier=modifier) {
        Button(

            modifier = Modifier
                .size(58.dp, 38.dp)
                .align(Alignment.CenterEnd),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(6.dp),
            onClick = {
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Gray200,
                contentColor = Color(0xFF666668)
            )
        ) {
            Text(text = item.title)
        }
    }
}
@Preview
@Composable
private fun BankSaladButtonPreviw() {
    val buttonData = ButtonItem(title = "분석")

    BankSaladButton(item = buttonData)
}