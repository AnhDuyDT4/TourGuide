package com.jk.tourguide.domain.data.remote.retrofit.service

import com.jk.tourguide.domain.data.remote.model.BaseResponse
import com.jk.tourguide.domain.data.remote.model.reponse.category.CategoryListResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MiscellaneousService {

    @GET("{lang}/Miscellaneous/Categories")
    suspend fun getCategories(@Path("lang") lang: String, @Query("type") type: String): BaseResponse<CategoryListResponse>

}