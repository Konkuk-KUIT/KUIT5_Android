package com.kuit.kuit5.ui.shopping.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.kuit.kuit5.model.ShoppingData

class ShoppingViewModel: ViewModel() {
    var selectedProduct = mutableStateOf<ShoppingData?>(null)
        private set

    fun selectProduct(product: ShoppingData) {
        selectedProduct.value = product
    }

//    val newAccount = mutableIntStateOf(0)
//
//    fun addAccount(){
//        newAccount.value += 1
//    }
}