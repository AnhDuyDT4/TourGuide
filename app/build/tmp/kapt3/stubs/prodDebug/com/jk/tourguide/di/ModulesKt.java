package com.jk.tourguide.di;

import android.content.Context;
import com.jk.tourguide.BuildConfig;
import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository;
import com.jk.tourguide.domain.data.cache.SharedPrefs;
import com.jk.tourguide.domain.data.cache.SharedPrefsApi;
import com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote;
import com.jk.tourguide.domain.data.datastore.category.CategoryRemote;
import com.jk.tourguide.domain.data.model.entity.mapper.attraction.AttractionMapper;
import com.jk.tourguide.domain.data.model.entity.mapper.attraction.ImageMapper;
import com.jk.tourguide.domain.data.model.entity.mapper.attraction.ServiceMapper;
import com.jk.tourguide.domain.data.model.entity.mapper.categry.CategoryMapper;
import com.jk.tourguide.domain.data.remote.retrofit.ServiceFactory;
import com.jk.tourguide.domain.data.remote.retrofit.imp.AttractionsImp;
import com.jk.tourguide.domain.data.remote.retrofit.imp.MiscellaneousImp;
import com.jk.tourguide.domain.data.remote.retrofit.service.AttractionService;
import com.jk.tourguide.domain.data.remote.retrofit.service.MiscellaneousService;
import com.jk.tourguide.domain.interactor.GetAttractionUseCase;
import com.jk.tourguide.domain.interactor.GetCategoriesUserCase;
import com.jk.tourguide.domain.repository.attraction.AttractionDataRepository;
import com.jk.tourguide.domain.repository.attraction.AttractionRepository;
import com.jk.tourguide.domain.repository.category.CategoryDataRepository;
import com.jk.tourguide.domain.repository.category.CategoryRepository;
import com.jk.tourguide.screen.attractions.AttractionViewModel;
import com.jk.tourguide.screen.category.CategoriesViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\u00a8\u0006\f"}, d2 = {"dataStoreModule", "Lorg/koin/core/module/Module;", "getDataStoreModule", "()Lorg/koin/core/module/Module;", "mapperModule", "getMapperModule", "repositoryModule", "getRepositoryModule", "userCaseModule", "getUserCaseModule", "viewModelModule", "getViewModelModule", "app_prodDebug"})
public final class ModulesKt {
    @org.jetbrains.annotations.NotNull
    private static final org.koin.core.module.Module viewModelModule = null;
    @org.jetbrains.annotations.NotNull
    private static final org.koin.core.module.Module userCaseModule = null;
    @org.jetbrains.annotations.NotNull
    private static final org.koin.core.module.Module mapperModule = null;
    @org.jetbrains.annotations.NotNull
    private static final org.koin.core.module.Module repositoryModule = null;
    @org.jetbrains.annotations.NotNull
    private static final org.koin.core.module.Module dataStoreModule = null;
    
    @org.jetbrains.annotations.NotNull
    public static final org.koin.core.module.Module getViewModelModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.koin.core.module.Module getUserCaseModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.koin.core.module.Module getMapperModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.koin.core.module.Module getRepositoryModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.koin.core.module.Module getDataStoreModule() {
        return null;
    }
}