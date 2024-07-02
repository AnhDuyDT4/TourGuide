package com.jk.tourguide.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jk.tourguide.R

@Composable
fun HeaderView(
    title: String,
    onBackClick: () -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        val interactionSource = remember { MutableInteractionSource() }
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "back",
                Modifier
                    .clickable(
                        interactionSource = interactionSource,
                        indication = null
                    ) {
                        onBackClick.invoke()
                    }
                    .padding(start = 24.dp)

            )
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    modifier = Modifier.align(Alignment.Center),
                    style = com.jk.tourguide.ui.theme.Typography.headlineLarge
                )
            }
            Spacer(modifier = Modifier.width(42.dp))
        }
    }
}

@Preview
@Composable
fun HeaderViewPreview() {
    HeaderView("Header") {

    }
}