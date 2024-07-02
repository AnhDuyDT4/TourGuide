package com.jk.tourguide.domain.data.remote.retrofit

import com.squareup.moshi.FromJson
import com.squareup.moshi.Moshi
import com.squareup.moshi.ToJson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.jk.tourguide.BuildConfig
import com.jk.tourguide.application.AppConstants
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

object ServiceFactory {

    fun <T> makeService(
        baseUrl: String,
        type: Class<T>,
    ): T {
        val retrofit = makeRetrofit(
            baseUrl
        )
        return retrofit.create(type)
    }

    private fun makeRetrofit(
        baseUrl: String
    ): Retrofit {
        val okHttpClient = makeOkHttpClient()
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(createMoshiConverter())
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    private fun createMoshiConverter(): MoshiConverterFactory = MoshiConverterFactory.create(
        makeMoshi()
    )

    private fun makeMoshi(): Moshi {
        val customDateAdapter: Any = object : Any() {
            val dateFormat: DateFormat =
                SimpleDateFormat(AppConstants.TIME_ZONE_FULL_DATETIME_FORMAT, Locale.getDefault())

            init {
                dateFormat.timeZone = TimeZone.getTimeZone(AppConstants.TIME_ZONE)
            }

            @ToJson
            @Synchronized
            fun dateToJson(d: Date): String {
                return dateFormat.format(d)
            }

            @FromJson
            @Synchronized
            @Throws(ParseException::class)
            fun dateToJson(s: String): Date? {
                return dateFormat.parse(s)
            }
        }
        return Moshi.Builder()
            .add(customDateAdapter)
            .build()
    }

    private fun makeOkHttpClient(): OkHttpClient {
        val httpLoggingInterceptor =
            makeLoggingInterceptor()

        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor(makeGeneralInterceptor())
            .addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader("accept", "application/json")
                .build()
            chain.proceed(request)
        }
            .connectTimeout(AppConstants.TIME_OUT, TimeUnit.SECONDS)
            .readTimeout(AppConstants.TIME_OUT, TimeUnit.SECONDS)
            .build()
    }

    private fun makeLoggingInterceptor(): HttpLoggingInterceptor {
        val isDebug = BuildConfig.DEBUG
        val logging = HttpLoggingInterceptor()
        logging.level = if (isDebug)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return logging
    }

    private fun makeGeneralInterceptor(): GeneralInterceptor =
        GeneralInterceptor()

    private class GeneralInterceptor : Interceptor {
        override fun intercept(chain: Interceptor.Chain): Response {
            val originalRequest = chain.request()
            val requestBuilder = originalRequest.newBuilder()
            val response = requestBuilder.build().let { chain.proceed(it) }
            return response
        }
    }
}