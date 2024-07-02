package com.jk.tourguide.di

import android.content.Context
import com.jk.tourguide.BuildConfig
import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository
import com.jk.tourguide.domain.data.cache.PREFS_NAME
import com.jk.tourguide.domain.data.cache.SharedPrefs
import com.jk.tourguide.domain.data.cache.SharedPrefsApi
import com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote
import com.jk.tourguide.domain.data.datastore.category.CategoryRemote
import com.jk.tourguide.domain.data.model.entity.mapper.attraction.AttractionMapper
import com.jk.tourguide.domain.data.model.entity.mapper.attraction.ImageMapper
import com.jk.tourguide.domain.data.model.entity.mapper.attraction.ServiceMapper
import com.jk.tourguide.domain.data.model.entity.mapper.categry.CategoryMapper
import com.jk.tourguide.domain.data.remote.retrofit.ServiceFactory
import com.jk.tourguide.domain.data.remote.retrofit.imp.AttractionsImp
import com.jk.tourguide.domain.data.remote.retrofit.imp.MiscellaneousImp
import com.jk.tourguide.domain.data.remote.retrofit.service.AttractionService
import com.jk.tourguide.domain.data.remote.retrofit.service.MiscellaneousService
import com.jk.tourguide.domain.interactor.GetAttractionUseCase
import com.jk.tourguide.domain.interactor.GetCategoriesUserCase
import com.jk.tourguide.domain.repository.attraction.AttractionDataRepository
import com.jk.tourguide.domain.repository.attraction.AttractionRepository
import com.jk.tourguide.domain.repository.category.CategoryDataRepository
import com.jk.tourguide.domain.repository.category.CategoryRepository
import com.jk.tourguide.screen.attractions.AttractionViewModel
import com.jk.tourguide.screen.category.CategoriesViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { AttractionViewModel(get()) }

    viewModel { CategoriesViewModel(get()) }
}

val userCaseModule = module {

    single {
        GetCategoriesUserCase(get())
    }

    single {
        GetAttractionUseCase(get())
    }

}

val mapperModule = module {

    single { CategoryMapper() }

    single { AttractionMapper(get(),get()) }

    single { ImageMapper() }

    single { ServiceMapper() }

}

val repositoryModule = module {

    single<CategoryRepository> {
        CategoryDataRepository(get(), get())
    }

    single<AttractionRepository> {
        AttractionDataRepository(get(), get())
    }

}

val dataStoreModule = module {

    single {
        ServiceFactory.makeService(BuildConfig.API_BASE_URL, MiscellaneousService::class.java)
    }

    single {
        ServiceFactory.makeService(BuildConfig.API_BASE_URL, AttractionService::class.java)
    }

    single<SharedPrefs> { SharedPrefsApi(androidContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)) }

    single { CacheSharedPreferencesRepository(get()) }

    single<CategoryRemote> {
        MiscellaneousImp(get(),get())
    }

    single<AttractionRemote> {
        AttractionsImp(get(),get())
    }

}