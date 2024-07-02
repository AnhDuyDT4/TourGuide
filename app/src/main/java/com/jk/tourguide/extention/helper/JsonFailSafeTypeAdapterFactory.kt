package com.jk.tourguide.extention.helper

import com.google.gson.Gson
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter
import com.google.gson.stream.MalformedJsonException
import java.io.IOException
import java.lang.AssertionError
import java.lang.RuntimeException

class JsonFailSafeTypeAdapterFactory private constructor() : TypeAdapterFactory {
    override fun <T> create(gson: Gson, typeToken: TypeToken<T>): TypeAdapter<T>? {
        if (typeToken.rawType.isPrimitive) {
            return null
        }
        val delegateTypeAdapter = gson.getDelegateAdapter(this, typeToken)
        return JsonFailSafeTypeAdapter(delegateTypeAdapter)
    }

    private class JsonFailSafeTypeAdapter<T>(private val delegateTypeAdapter: TypeAdapter<T>) :
        TypeAdapter<T>() {
        @Throws(IOException::class)
        override fun write(out: JsonWriter, value: T) {
            delegateTypeAdapter.write(out, value)
        }

        @Throws(IOException::class)
        override fun read(`in`: JsonReader): T? {
            return try {
                delegateTypeAdapter.read(`in`)
            } catch (ignored: MalformedJsonException) {
                fallback(`in`)
            } catch (ignored: RuntimeException) {
                fallback(`in`)
            }
        }

        companion object {
            @Throws(IOException::class)
            private fun <T> fallback(`in`: JsonReader): T? {
                when (val jsonToken = `in`.peek()) {
                    JsonToken.BEGIN_ARRAY, JsonToken.BEGIN_OBJECT, JsonToken.NAME, JsonToken.STRING, JsonToken.NUMBER, JsonToken.BOOLEAN, JsonToken.NULL -> `in`.skipValue()
                    JsonToken.END_ARRAY -> `in`.endArray()
                    JsonToken.END_OBJECT -> `in`.endObject()
                    JsonToken.END_DOCUMENT -> {}
                    else -> throw AssertionError(jsonToken)
                }
                return null
            }
        }
    }

    companion object {
        private val instance: TypeAdapterFactory = JsonFailSafeTypeAdapterFactory()

        /**
         * @return An instance of [JsonFailSafeTypeAdapterFactory].
         */
        fun get(): TypeAdapterFactory {
            return instance
        }
    }
}