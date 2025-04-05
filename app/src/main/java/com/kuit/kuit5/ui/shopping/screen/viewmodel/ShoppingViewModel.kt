package com.kuit.kuit5.ui.shopping.screen.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class ShoppingViewModel: ViewModel() {
    var newAccount = mutableIntStateOf(value = 0)

    fun addAccount() {
        newAccount.value += 1
    }
}