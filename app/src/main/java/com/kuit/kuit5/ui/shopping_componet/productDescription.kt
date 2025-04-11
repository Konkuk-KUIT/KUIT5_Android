package com.kuit.kuit5.ui.shopping_componet

import android.accounts.Account
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.shopping_componet.KbIcon
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun productDescription(
    modifier: Modifier = Modifier,
    home_title: String,
    home_content: String
) {
    Column(modifier = Modifier) {

        Row(modifier = Modifier.width(280.dp)) {
            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = home_title,
                style = typography.head_03_R_16,
                color = colors.black
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.width(280.dp)) {
            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = home_content,
                style = typography.head_02_B_20,
                color = colors.black
            )

        }
        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Preview
@Composable
private fun productDescriptionPreview() {
    productDescription(
        home_title = "입출금통장",
        home_content = "입출금통장"
        )
}