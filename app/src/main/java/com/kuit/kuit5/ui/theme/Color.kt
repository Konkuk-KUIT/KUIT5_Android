package com.kuit.kuit5.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val White = Color(0xffFFFFFF)
val Black = Color(0xff000000)

val Gray100 = Color(0xffF6F7F9)
val Gray200 = Color(0xffF3F4F6)
val Gray300 = Color(0xffD9D9D9)
val Gray400 = Color(0xff9FA5B0)
val Gray500 = Color(0xff666668)

val Apricot = Color(0xffFFF5e4)
val Green = Color(0xff09A56F)
val Blue = Color(0xff0077FF)

@Immutable
data class BankSaladColors(
    val white: Color,
    val black: Color,
    val gray100: Color,
    val gray200: Color,
    val gray300: Color,
    val gray400: Color,
    val gray500: Color,
    val apricot: Color,
    val green: Color,
    val blue: Color,

    )

val defaultBankSaladColors = BankSaladColors(
    white = White,
    black = Black,
    gray100 = Gray100,
    gray200 = Gray200,
    gray300 = Gray300,
    gray400 = Gray400,
    gray500 = Gray500,
    apricot = Apricot,
    green = Green,
    blue = Blue,

)

val LocalBankSaladColorsProvider = staticCompositionLocalOf { defaultBankSaladColors }
