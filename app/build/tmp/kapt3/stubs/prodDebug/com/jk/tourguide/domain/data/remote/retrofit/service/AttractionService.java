package com.jk.tourguide.domain.data.remote.retrofit.service;

import com.jk.tourguide.domain.data.remote.model.BaseResponse;
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/jk/tourguide/domain/data/remote/retrofit/service/AttractionService;", "", "getAttractions", "Lcom/jk/tourguide/domain/data/remote/model/BaseResponse;", "", "Lcom/jk/tourguide/domain/data/remote/model/reponse/attraction/AttractionResponse;", "lang", "", "id", "page", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface AttractionService {
    
    @retrofit2.http.GET(value = "{lang}/Attractions/All")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAttractions(@retrofit2.http.Path(value = "lang")
    @org.jetbrains.annotations.NotNull
    java.lang.String lang, @retrofit2.http.Query(value = "categoryIds")
    @org.jetbrains.annotations.NotNull
    java.lang.String id, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jk.tourguide.domain.data.remote.model.BaseResponse<java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse>>> $completion);
}