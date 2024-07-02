package com.jk.tourguide.domain.data.remote.retrofit.imp;

import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository;
import com.jk.tourguide.domain.data.datastore.category.CategoryRemote;
import com.jk.tourguide.domain.data.remote.model.reponse.category.CategoryResponse;
import com.jk.tourguide.domain.data.remote.retrofit.service.MiscellaneousService;
import com.jk.tourguide.extention.CategoryType;
import com.jk.tourguide.extention.LanguageType;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jk/tourguide/domain/data/remote/retrofit/imp/MiscellaneousImp;", "Lcom/jk/tourguide/domain/data/datastore/category/CategoryRemote;", "miscellaneousService", "Lcom/jk/tourguide/domain/data/remote/retrofit/service/MiscellaneousService;", "sharedPreferences", "Lcom/jk/tourguide/domain/data/cache/CacheSharedPreferencesRepository;", "(Lcom/jk/tourguide/domain/data/remote/retrofit/service/MiscellaneousService;Lcom/jk/tourguide/domain/data/cache/CacheSharedPreferencesRepository;)V", "getCategories", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/jk/tourguide/domain/data/remote/model/reponse/category/CategoryResponse;", "type", "Lcom/jk/tourguide/extention/CategoryType;", "app_prodDebug"})
public final class MiscellaneousImp implements com.jk.tourguide.domain.data.datastore.category.CategoryRemote {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.remote.retrofit.service.MiscellaneousService miscellaneousService = null;
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository sharedPreferences = null;
    
    public MiscellaneousImp(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.remote.retrofit.service.MiscellaneousService miscellaneousService, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository sharedPreferences) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.category.CategoryResponse>> getCategories(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.extention.CategoryType type) {
        return null;
    }
}