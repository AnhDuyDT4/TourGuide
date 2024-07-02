package com.jk.sl.domain.data.model.entity.mapper

interface IEntityMapper<out E, in R> {
    fun mapToEntity(type: R) : E
}