package com.kuit.kuit5.ui.shopping.screen

import android.hardware.display.DeviceProductInfo
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping_componet.KbIcon
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToProductInfo: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.white)
    ) {
        Card(
            modifier = Modifier
                .padding(vertical = 20.dp, horizontal = 20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            colors= CardDefaults.cardColors(containerColor = colors.gray100),
            shape = RoundedCornerShape(16.dp)
        ) {

            KbIcon(icon = R.drawable.img_kbbank, account = "KB 청년도약계좌",n=280)

                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {
                            onNavigateToProductInfo()
                        },
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colors.gray300,
                            contentColor = colors.black
                        )
                    ) {
                        Text(text = "정보조회",
                            style=typography.body_02_R_12)
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }


/*@Preview(showBackground = true, widthDp = 360, heightDp = 1350)
@Composable
private fun ShoppingScreenPreview() {
    ShoppingScreen(
        viewModel = ShoppingViewModel(),
        onNavigateToProductInfo = {}
    )

}*/