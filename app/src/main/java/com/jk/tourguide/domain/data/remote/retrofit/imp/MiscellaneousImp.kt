package com.jk.tourguide.domain.data.remote.retrofit.imp

import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository
import com.jk.tourguide.domain.data.datastore.category.CategoryRemote
import com.jk.tourguide.domain.data.remote.model.reponse.category.CategoryResponse
import com.jk.tourguide.domain.data.remote.retrofit.service.MiscellaneousService
import com.jk.tourguide.extention.CategoryType
import com.jk.tourguide.extention.LanguageType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MiscellaneousImp(
    private val miscellaneousService: MiscellaneousService,
    private val sharedPreferences: CacheSharedPreferencesRepository
) : CategoryRemote {
    override fun getCategories(type: CategoryType): Flow<List<CategoryResponse>> {
        return flow {
            val response =
                miscellaneousService.getCategories(sharedPreferences.getLang()?:LanguageType.ENGLISH.value, type.type).data?.Category
            emit(response ?: emptyList())
        }
    }
}