package com.kuit.kuit5.ui.home.screen
import com.kuit.kuit5.R

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.ui.home_component.HomeBannerItem
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.gray100)
    ) {
        //TopAppBar
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors =
                TopAppBarDefaults.topAppBarColors(
                    containerColor = colors.gray100
                ),
            title = {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(R.drawable.ic_home_banksalad),
                    contentDescription = "banksalad Icon",
                    tint = Color.Unspecified
                )
            },
            actions = {
                Row(
                    modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_home_bell),
                        contentDescription = "home bell icon",
                        tint = Color.Unspecified
                    )

                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_home_stack),
                        contentDescription = "home stack icon",
                        tint = Color.Unspecified

                    )

                }
            }
        )
        //TopAppBar 제외 나머지 영역
        Column(
            modifier = Modifier.fillMaxWidth().verticalScroll(state= scrollState)
        ){
            HomeBannerItem()
            //Spacer(modifier=Modifier.height(24.dp))
        }


    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
