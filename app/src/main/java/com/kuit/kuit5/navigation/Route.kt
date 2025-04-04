package com.kuit.kuit5.navigation

sealed class Route(val route: String) {
    // 홈
    object Home: Route(route = "home")
    // 자산
    object Assets: Route(route = "assets")
    // 가계부
    object Records: Route(route = "records")
    // 건강
    object Health: Route(route = "health")
    // 금융쇼핑
    object Shopping: Route(route = "shopping")
}