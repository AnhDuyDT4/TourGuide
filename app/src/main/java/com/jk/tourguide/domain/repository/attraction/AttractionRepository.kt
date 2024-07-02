package com.jk.tourguide.domain.repository.attraction

import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity
import com.jk.tourguide.domain.data.model.request.AttractionRequest
import kotlinx.coroutines.flow.Flow

interface AttractionRepository {
    fun getAttractions(request: AttractionRequest): Flow<List<AttractionEntity>>
}