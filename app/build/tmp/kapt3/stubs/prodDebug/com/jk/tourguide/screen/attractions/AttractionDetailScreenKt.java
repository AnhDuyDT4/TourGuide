package com.jk.tourguide.screen.attractions;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ExperimentalSharedTransitionApi;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NavHostController;
import com.jk.tourguide.R;
import com.jk.tourguide.application.AppConstants;
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity;
import com.jk.tourguide.domain.data.model.entity.attraction.ImageEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\u0016\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\u001e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a(\u0010\u0013\u001a\u00020\u0001*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0016"}, d2 = {"ImageGallery", "", "images", "", "Lcom/jk/tourguide/domain/data/model/entity/attraction/ImageEntity;", "initPage", "", "closeClick", "Lkotlin/Function0;", "ListImageView", "WebViewScreen", "url", "", "AttractionDetailInformation", "Landroidx/compose/animation/SharedTransitionScope;", "attraction", "Lcom/jk/tourguide/domain/data/model/entity/attraction/AttractionEntity;", "animatedVisibilityScope", "Landroidx/compose/animation/AnimatedVisibilityScope;", "AttractionDetailScreen", "navController", "Landroidx/navigation/NavHostController;", "app_prodDebug"})
public final class AttractionDetailScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalSharedTransitionApi.class})
    @androidx.compose.runtime.Composable
    public static final void AttractionDetailScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.animation.SharedTransitionScope $this$AttractionDetailScreen, @org.jetbrains.annotations.Nullable
    com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity attraction, @org.jetbrains.annotations.Nullable
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalSharedTransitionApi.class})
    @androidx.compose.runtime.Composable
    public static final void AttractionDetailInformation(@org.jetbrains.annotations.NotNull
    androidx.compose.animation.SharedTransitionScope $this$AttractionDetailInformation, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity attraction, @org.jetbrains.annotations.NotNull
    androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ListImageView(@org.jetbrains.annotations.NotNull
    java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.ImageEntity> images) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable
    public static final void ImageGallery(@org.jetbrains.annotations.NotNull
    java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.ImageEntity> images, int initPage, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> closeClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void WebViewScreen(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> closeClick) {
    }
}