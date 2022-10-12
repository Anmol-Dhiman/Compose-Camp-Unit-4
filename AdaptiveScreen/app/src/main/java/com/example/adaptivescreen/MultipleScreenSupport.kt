package com.example.adaptivescreen


import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

data class WindowSize(
    val width: WindowType,
    val height: WindowType
)


enum class WindowType { Compact, Medium, Expanded }

@Composable
fun rememberWindowSize(): WindowSize {
    val configuration = LocalConfiguration.current
    return WindowSize(
        width = getScreenWidth(configuration.screenWidthDp),
        height = getScreenHeight(configuration.screenHeightDp)
    )
}


//we usually check the screen width to find the type of screen
fun getScreenWidth(width: Int): WindowType = when {
//    is a phone screen
    width < 600 -> WindowType.Compact
//    is a small tablet screen
    width < 840 -> WindowType.Medium
//large tablet screen
    else -> WindowType.Expanded
}

fun getScreenHeight(height: Int): WindowType = when {
    height < 480 -> WindowType.Compact
    height < 900 -> WindowType.Medium
    else -> WindowType.Expanded
}