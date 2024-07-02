package com.jk.tourguide.component;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000^\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001ao\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a\b\u0010\u001a\u001a\u00020\u000bH\u0007\u001a\b\u0010\u001b\u001a\u00020\u000bH\u0007\u001a>\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00032\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b0\u001f\u00a2\u0006\u0002\b!H\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\"\u0010#\u001a\u0018\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0000\u001aE\u0010\'\u001a\u00020\u000b*\u00020 2\u0006\u0010(\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010,\u001a.\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060-*\u00020.2\u0006\u0010/\u001a\u00020\u00012\b\b\u0002\u00100\u001a\u00020\u00012\b\b\u0002\u00101\u001a\u000202H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00063"}, d2 = {"DefaultAnimationDuration", "", "DefaultDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "DefaultMaxAlpha", "", "DefaultMaxBallDiameter", "DefaultMinAlpha", "DefaultMinBallDiameter", "LoadingIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "animationDuration", "maxBallDiameter", "minBallDiameter", "diameter", "maxAlpha", "minAlpha", "isClockwise", "", "LoadingIndicator-AJdJOJA", "(Landroidx/compose/ui/Modifier;JIFFFFFZ)V", "LoadingIndicatorComponent", "LoadingIndicatorPreview", "ProgressIndicator", "size", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "ProgressIndicator-lG28NQ4", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;)V", "getShiftedFraction", "fraction", "shift", "drawIndeterminateBallSpinFadeLoaderIndicator", "maxDiameter", "", "alpha", "drawIndeterminateBallSpinFadeLoaderIndicator-xwkQ0AY", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLjava/util/List;Ljava/util/List;J)V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/InfiniteTransition;", "durationMillis", "delayMillis", "easing", "Landroidx/compose/animation/core/Easing;", "app_prodDebug"})
public final class LoadingIndicatorKt {
    private static final int DefaultAnimationDuration = 1000;
    private static final float DefaultMaxBallDiameter = 0.0F;
    private static final float DefaultMinBallDiameter = 0.0F;
    private static final float DefaultDiameter = 0.0F;
    private static final float DefaultMaxAlpha = 1.0F;
    private static final float DefaultMinAlpha = 0.4F;
    
    public static final float getShiftedFraction(float fraction, float shift) {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.State<java.lang.Float> fraction(@org.jetbrains.annotations.NotNull
    androidx.compose.animation.core.InfiniteTransition $this$fraction, int durationMillis, int delayMillis, @org.jetbrains.annotations.NotNull
    androidx.compose.animation.core.Easing easing) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void LoadingIndicatorComponent() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    public static final void LoadingIndicatorPreview() {
    }
}