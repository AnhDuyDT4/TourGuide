package com.jk.tourguide.domain.data.remote.model.reponse.attraction

import com.google.gson.annotations.SerializedName

data class AttractionResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("name_zh") val nameZh: String?,
    @SerializedName("open_status") val open_status: Int,
    @SerializedName("introduction") val introduction: String,
    @SerializedName("open_time") val open_time: String?,
    @SerializedName("zipcode") val zipcode: String,
    @SerializedName("district") val district: String,
    @SerializedName("address") val address: String,
    @SerializedName("tel") val tel: String,
    @SerializedName("fax") val fax: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("months") val months: String,
    @SerializedName("nlat") val lat: Double,
    @SerializedName("elong") val long: Double,
    @SerializedName("official_site") val official_site: String?,
    @SerializedName("facebook") val facebook: String?,
    @SerializedName("ticket") val ticket: String?,
    @SerializedName("remind") val remind: String?,
    @SerializedName("staytime") val stayTime: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("service") val service: List<ServiceResponse>,
    @SerializedName("images") val images: List<ImageResponse>
)

data class ServiceResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String
)

data class ImageResponse(
    @SerializedName("src") val src: String,
    @SerializedName("ext") val ext: String
)
