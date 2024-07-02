package com.jk.tourguide.screen.attractions;

import com.jk.tourguide.application.AppConstants;
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity;
import com.jk.tourguide.domain.data.model.request.AttractionRequest;
import com.jk.tourguide.domain.interactor.GetAttractionUseCase;
import com.jk.tourguide.mvvm.BaseViewModel;
import kotlinx.coroutines.flow.StateFlow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/jk/tourguide/screen/attractions/AttractionViewModel;", "Lcom/jk/tourguide/mvvm/BaseViewModel;", "getAttractionUseCase", "Lcom/jk/tourguide/domain/interactor/GetAttractionUseCase;", "(Lcom/jk/tourguide/domain/interactor/GetAttractionUseCase;)V", "attraction", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/jk/tourguide/domain/data/model/entity/attraction/AttractionEntity;", "getAttraction", "()Lkotlinx/coroutines/flow/StateFlow;", "attractionValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "categoryIds", "", "needLoadMore", "", "", "request", "Lcom/jk/tourguide/domain/data/model/request/AttractionRequest;", "app_prodDebug"})
public final class AttractionViewModel extends com.jk.tourguide.mvvm.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.interactor.GetAttractionUseCase getAttractionUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Integer>> categoryIds = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity>> attractionValue = null;
    private boolean needLoadMore = true;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity>> attraction = null;
    
    public AttractionViewModel(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.interactor.GetAttractionUseCase getAttractionUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity>> getAttraction() {
        return null;
    }
    
    public final void getAttraction(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.request.AttractionRequest request) {
    }
}