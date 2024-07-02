package com.jk.tourguide.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.jk.tourguide.R

object Font {
    val urbanistFamily = FontFamily(
        Font(R.font.urbanist_regular, FontWeight.Normal),
        Font(R.font.urbanist_bold, FontWeight.Bold),
        Font(R.font.urbanist_black, FontWeight.Black),
        Font(R.font.urbanist_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.urbanist_medium, FontWeight.Medium)
    )
}