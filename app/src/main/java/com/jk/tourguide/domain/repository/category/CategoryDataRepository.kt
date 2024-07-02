package com.jk.tourguide.domain.repository.category

import com.jk.tourguide.domain.data.datastore.category.CategoryRemote
import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity
import com.jk.tourguide.domain.data.model.entity.mapper.categry.CategoryMapper
import com.jk.tourguide.extention.CategoryType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CategoryDataRepository(
    private val categoryRemote: CategoryRemote,
    private val categoryMapper: CategoryMapper
) : CategoryRepository {

    override fun getCategories(type: CategoryType): Flow<List<CategoryEntity>> {
        return flow {
            categoryRemote.getCategories(type).collect { list ->
                val mappedList = list.map { data ->
                    categoryMapper.mapToEntity(data)
                }
                emit(mappedList)
            }
        }
    }
}