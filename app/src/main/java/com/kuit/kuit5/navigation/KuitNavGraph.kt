package com.kuit.kuit5.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.kuit.kuit5.HealthScreen
import com.kuit.kuit5.HomeScreen
import com.kuit.kuit5.RecordsScreen
import com.kuit.kuit5.ShoppingScreen
import com.kuit.kuit5.ui.asset.screen.AssetsScreen
import com.kuit.kuit5.ui.shopping.screen.CreateAccountResultScreen
import com.kuit.kuit5.ui.shopping.screen.CreateAccountScreen
import com.kuit.kuit5.ui.shopping.screen.ProductInfoScreen
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.util.sharedViewModel

@Composable
fun KuitNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Home.route,
    ) {
        // 홈
        composable(route = Route.Home.route) {
            HomeScreen(modifier = modifier)
        }
        // 자산
        composable(route = Route.Assets.route) {
            AssetsScreen(modifier = modifier)
        }
        // 가계부
        composable(route = Route.Records.route) {
            RecordsScreen(modifier = modifier)
        }
        // 건강
        composable(route = Route.Health.route) {
            HealthScreen(modifier = modifier)
        }
        navigation(route = Route.ShoppingSubGraph.route, startDestination = Route.Shopping.route) {
            // 금융쇼핑
            //ShoppingScreen
            composable(route = Route.Shopping.route) { NavBackStackEntry ->
                val viewModel = NavBackStackEntry.sharedViewModel<ShoppingViewModel>(navController)
                ShoppingScreen(
                    modifier = modifier,
                    viewModel = viewModel,
                    onNavigateToProductInfo = {
                        navController.navigate(Route.ProductInfo.route)
                    }
                )
            }
            //ProductInfoScreen
            composable(route = Route.ProductInfo.route) { NavBackStackEntry ->
                val viewModel = NavBackStackEntry.sharedViewModel<ShoppingViewModel>(navController)
                ProductInfoScreen(
                    modifier = modifier,
                    viewModel = viewModel,
                    onNavigateToCreateAccount = {
                        navController.navigate(Route.CreateAccount.route)
                    }
                )
            }
            //CreateAccountScreen
            composable(route = Route.CreateAccount.route) { NavBackStackEntry ->
                val viewModel = NavBackStackEntry.sharedViewModel<ShoppingViewModel>(navController)
                CreateAccountScreen(
                    modifier = modifier,
                    viewModel = viewModel,
                    onNavigateToCreateAccountResult = {
                        navController.navigate(Route.CreateAccountResult.route)
                    }
                )
            }
            //CreateAccountResultScreen
            composable(route = Route.CreateAccountResult.route) { NavBackStackEntry ->
                val viewModel = NavBackStackEntry.sharedViewModel<ShoppingViewModel>(navController)
                CreateAccountResultScreen(
                    modifier = modifier,
                    viewModel = viewModel,
                    onNavigateToShopping = {
                        navController.navigate(Route.Shopping.route)
                    }
                )
            }
        }
    }
}

fun ShoppingNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

}