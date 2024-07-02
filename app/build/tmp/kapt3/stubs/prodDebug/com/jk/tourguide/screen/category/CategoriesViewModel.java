package com.jk.tourguide.screen.category;

import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity;
import com.jk.tourguide.domain.interactor.GetCategoriesUserCase;
import com.jk.tourguide.extention.CategoryType;
import com.jk.tourguide.mvvm.BaseViewModel;
import kotlinx.coroutines.flow.StateFlow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jk/tourguide/screen/category/CategoriesViewModel;", "Lcom/jk/tourguide/mvvm/BaseViewModel;", "getCategories", "Lcom/jk/tourguide/domain/interactor/GetCategoriesUserCase;", "(Lcom/jk/tourguide/domain/interactor/GetCategoriesUserCase;)V", "categories", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/jk/tourguide/domain/data/model/entity/category/CategoryEntity;", "()Lkotlinx/coroutines/flow/StateFlow;", "categoriesValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "app_prodDebug"})
public final class CategoriesViewModel extends com.jk.tourguide.mvvm.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.interactor.GetCategoriesUserCase getCategories = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.jk.tourguide.domain.data.model.entity.category.CategoryEntity>> categoriesValue = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.jk.tourguide.domain.data.model.entity.category.CategoryEntity>> categories = null;
    
    public CategoriesViewModel(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.interactor.GetCategoriesUserCase getCategories) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.jk.tourguide.domain.data.model.entity.category.CategoryEntity>> getCategories() {
        return null;
    }
    
    public final void getCategories() {
    }
}