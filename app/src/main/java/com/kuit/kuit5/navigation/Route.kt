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

    // ShoppingSubgraph
    object ShoppingSubGraph: Route(route="shopping_subgraph")

    // 상품정보
    object ProductInfo: Route(route = "product_info")
    //계좌 개설
    object CreateAccount: Route(route="create_account")
    //계좌 개설 결과
    object CreateAccountResult:Route(route = "create_account_result")
}