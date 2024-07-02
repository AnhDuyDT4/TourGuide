package com.jk.tourguide.domain.data.remote.retrofit;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory;
import com.jk.tourguide.BuildConfig;
import com.jk.tourguide.application.AppConstants;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\'\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0017"}, d2 = {"Lcom/jk/tourguide/domain/data/remote/retrofit/ServiceFactory;", "", "()V", "createMoshiConverter", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "makeGeneralInterceptor", "Lcom/jk/tourguide/domain/data/remote/retrofit/ServiceFactory$GeneralInterceptor;", "makeLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "makeMoshi", "Lcom/squareup/moshi/Moshi;", "makeOkHttpClient", "Lokhttp3/OkHttpClient;", "makeRetrofit", "Lretrofit2/Retrofit;", "baseUrl", "", "makeService", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "GeneralInterceptor", "app_prodDebug"})
public final class ServiceFactory {
    @org.jetbrains.annotations.NotNull
    public static final com.jk.tourguide.domain.data.remote.retrofit.ServiceFactory INSTANCE = null;
    
    private ServiceFactory() {
        super();
    }
    
    public final <T extends java.lang.Object>T makeService(@org.jetbrains.annotations.NotNull
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> type) {
        return null;
    }
    
    private final retrofit2.Retrofit makeRetrofit(java.lang.String baseUrl) {
        return null;
    }
    
    private final retrofit2.converter.moshi.MoshiConverterFactory createMoshiConverter() {
        return null;
    }
    
    private final com.squareup.moshi.Moshi makeMoshi() {
        return null;
    }
    
    private final okhttp3.OkHttpClient makeOkHttpClient() {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor makeLoggingInterceptor() {
        return null;
    }
    
    private final com.jk.tourguide.domain.data.remote.retrofit.ServiceFactory.GeneralInterceptor makeGeneralInterceptor() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/jk/tourguide/domain/data/remote/retrofit/ServiceFactory$GeneralInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_prodDebug"})
    static final class GeneralInterceptor implements okhttp3.Interceptor {
        
        public GeneralInterceptor() {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
        okhttp3.Interceptor.Chain chain) {
            return null;
        }
    }
}