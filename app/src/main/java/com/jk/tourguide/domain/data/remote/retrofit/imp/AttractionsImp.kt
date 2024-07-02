package com.jk.tourguide.domain.data.remote.retrofit.imp

import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository
import com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote
import com.jk.tourguide.domain.data.model.request.AttractionRequest
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse
import com.jk.tourguide.domain.data.remote.retrofit.service.AttractionService
import com.jk.tourguide.extention.LanguageType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class AttractionsImp(
    private val attractionService: AttractionService,
    private val sharedPreferences: CacheSharedPreferencesRepository
) : AttractionRemote {
    override fun getAttractions(request: AttractionRequest): Flow<List<AttractionResponse>> {
        return flow {
            val response =
                attractionService.getAttractions(
                    sharedPreferences.getLang()?:LanguageType.ENGLISH.value,
                    request.categoryIds?.joinToString(separator = ",")?:"",
                    request.page).data
            emit(response?: emptyList())
        }
    }
}