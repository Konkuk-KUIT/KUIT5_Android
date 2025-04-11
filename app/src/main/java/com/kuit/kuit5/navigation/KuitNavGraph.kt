package com.kuit.kuit5.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kuit.kuit5.ui.asset.screen.AssetsScreen
import com.kuit.kuit5.ui.health.screen.HealthScreen
import com.kuit.kuit5.ui.home.screen.HomeScreen
import com.kuit.kuit5.ui.record.screen.RecordsScreen
import com.kuit.kuit5.ui.shopping.screen.ShoppingScreen

@Composable
fun KuitNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Home.route,
    ){
        // 홈
        composable(route = Route.Home.route) {
            HomeScreen(modifier=modifier)
        }
        // 자산
        composable(route = Route.Assets.route) {
            AssetsScreen(modifier=modifier)
        }
        // 가계부
        composable(route = Route.Records.route) {
            RecordsScreen()
        }
        // 건강
        composable(route = Route.Health.route) {
            HealthScreen()
        }
        // 금융쇼핑
        composable(route = Route.Shopping.route) {
            ShoppingScreen()
        }
    }
}
