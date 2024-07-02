package com.jk.tourguide.screen.attractions;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ExperimentalSharedTransitionApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontStyle;
import com.google.gson.Gson;
import com.jk.tourguide.R;
import com.jk.tourguide.application.AppConstants;
import com.jk.tourguide.component.DialogType;
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity;
import com.jk.tourguide.domain.data.model.request.AttractionRequest;
import com.jk.tourguide.mvvm.BaseFragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a,\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a8\u0006\u0012"}, d2 = {"AttractionScreen", "", "Landroidx/compose/animation/SharedTransitionScope;", "attractions", "", "Lcom/jk/tourguide/domain/data/model/entity/attraction/AttractionEntity;", "isLoading", "", "onItemClick", "Lkotlin/Function1;", "onLoadMore", "Lkotlin/Function0;", "onBack", "animatedVisibilityScope", "Landroidx/compose/animation/AnimatedVisibilityScope;", "ItemAttraction", "item", "onClick", "app_prodDebug"})
public final class AttractionFragmentKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalSharedTransitionApi.class})
    @androidx.compose.runtime.Composable
    public static final void AttractionScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.animation.SharedTransitionScope $this$AttractionScreen, @org.jetbrains.annotations.NotNull
    java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity> attractions, boolean isLoading, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBack, @org.jetbrains.annotations.NotNull
    androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalSharedTransitionApi.class})
    @androidx.compose.runtime.Composable
    public static final void ItemAttraction(@org.jetbrains.annotations.NotNull
    androidx.compose.animation.SharedTransitionScope $this$ItemAttraction, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity item, @org.jetbrains.annotations.NotNull
    androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
}