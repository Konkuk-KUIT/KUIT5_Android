package com.kuit.kuit5.ui.shopping_componet

import android.health.connect.datatypes.units.Length
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier


import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.home_component.HomeAccountCardDetail
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun KbIcon(
    modifier: Modifier = Modifier,
    icon: Int,
    account: String,
    n: Int
) {
    Column(modifier = Modifier) {
        Image(
            modifier = Modifier
                .padding(20.dp)
                .height(145.dp)
                .width(n.dp),
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = icon),
            contentDescription = "Kb Bank Icon"
        )
        Row(modifier = Modifier.width(280.dp)) {
            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = account,
                style = typography.head_02_B_20,
                color = colors.black
            )

        }
    }
}

@Preview
@Composable
private fun KbIconPreview() {
    KbIcon(
        icon = R.drawable.img_kbbank,
        account = "입출금통장",
        n=320
        )
}