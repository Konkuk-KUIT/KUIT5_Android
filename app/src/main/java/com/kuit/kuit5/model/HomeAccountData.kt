package com.kuit.kuit5.model

data class HomeAccountData(
    val image:Int,
    val accountName: String,
    val amount: String,
    val changedAmount: String? = null
)
