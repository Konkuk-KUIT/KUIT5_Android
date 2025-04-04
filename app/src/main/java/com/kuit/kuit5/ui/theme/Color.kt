package com.kuit.kuit5.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)

val Gray100 = Color(0xFFF6F7F9)
val Gray200 = Color(0xFFF3F4F6)
val Gray300 = Color(0xFFD9D9D9)
val Gray400 = Color(0xFF9FA5B0)
val Gray500 = Color(0xFF666668)

val Apricot = Color(0xFFFFF5E4)
val Green = Color(0xFF09A56F)
val Blue = Color(0xFF0077FF)

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
    val blue: Color
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
    blue = Blue
)

val LocalBankSaladColorsProvider = staticCompositionLocalOf { defaultBankSaladColors }

