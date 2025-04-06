package com.kuit.kuit5.ui.shopping.screen.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

data class ProductDetail(
    val label: String,
    val value: String
)


class ShoppingViewModel: ViewModel() {
    var newAccount = mutableIntStateOf(value = 0)

    fun addAccount() {
        newAccount.value += 1
    }

    val productDetails = listOf(
        ProductDetail("가입 연령", "19~34세"),
        ProductDetail("소득 기준", "연 6,000만 원 이하"),
        ProductDetail("월 납입 금액", "40만원 ~ 최대 70만원"),
        ProductDetail("정부 지원금", "납입액의 3~6%")
    )

}