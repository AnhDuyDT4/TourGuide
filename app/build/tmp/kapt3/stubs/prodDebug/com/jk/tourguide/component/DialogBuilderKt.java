package com.jk.tourguide.component;

import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.window.DialogProperties;
import com.jk.tourguide.ui.theme.Font;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\f\u001a\u00020\u0001H\u0007\u00a8\u0006\r"}, d2 = {"DialogBuilder", "", "type", "Lcom/jk/tourguide/component/DialogType;", "description", "", "onPositiveClick", "Lkotlin/Function0;", "onNegativeClick", "positiveAction", "negativeAction", "GetTitle", "PreviewDialog", "app_prodDebug"})
public final class DialogBuilderKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void DialogBuilder(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.component.DialogType type, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onPositiveClick, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onNegativeClick, @org.jetbrains.annotations.Nullable
    java.lang.String positiveAction, @org.jetbrains.annotations.Nullable
    java.lang.String negativeAction) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void GetTitle(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.component.DialogType type) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    public static final void PreviewDialog() {
    }
}