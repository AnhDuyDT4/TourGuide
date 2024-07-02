package com.jk.tourguide.screen.event

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jk.tourguide.R
import com.jk.tourguide.mvvm.BaseFragment
import com.jk.tourguide.ui.theme.Typography

class ActivityEventFragment: BaseFragment() {

    @Composable
    override fun OnComposeView() {
        Box(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp)
            ) {
                Text(
                    text = stringResource(R.string.this_feature_is_under_development_please_understand),
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    style = Typography.titleLarge,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }

}