package com.kuit.kuit5.ui.home_component

import android.R.attr.tint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.kuit.kuit5.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeAccountCardDetail(
    modifier: Modifier = Modifier,
    icon: Int,
    accountValue: Int,
    accountCategory: String,
    lossvalue: Int
) {
    //val polygon=R.drawable.ic_home_pol
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(34.dp), verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(30.dp),
                painter = painterResource(id = icon),
                contentDescription = "account icon",
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = accountValue.toDecimalFormat() + "원",
                    style = typography.body_01_M_14,
                    color = colors.black
                )
                Text(
                    text = accountCategory,
                    style = typography.body_02_R_12,
                    color = colors.gray400
                )
            }
        }

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            Icon(
                modifier = Modifier.size(10.dp),
                painter = painterResource(id=R.drawable.ic_home_pol),
                contentDescription = "polygon image",
                tint = Color.Unspecified
            )
            Text(
                text = lossvalue.toDecimalFormat() + "원",
                style = typography.body_01_M_14,
                color = colors.blue
            )
            Icon(
                modifier = Modifier.size(14.dp),
                painter = painterResource(id = R.drawable.ic_home_rightarrow),
                contentDescription = "account right arrow icon",
                tint = Color.Unspecified
            )
        }
    }
}

@Preview
@Composable
private fun HomeAccountCardDetailPreview() {
    HomeAccountCardDetail(
        icon = R.drawable.kakao_bank,
        accountValue = 234567,
        accountCategory = "입출금통장",
        lossvalue = 3300,
    )
}