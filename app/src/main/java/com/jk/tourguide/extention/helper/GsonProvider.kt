package com.jk.tourguide.extention.helper

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonSyntaxException


object GsonProvider {
    private val gson = GsonBuilder()
        .registerTypeAdapterFactory(JsonFailSafeTypeAdapterFactory.get())
        .excludeFieldsWithoutExposeAnnotation()
        .create()

    @Synchronized
    fun get(): Gson {
        return gson
    }

    fun <T> tryToParse(json: String, javaClass: Class<T>?): T? {
        return try {
            get().fromJson(json, javaClass)
        } catch (exception: JsonSyntaxException) {
            null
        }
    }
}