package com.kuit.kuit5.ui.shopping.screen.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import com.kuit.kuit5.model.productInfoList

data class ProductDetail(
    val label: String,
    val value: String
)


class ShoppingViewModel: ViewModel() {
    var newAccount = mutableIntStateOf(value = 0)

    fun addAccount() {
        newAccount.value += 1
    }

    val productDetails = productInfoList


}