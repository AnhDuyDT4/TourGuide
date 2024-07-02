package com.jk.tourguide.domain.data.remote.retrofit.service

import com.jk.tourguide.domain.data.remote.model.BaseResponse
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AttractionService {

    @GET("{lang}/Attractions/All")
    suspend fun getAttractions(
        @Path("lang") lang: String,
        @Query("categoryIds") id: String,
        @Query("page") page: Int
    ): BaseResponse<List<AttractionResponse>>
}