package com.jk.tourguide.domain.interactor

import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity
import com.jk.tourguide.domain.data.model.request.AttractionRequest
import com.jk.tourguide.domain.repository.attraction.AttractionRepository
import kotlinx.coroutines.flow.Flow

class GetAttractionUseCase(
    private val attractionRepository: AttractionRepository
) : CoroutineFlowUserCase<List<AttractionEntity>, AttractionRequest>() {
    override fun buildUseCaseObservables(params: AttractionRequest?): Flow<List<AttractionEntity>> {
        return attractionRepository.getAttractions(params!!)
    }
}