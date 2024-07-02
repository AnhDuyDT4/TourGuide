package com.jk.tourguide.screen.category;

import androidx.compose.foundation.layout.ExperimentalLayoutApi;
import androidx.compose.runtime.Composable;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import com.google.gson.Gson;
import com.jk.tourguide.R;
import com.jk.tourguide.application.MainActivity;
import com.jk.tourguide.component.DialogType;
import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity;
import com.jk.tourguide.mvvm.BaseFragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a0\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a&\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"CategoriesFragmentPreview", "", "CategoriesScreen", "categories", "", "Lcom/jk/tourguide/domain/data/model/entity/category/CategoryEntity;", "onShowAttractions", "Lkotlin/Function1;", "", "CategoryItem", "item", "selected", "", "onClick", "Lkotlin/Function0;", "app_prodDebug"})
public final class CategoriesFragmentKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.layout.ExperimentalLayoutApi.class})
    @androidx.compose.runtime.Composable
    public static final void CategoriesScreen(@org.jetbrains.annotations.NotNull
    java.util.List<com.jk.tourguide.domain.data.model.entity.category.CategoryEntity> categories, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Integer>, kotlin.Unit> onShowAttractions) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CategoryItem(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.entity.category.CategoryEntity item, boolean selected, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    public static final void CategoriesFragmentPreview() {
    }
}