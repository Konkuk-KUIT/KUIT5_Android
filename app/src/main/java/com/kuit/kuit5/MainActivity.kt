package com.kuit.kuit5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.kuit.kuit5.navigation.BottomNavItem
import com.kuit.kuit5.navigation.KuitNavGraph
import com.kuit.kuit5.navigation.Route
import com.kuit.kuit5.ui.theme.KUIT5Theme
//
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KUIT5Theme {
                val navController = rememberNavController()

                val navBarItems = listOf(
                    BottomNavItem(
                        label = "홈",
                        route = Route.Home.route,
                        selectedIcon = R.drawable.ic_bottomnav_home,
                        unselectedIcon = R.drawable.ic_bottomnav_home
                    ),
                    BottomNavItem(
                        label = "자산",
                        route = Route.Assets.route,
                        selectedIcon = R.drawable.ic_bottomnav_asset,
                        unselectedIcon = R.drawable.ic_bottomnav_asset
                    ),
                    BottomNavItem(
                        label = "가계부",
                        route = Route.Records.route,
                        selectedIcon = R.drawable.ic_bottomnav_records,
                        unselectedIcon = R.drawable.ic_bottomnav_records
                    ),
                    BottomNavItem(
                        label = "건강",
                        route = Route.Health.route,
                        selectedIcon = R.drawable.ic_bottomnav_health,
                        unselectedIcon = R.drawable.ic_bottomnav_health
                    ),
                    BottomNavItem(
                        label = "금융쇼핑",
                        route = Route.Shopping.route,
                        selectedIcon = R.drawable.ic_bottomnav_shopping,
                        unselectedIcon = R.drawable.ic_bottomnav_shopping
                    )
                )

                var selectedIndex by rememberSaveable { mutableIntStateOf(0) }

                Scaffold(
                    modifier = Modifier
                        .systemBarsPadding(),
                    contentWindowInsets = WindowInsets.safeDrawing,
                    bottomBar = {
                        NavigationBar(
                            modifier = Modifier
                                .drawBehind {
                                    val strokeWidth = 1.dp.toPx()
                                    drawLine(
                                        color = Color(0xFFD9D9D9), // NavigationBar의 상단 테두리
                                        start = Offset(0f, 0f),
                                        end = Offset(size.width, 0f),
                                        strokeWidth = strokeWidth,
                                    )
                                },
                            containerColor = Color.White,
                        ) {
                            navBarItems.forEachIndexed { index, item ->
                                NavigationBarItem(
                                    selected = selectedIndex == index,
                                    alwaysShowLabel = true,
                                    label = {
                                        Text(
                                            text = item.label,
                                        )
                                    },
                                    onClick = {
                                        selectedIndex = index
                                        navController.navigate(item.route)
                                    },
                                    icon = {
                                        Icon(
                                            painter = painterResource(
                                                if (index == selectedIndex) {
                                                    item.selectedIcon
                                                } else item.unselectedIcon
                                            ),
                                            contentDescription = item.label,
                                        )
                                    },
                                    colors = NavigationBarItemDefaults.colors(
                                        indicatorColor = Color.Transparent,
                                        selectedIconColor = Color.Black,
                                        unselectedIconColor = Color(0xFF9FA5B0),
                                        selectedTextColor = Color.Black,
                                        unselectedTextColor = Color(0xFF9FA5B0)
                                    )
                                )
                            }
                        }
                    }
                ) { innerPadding ->
                    KuitNavGraph(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
