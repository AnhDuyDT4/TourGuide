package com.jk.tourguide.domain.repository.attraction;

import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity;
import com.jk.tourguide.domain.data.model.request.AttractionRequest;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/jk/tourguide/domain/repository/attraction/AttractionRepository;", "", "getAttractions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/jk/tourguide/domain/data/model/entity/attraction/AttractionEntity;", "request", "Lcom/jk/tourguide/domain/data/model/request/AttractionRequest;", "app_prodDebug"})
public abstract interface AttractionRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity>> getAttractions(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.request.AttractionRequest request);
}