package com.jk.tourguide.domain.data.model.entity.attraction

import androidx.compose.runtime.Immutable
import java.util.UUID

@Immutable
data class AttractionEntity(
    val id: Int,
    val name: String,
    val description: String,
    val image: List<ImageEntity>,
    val latitude: Double,
    val longitude: Double,
    val openTime: String?,
    val status: Int,
    val address: String,
    val officialSite: String,
    val services: List<ServiceEntity>,
    val idKey: String = UUID.randomUUID().toString()
)


@Immutable
data class ImageEntity(
    val src: String,
    val ext: String
)

@Immutable
data class ServiceEntity(
    val id: Int,
    val name: String
)
