package com.kuit.kuit5.model

data class HomeAccountDetailData(
    val image:Int,
    val accountName: String,
    val amount: String,
    val balanceChangeAmount: String? = null
)
