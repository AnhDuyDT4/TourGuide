package com.jk.tourguide.domain.data.remote.retrofit.imp;

import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository;
import com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote;
import com.jk.tourguide.domain.data.model.request.AttractionRequest;
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse;
import com.jk.tourguide.domain.data.remote.retrofit.service.AttractionService;
import com.jk.tourguide.extention.LanguageType;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jk/tourguide/domain/data/remote/retrofit/imp/AttractionsImp;", "Lcom/jk/tourguide/domain/data/datastore/attraction/AttractionRemote;", "attractionService", "Lcom/jk/tourguide/domain/data/remote/retrofit/service/AttractionService;", "sharedPreferences", "Lcom/jk/tourguide/domain/data/cache/CacheSharedPreferencesRepository;", "(Lcom/jk/tourguide/domain/data/remote/retrofit/service/AttractionService;Lcom/jk/tourguide/domain/data/cache/CacheSharedPreferencesRepository;)V", "getAttractions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/jk/tourguide/domain/data/remote/model/reponse/attraction/AttractionResponse;", "request", "Lcom/jk/tourguide/domain/data/model/request/AttractionRequest;", "app_prodDebug"})
public final class AttractionsImp implements com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.remote.retrofit.service.AttractionService attractionService = null;
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository sharedPreferences = null;
    
    public AttractionsImp(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.remote.retrofit.service.AttractionService attractionService, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository sharedPreferences) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse>> getAttractions(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.request.AttractionRequest request) {
        return null;
    }
}