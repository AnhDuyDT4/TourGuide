package com.jk.tourguide.component;

import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.window.DialogProperties;
import com.jk.tourguide.ui.theme.Font;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/jk/tourguide/component/DialogType;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "WARNING", "app_prodDebug"})
public enum DialogType {
    /*public static final*/ SUCCESS /* = new SUCCESS() */,
    /*public static final*/ ERROR /* = new ERROR() */,
    /*public static final*/ WARNING /* = new WARNING() */;
    
    DialogType() {
    }
    
    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.EnumEntries<com.jk.tourguide.component.DialogType> getEntries() {
        return null;
    }
}