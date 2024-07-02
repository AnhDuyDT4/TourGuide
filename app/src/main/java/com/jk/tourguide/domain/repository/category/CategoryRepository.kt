package com.jk.tourguide.domain.repository.category

import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity
import com.jk.tourguide.extention.CategoryType
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
    fun getCategories(type: CategoryType): Flow<List<CategoryEntity>>
}