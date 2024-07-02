package com.jk.tourguide.domain.data.datastore.category

import com.jk.tourguide.domain.data.remote.model.reponse.category.CategoryResponse
import com.jk.tourguide.extention.CategoryType
import kotlinx.coroutines.flow.Flow

interface CategoryRemote {
    fun getCategories(type: CategoryType): Flow<List<CategoryResponse>>
}