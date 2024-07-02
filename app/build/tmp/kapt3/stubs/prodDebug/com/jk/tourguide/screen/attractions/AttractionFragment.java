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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/jk/tourguide/screen/attractions/AttractionFragment;", "Lcom/jk/tourguide/mvvm/BaseFragment;", "()V", "page", "", "viewModel", "Lcom/jk/tourguide/screen/attractions/AttractionViewModel;", "getViewModel", "()Lcom/jk/tourguide/screen/attractions/AttractionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "OnComposeView", "", "fetchData", "onBack", "Companion", "app_prodDebug"})
@kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalSharedTransitionApi.class})
public final class AttractionFragment extends com.jk.tourguide.mvvm.BaseFragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private int page = 1;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CATEGORY_ID = "category_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ATTRACTION_DETAIL = "attraction_detail";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ATTRACTION_SCREEN = "attraction_screen";
    @org.jetbrains.annotations.NotNull
    public static final com.jk.tourguide.screen.attractions.AttractionFragment.Companion Companion = null;
    
    public AttractionFragment() {
        super();
    }
    
    private final com.jk.tourguide.screen.attractions.AttractionViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void fetchData() {
    }
    
    @java.lang.Override
    @androidx.compose.runtime.Composable
    public void OnComposeView() {
    }
    
    private final void onBack() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/jk/tourguide/screen/attractions/AttractionFragment$Companion;", "", "()V", "ATTRACTION_DETAIL", "", "ATTRACTION_SCREEN", "CATEGORY_ID", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}