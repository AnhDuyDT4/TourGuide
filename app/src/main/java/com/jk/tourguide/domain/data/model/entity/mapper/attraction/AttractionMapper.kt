package com.jk.tourguide.domain.data.model.entity.mapper.attraction

import com.jk.sl.domain.data.model.entity.mapper.IEntityMapper
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity
import com.jk.tourguide.domain.data.model.entity.attraction.ImageEntity
import com.jk.tourguide.domain.data.model.entity.attraction.ServiceEntity
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.ImageResponse
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.ServiceResponse
import com.jk.tourguide.extention.OpenStatus

class AttractionMapper(
    private val imageMapper: ImageMapper,
    private val serviceMapper: ServiceMapper
): IEntityMapper<AttractionEntity, AttractionResponse> {
    override fun mapToEntity(type: AttractionResponse): AttractionEntity {
        return AttractionEntity(
            type.id,
            type.name,
            type.introduction,
            type.images.map { imageMapper.mapToEntity(it) },
            type.lat,
            type.long,
            type.open_time,
            OpenStatus.fromValue(type.open_status),
            type.address,
            type.official_site?:type.url?:"",
            type.service.map { serviceMapper.mapToEntity(it) }
        )
    }
}

class ServiceMapper : IEntityMapper<ServiceEntity, ServiceResponse> {
    override fun mapToEntity(type: ServiceResponse): ServiceEntity {
        return ServiceEntity(
            type.id,
            type.name
        )
    }
}

class ImageMapper: IEntityMapper<ImageEntity, ImageResponse> {

    override fun mapToEntity(type: ImageResponse): ImageEntity {
       return ImageEntity(
           type.src,
           type.ext
       )
    }
}