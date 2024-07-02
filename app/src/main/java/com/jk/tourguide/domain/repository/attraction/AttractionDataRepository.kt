package com.jk.tourguide.domain.repository.attraction

import com.jk.tourguide.domain.data.datastore.attraction.AttractionRemote
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity
import com.jk.tourguide.domain.data.model.entity.mapper.attraction.AttractionMapper
import com.jk.tourguide.domain.data.model.request.AttractionRequest
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class AttractionDataRepository(
    private val attractionRemote: AttractionRemote,
    private val mapper: AttractionMapper
) : AttractionRepository {

    override fun getAttractions(request: AttractionRequest): Flow<List<AttractionEntity>> {
        return flow {
            attractionRemote.getAttractions(request).collect { response ->
                val result = response.map {
                    mapper.mapToEntity(it)
                }
                emit(result)
            }
        }
    }

}