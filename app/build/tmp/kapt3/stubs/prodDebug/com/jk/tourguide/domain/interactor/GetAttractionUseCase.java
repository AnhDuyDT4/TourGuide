package com.jk.tourguide.domain.interactor;

import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity;
import com.jk.tourguide.domain.data.model.request.AttractionRequest;
import com.jk.tourguide.domain.repository.attraction.AttractionRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jk/tourguide/domain/interactor/GetAttractionUseCase;", "Lcom/jk/tourguide/domain/interactor/CoroutineFlowUserCase;", "", "Lcom/jk/tourguide/domain/data/model/entity/attraction/AttractionEntity;", "Lcom/jk/tourguide/domain/data/model/request/AttractionRequest;", "attractionRepository", "Lcom/jk/tourguide/domain/repository/attraction/AttractionRepository;", "(Lcom/jk/tourguide/domain/repository/attraction/AttractionRepository;)V", "buildUseCaseObservables", "Lkotlinx/coroutines/flow/Flow;", "params", "app_prodDebug"})
public final class GetAttractionUseCase extends com.jk.tourguide.domain.interactor.CoroutineFlowUserCase<java.util.List<? extends com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity>, com.jk.tourguide.domain.data.model.request.AttractionRequest> {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.repository.attraction.AttractionRepository attractionRepository = null;
    
    public GetAttractionUseCase(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.repository.attraction.AttractionRepository attractionRepository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity>> buildUseCaseObservables(@org.jetbrains.annotations.Nullable
    com.jk.tourguide.domain.data.model.request.AttractionRequest params) {
        return null;
    }
}