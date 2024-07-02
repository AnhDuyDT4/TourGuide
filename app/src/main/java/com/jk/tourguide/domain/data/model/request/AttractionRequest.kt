package com.jk.tourguide.domain.data.model.request

data class AttractionRequest(
    val categoryIds: List<Int>? = null,
    val page: Int,
)
