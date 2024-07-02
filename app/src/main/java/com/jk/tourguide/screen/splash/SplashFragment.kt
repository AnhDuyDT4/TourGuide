package com.jk.tourguide.screen.splash

import android.os.Bundle
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.fragment.findNavController
import com.jk.tourguide.R
import com.jk.tourguide.application.AppConstants
import com.jk.tourguide.mvvm.BaseFragment
import com.jk.tourguide.ui.theme.AltoColor
import com.jk.tourguide.ui.theme.Font
import com.jk.tourguide.ui.theme.GreenColor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        CoroutineScope(Dispatchers.Main).launch {
            delay(AppConstants.SPLASH_SCREEN_TIME)
            findNavController().navigate(R.id.toHomeFragment)
        }
    }

    @Composable
    override fun OnComposeView() {

        val travelText = stringResource(R.string.travel)
        val guideText = stringResource(R.string.guide)

        var travelAnimatedText by remember { mutableStateOf("") }
        var guideAnimatedText by remember { mutableStateOf("") }

        LaunchedEffect(Unit) {
            for (i in travelText.indices) {
                travelAnimatedText = travelText.substring(0, i + 1)
                delay(200)
            }

            for (i in guideText.indices) {
                guideAnimatedText = guideText.substring(0, i + 1)
                delay(200)
            }
        }



        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_plash_logo),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(55.dp))
                Text(
                    travelAnimatedText,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Font.urbanistFamily,
                    color = GreenColor,
                    letterSpacing = 8.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    guideAnimatedText,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Font.urbanistFamily,
                    color = AltoColor,
                    letterSpacing = 8.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }
    }

}

@Preview
@Composable
fun SplashFragmentPreview() {
    SplashFragment().OnComposeView()
}