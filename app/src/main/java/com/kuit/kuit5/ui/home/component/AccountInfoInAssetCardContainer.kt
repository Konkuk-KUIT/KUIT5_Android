package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun AccountInfoInAssetCardContainer(
    modifier: Modifier = Modifier,
    icon: Int,
    accountValue: Int,
    accountCategory: String,
    isSurplus: Boolean,
    profitOrLossValue: Int
) {
    val polygon = if (isSurplus){
        R.drawable.img_home_profitred
    }else{
        R.drawable.img_home_lossblue
    }
    val profitOrLossValueColor = if (isSurplus){
        Color.Red
    }else{
        colors.blue
    }
    Row(
        modifier = modifier
            .padding(bottom = 24.dp)
            .fillMaxWidth()
            .height(36.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxHeight(),
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
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = accountCategory,
                    style = typography.body_01_M_14,
                    color = colors.gray400
                )
                Text(
                    text = accountValue.toDecimalFormat()+"원",
                    style = typography.body_01_M_14,
                    color = colors.black
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
                painter = painterResource(id = polygon),
                contentDescription = "polygon image",
                tint = Color.Unspecified
            )
            Text(
                text = profitOrLossValue.toDecimalFormat()+"원",
                style = typography.body_01_M_14,
                color = profitOrLossValueColor
            )
            Icon(
                modifier = Modifier.size(14.dp),
                painter = painterResource(id = R.drawable.ic_home_accountrightarrow),
                contentDescription = "account right arrow",
                tint = Color.Unspecified
            )
        }
    }
}

@Preview
@Composable
private fun AccountInfoInAssetCardContainerPreview() {
    AccountInfoInAssetCardContainer(
        icon = R.drawable.img_kakao_icon,
        accountValue = 234567,
        accountCategory = "입출금통장",
        isSurplus = false,
        profitOrLossValue = 3300
    )
}