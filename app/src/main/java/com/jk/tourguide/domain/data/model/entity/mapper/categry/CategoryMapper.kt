package com.jk.tourguide.domain.data.model.entity.mapper.categry

import com.jk.sl.domain.data.model.entity.mapper.IEntityMapper
import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity
import com.jk.tourguide.domain.data.remote.model.reponse.category.CategoryResponse

class CategoryMapper: IEntityMapper<CategoryEntity,CategoryResponse> {
    override fun mapToEntity(type: CategoryResponse): CategoryEntity {
        return CategoryEntity(
            id = type.id,
            name = type.name
        )
    }
}