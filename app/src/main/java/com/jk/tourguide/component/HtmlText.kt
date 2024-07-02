package com.jk.tourguide.component

import android.text.Html
import android.text.Spanned
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString

@Composable
fun HtmlText(html: String, modifier: Modifier = Modifier, style: TextStyle) {
    val spanned: Spanned = Html.fromHtml(html, Html.FROM_HTML_SEPARATOR_LINE_BREAK_LIST)
    val annotatedString = buildAnnotatedString {
        append(spanned.toString())
    }

    BasicText(
        text = annotatedString,
        modifier = modifier,
        style = style
    )
}
