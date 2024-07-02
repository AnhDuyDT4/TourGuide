package com.jk.tourguide.domain.data.remote.model.reponse.category

data class CategoryResponse (
    val id: Int,
    val name: String
)

data class CategoryListResponse (
    val Category: List<CategoryResponse>
)
