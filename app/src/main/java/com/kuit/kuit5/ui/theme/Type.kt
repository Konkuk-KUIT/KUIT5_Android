package com.kuit.kuit5.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R

val bankSaladFontBold = FontFamily(Font(R.font.pretendard_bold))
val bankSaladFontSemiBold = FontFamily(Font(R.font.pretendard_semibold))
val bankSaladFontMedium = FontFamily(Font(R.font.pretendard_medium))
val bankSaladFontRegular = FontFamily(Font(R.font.pretendard_regular))

@Immutable
data class BankSaladTypography(
    // Head
    val head_01_B_24: TextStyle,
    val head_02_B_20: TextStyle,
    val head_03_B_16: TextStyle,
    val head_03_SB_16: TextStyle,
    val head_03_R_16: TextStyle,
    val head_04_SB_14: TextStyle,
    val head_05_B_10: TextStyle,

    // Body
    val body_01_M_14: TextStyle,
    val body_01_R_14: TextStyle,
    val body_02_SB_12: TextStyle,
    val body_02_R_12: TextStyle,

    // Caption
    val caption_01_R_10: TextStyle
)
val defaultBankSaladTypography = BankSaladTypography(
    // Head
    head_01_B_24 = TextStyle(
        fontFamily = bankSaladFontBold,
        fontSize = 24.sp,
        lineHeight = 24.sp
    ),
    head_02_B_20 = TextStyle(
        fontFamily = bankSaladFontBold,
        fontSize = 20.sp,
        lineHeight = 20.sp
    ),
    head_03_B_16 = TextStyle(
        fontFamily = bankSaladFontBold,
        fontSize = 16.sp,
        lineHeight = 16.sp
    ),
    head_03_SB_16 = TextStyle(
        fontFamily = bankSaladFontSemiBold,
        fontSize = 16.sp,
        lineHeight = 16.sp
    ),
    head_03_R_16 = TextStyle(
        fontFamily = bankSaladFontRegular,
        fontSize = 16.sp,
        lineHeight = 16.sp
    ),
    head_04_SB_14 = TextStyle(
        fontFamily = bankSaladFontSemiBold,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    head_05_B_10 = TextStyle(
        fontFamily = bankSaladFontBold,
        fontSize = 10.sp,
        lineHeight = 10.sp
    ),

    // Body
    body_01_M_14 = TextStyle(
        fontFamily = bankSaladFontMedium,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    body_01_R_14 = TextStyle(
        fontFamily = bankSaladFontRegular,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    body_02_SB_12 = TextStyle(
        fontFamily = bankSaladFontSemiBold,
        fontSize = 12.sp,
        lineHeight = 12.sp
    ),
    body_02_R_12 = TextStyle(
        fontFamily = bankSaladFontRegular,
        fontSize = 12.sp,
        lineHeight = 12.sp
    ),

    // Caption
    caption_01_R_10 = TextStyle(
        fontFamily = bankSaladFontRegular,
        fontSize = 10.sp,
        lineHeight = 10.sp
    )
)

val LocalBankSaladTypographyProvider = staticCompositionLocalOf { defaultBankSaladTypography }

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)