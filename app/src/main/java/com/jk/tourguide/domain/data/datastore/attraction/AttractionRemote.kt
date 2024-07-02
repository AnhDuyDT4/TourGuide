package com.jk.tourguide.domain.data.datastore.attraction

import com.jk.tourguide.domain.data.model.request.AttractionRequest
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse
import kotlinx.coroutines.flow.Flow

interface AttractionRemote{
    fun getAttractions(request: AttractionRequest): Flow<List<AttractionResponse>>
}