package com.jk.tourguide.component

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.progressSemantics
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.util.lerp
import androidx.compose.ui.window.DialogProperties
import com.jk.tourguide.ui.theme.Black40
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

private const val DefaultAnimationDuration = 1000
private val DefaultMaxBallDiameter = 10.dp
private val DefaultMinBallDiameter = 4.dp
private val DefaultDiameter = 40.dp

private const val DefaultMaxAlpha = 1f
private const val DefaultMinAlpha = .4f

@Composable
fun LoadingIndicator(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    animationDuration: Int = DefaultAnimationDuration,
    maxBallDiameter: Dp = DefaultMaxBallDiameter,
    minBallDiameter: Dp = DefaultMinBallDiameter,
    diameter: Dp = DefaultDiameter,
    maxAlpha: Float = DefaultMaxAlpha,
    minAlpha: Float = DefaultMinAlpha,
    isClockwise: Boolean = false
) {
    val transition = rememberInfiniteTransition(label = "")
    val fraction by transition.fraction(animationDuration)

    ProgressIndicator(modifier, diameter) {
        val diameterList = mutableListOf<Float>()
        val alphaList = mutableListOf<Float>()
        for (i in 0..7) {
            val newFraction =
                getShiftedFraction(if (isClockwise) 1 - fraction else fraction, i * .1f)
            lerp(minBallDiameter, maxBallDiameter, newFraction).also { diameterList.add(it.toPx()) }
            lerp(minAlpha, maxAlpha, newFraction).also { alphaList.add(it) }
        }

        drawIndeterminateBallSpinFadeLoaderIndicator(
            maxDiameter = maxBallDiameter.toPx(),
            alpha = alphaList,
            diameter = diameterList,
            color = color
        )
    }
}

private fun DrawScope.drawIndeterminateBallSpinFadeLoaderIndicator(
    maxDiameter: Float,
    diameter: List<Float>,
    alpha: List<Float>,
    color: Color
) {
    for (i in 0..7) {
        val radius = diameter[i] / 2
        val angle = PI.toFloat() / 4 * i
        val x = (size.width - maxDiameter) * cos(angle) / 2
        val y = (size.height - maxDiameter) * sin(angle) / 2

        drawCircle(
            color = color,
            radius = radius,
            center = center + Offset(x, y),
            alpha = alpha[i]
        )
    }
}

@Composable
internal fun ProgressIndicator(
    modifier: Modifier,
    size: Dp,
    onDraw: DrawScope.() -> Unit
) {
    Canvas(
        modifier = modifier
            .progressSemantics()
            .size(size)
            .focusable(),
        onDraw = onDraw
    )
}

internal fun getShiftedFraction(fraction: Float, shift: Float): Float {
    val newFraction = (fraction + shift) % 1
    return (if (newFraction > .5) 1 - newFraction else newFraction) * 2
}

@Composable
internal fun InfiniteTransition.fraction(
    durationMillis: Int,
    delayMillis: Int = 0,
    easing: Easing = LinearEasing
): State<Float> {
    val duration = durationMillis + delayMillis

    return animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                this.durationMillis = duration
                0f at delayMillis / 2 using easing
                1f at durationMillis + (delayMillis / 2)
                1f at duration
            }
        ), label = ""
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoadingIndicatorComponent() {
    AlertDialog(onDismissRequest = { },
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        ),
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Black40
            ),
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Black40)
            ) {
                LoadingIndicator(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .align(Alignment.Center),
                    color = MaterialTheme.colorScheme.primary
                )
            }
        })
}


@Preview
@Composable
fun LoadingIndicatorPreview() {
    LoadingIndicator(
        modifier = Modifier
            .height(60.dp)
            .width(60.dp),
        color = MaterialTheme.colorScheme.primary
    )
}