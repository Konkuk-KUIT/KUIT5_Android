package com.kuit.kuit5.ui.home.screen.screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.home.screen.component.HomeAccountContainer
import com.kuit.kuit5.ui.home.screen.component.HomeAssetContainer
import com.kuit.kuit5.ui.home.screen.component.HomeAssetsDiagnosisCard
import com.kuit.kuit5.ui.home.screen.component.HomeBannerItem
import com.kuit.kuit5.ui.home.screen.component.HomeEventItem
import com.kuit.kuit5.ui.theme.BankSaladTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Image(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.img_banksalady_icon),
                        contentDescription = "Banksalad"
                    )
                },
                actions = {
                    Row(modifier = Modifier.padding(17.dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_bell),
                            contentDescription = "bell Icon",
                            tint = BankSaladTheme.colors.gray400
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_assets_stack),
                            contentDescription = "stack Icon",
                            tint = BankSaladTheme.colors.gray400
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
            )
        },
        containerColor = Color(0xFFF5F5F5)
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(bottom = 80.dp)
        ) {
            Spacer(modifier = Modifier.height(14.dp))

            // 홈배너
            HomeBannerItem(
                subtitle = "3월에만 받을 수 있는",
                title = "최대 17만원 용돈받기",
                indicatorText = "1 / 5",
                imageResId = R.drawable.img_dollar_icon
            )

            Spacer(modifier = Modifier.height(20.dp))

            HomeEventItem()

            Spacer(modifier = Modifier.height(20.dp))

            HomeAccountContainer()
            Spacer(modifier = Modifier.height(16.dp))

            HomeAssetContainer()
            Spacer(modifier = Modifier.height(16.dp))

            HomeAssetsDiagnosisCard()
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true, heightDp = 1400)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}

