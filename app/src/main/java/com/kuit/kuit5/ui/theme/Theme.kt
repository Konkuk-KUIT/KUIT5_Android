package com.kuit.kuit5.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalContext

object BankSaladTheme {
    val colors: BankSaladColors
        @Composable
        @ReadOnlyComposable
        get() = LocalBankSaladColorsProvider.current
    val typography: BankSaladTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalBankSaladTypographyProvider.current
}


@Composable
fun KUIT5Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}