package com.jk.tourguide.extention.helper;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.lang.AssertionError;
import java.lang.RuntimeException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/jk/tourguide/extention/helper/JsonFailSafeTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "()V", "create", "Lcom/google/gson/TypeAdapter;", "T", "gson", "Lcom/google/gson/Gson;", "typeToken", "Lcom/google/gson/reflect/TypeToken;", "Companion", "JsonFailSafeTypeAdapter", "app_prodDebug"})
public final class JsonFailSafeTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    @org.jetbrains.annotations.NotNull
    private static final com.google.gson.TypeAdapterFactory instance = null;
    @org.jetbrains.annotations.NotNull
    public static final com.jk.tourguide.extention.helper.JsonFailSafeTypeAdapterFactory.Companion Companion = null;
    
    private JsonFailSafeTypeAdapterFactory() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public <T extends java.lang.Object>com.google.gson.TypeAdapter<T> create(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull
    com.google.gson.reflect.TypeToken<T> typeToken) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/jk/tourguide/extention/helper/JsonFailSafeTypeAdapterFactory$Companion;", "", "()V", "instance", "Lcom/google/gson/TypeAdapterFactory;", "get", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * @return An instance of [JsonFailSafeTypeAdapterFactory].
         */
        @org.jetbrains.annotations.NotNull
        public final com.google.gson.TypeAdapterFactory get() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/jk/tourguide/extention/helper/JsonFailSafeTypeAdapterFactory$JsonFailSafeTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "delegateTypeAdapter", "(Lcom/google/gson/TypeAdapter;)V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V", "Companion", "app_prodDebug"})
    static final class JsonFailSafeTypeAdapter<T extends java.lang.Object> extends com.google.gson.TypeAdapter<T> {
        @org.jetbrains.annotations.NotNull
        private final com.google.gson.TypeAdapter<T> delegateTypeAdapter = null;
        @org.jetbrains.annotations.NotNull
        public static final com.jk.tourguide.extention.helper.JsonFailSafeTypeAdapterFactory.JsonFailSafeTypeAdapter.Companion Companion = null;
        
        public JsonFailSafeTypeAdapter(@org.jetbrains.annotations.NotNull
        com.google.gson.TypeAdapter<T> delegateTypeAdapter) {
            super();
        }
        
        @java.lang.Override
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        public void write(@org.jetbrains.annotations.NotNull
        com.google.gson.stream.JsonWriter out, T value) {
        }
        
        @java.lang.Override
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @org.jetbrains.annotations.Nullable
        public T read(@org.jetbrains.annotations.NotNull
        com.google.gson.stream.JsonReader in) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/jk/tourguide/extention/helper/JsonFailSafeTypeAdapterFactory$JsonFailSafeTypeAdapter$Companion;", "", "()V", "fallback", "T", "in", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "app_prodDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
            private final <T extends java.lang.Object>T fallback(com.google.gson.stream.JsonReader in) {
                return null;
            }
        }
    }
}