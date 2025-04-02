package com.kuit.kuit5.model

data class HomeDetailData(
    val image: Int,
    val name: String,
    val amount: String,
    val changedAmount: String? = null
)