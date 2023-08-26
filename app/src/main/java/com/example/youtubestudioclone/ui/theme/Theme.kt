package com.example.youtubestudioclone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color(0xFF52ba45),
//    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Color(0xff8d7289),
    primaryVariant = Color(0xFFFFFFFF),
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun YoutubeStudioCloneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

//private val LightColorPalette = lightColors(
//    primary = Color.Blue,
//    primaryVariant = Color.Blue,
//    secondary = Color.Magenta
//)
//
//private val DarkColorPalette = darkColors(
//    primary = Color.Green,
//    primaryVariant = Color.Green,
//    secondary = Color.Cyan
//)
//
//@Composable
//fun MyMaterialTheme(
//    darkTheme: Boolean = isSystemInDarkTheme(),
//    content: @Composable () -> Unit
//) {
//    MaterialTheme(
//        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
//        content = content
//    )
//}
