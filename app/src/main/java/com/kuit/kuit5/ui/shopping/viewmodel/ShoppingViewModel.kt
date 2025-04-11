package com.kuit.kuit5.ui.shopping.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ShoppingViewModel: ViewModel() {
    var newAccount = mutableStateOf(value = 0)
    fun addAccount(){
        newAccount.value +=1

    }

}