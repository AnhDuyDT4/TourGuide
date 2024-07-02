package com.jk.tourguide.domain.interactor

import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity
import com.jk.tourguide.domain.repository.category.CategoryRepository
import com.jk.tourguide.extention.CategoryType
import kotlinx.coroutines.flow.Flow

class GetCategoriesUserCase(
    private val categoryRepository: CategoryRepository
) : CoroutineFlowUserCase<List<CategoryEntity>, CategoryType>() {
    override fun buildUseCaseObservables(params: CategoryType?): Flow<List<CategoryEntity>> {
        return categoryRepository.getCategories(params?:CategoryType.ATTRACTIONS)
    }
}