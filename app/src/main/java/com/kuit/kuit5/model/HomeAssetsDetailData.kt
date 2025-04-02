package com.kuit.kuit5.model

data class HomeAssetsDetailData(
    val image: Int,
    val name: String,
    val amount: String,
    val balanceChangeAmount: String? = null
)