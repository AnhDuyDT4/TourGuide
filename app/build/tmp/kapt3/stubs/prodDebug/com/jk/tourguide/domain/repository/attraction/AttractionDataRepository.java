package com.jk.tourguide.domain.repository.attraction;

import com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote;
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity;
import com.jk.tourguide.domain.data.model.entity.mapper.attraction.AttractionMapper;
import com.jk.tourguide.domain.data.model.request.AttractionRequest;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jk/tourguide/domain/repository/attraction/AttractionDataRepository;", "Lcom/jk/tourguide/domain/repository/attraction/AttractionRepository;", "attractionRemote", "Lcom/jk/tourguide/domain/data/datastore/attraction/AttractionRemote;", "mapper", "Lcom/jk/tourguide/domain/data/model/entity/mapper/attraction/AttractionMapper;", "(Lcom/jk/tourguide/domain/data/datastore/attraction/AttractionRemote;Lcom/jk/tourguide/domain/data/model/entity/mapper/attraction/AttractionMapper;)V", "getAttractions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/jk/tourguide/domain/data/model/entity/attraction/AttractionEntity;", "request", "Lcom/jk/tourguide/domain/data/model/request/AttractionRequest;", "app_prodDebug"})
public final class AttractionDataRepository implements com.jk.tourguide.domain.repository.attraction.AttractionRepository {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote attractionRemote = null;
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.model.entity.mapper.attraction.AttractionMapper mapper = null;
    
    public AttractionDataRepository(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote attractionRemote, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.entity.mapper.attraction.AttractionMapper mapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity>> getAttractions(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.request.AttractionRequest request) {
        return null;
    }
}