package com.jk.tourguide.domain.data.cache;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jk.tourguide.extention.helper.GsonProvider;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J8\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f2\b\u0010\r\u001a\u0004\u0018\u0001H\bH\u0096\u0002\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J*\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010 \u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J%\u0010!\u001a\u00020\u0006\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\"\u001a\u0002H\bH\u0016\u00a2\u0006\u0002\u0010#J$\u0010$\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\'\u001a\u00020\u00062\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/jk/tourguide/domain/data/cache/SharedPrefsApi;", "Lcom/jk/tourguide/domain/data/cache/SharedPrefs;", "mSharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "clear", "", "get", "T", "key", "", "anonymousClass", "Ljava/lang/Class;", "defValue", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "getArrayList", "", "", "defaultValue", "getBoolean", "", "name", "defaultBoolean", "getFloat", "", "defaultFloat", "getInt", "", "defaultInt", "getLong", "getString", "defaultString", "isHaveKey", "put", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "putArrayList", "", "remove", "removeAll", "keys", "app_prodDebug"})
public final class SharedPrefsApi implements com.jk.tourguide.domain.data.cache.SharedPrefs {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences mSharedPreferences = null;
    
    public SharedPrefsApi(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences mSharedPreferences) {
        super();
    }
    
    @java.lang.Override
    public int getInt(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return 0;
    }
    
    @java.lang.Override
    public int getInt(@org.jetbrains.annotations.NotNull
    java.lang.String name, int defaultInt) {
        return 0;
    }
    
    @java.lang.Override
    public boolean getBoolean(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return false;
    }
    
    @java.lang.Override
    public boolean getBoolean(@org.jetbrains.annotations.NotNull
    java.lang.String name, boolean defaultBoolean) {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getString(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String defaultString) {
        return null;
    }
    
    @java.lang.Override
    public float getFloat(@org.jetbrains.annotations.NotNull
    java.lang.String name, float defaultFloat) {
        return 0.0F;
    }
    
    @java.lang.Override
    public long getLong(@org.jetbrains.annotations.NotNull
    java.lang.String name, long defaultValue) {
        return 0L;
    }
    
    @java.lang.Override
    public <T extends java.lang.Object>void put(@org.jetbrains.annotations.Nullable
    java.lang.String key, T data) {
    }
    
    @java.lang.Override
    public void remove(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
    }
    
    @java.lang.Override
    public void removeAll(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> keys) {
    }
    
    @java.lang.Override
    public void clear() {
    }
    
    @java.lang.Override
    public boolean isHaveKey(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public <T extends java.lang.Object>T get(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> anonymousClass, @org.jetbrains.annotations.Nullable
    T defValue) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.util.List<java.lang.Long> getArrayList(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Long> getArrayList(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> defaultValue) {
        return null;
    }
    
    @java.lang.Override
    public void putArrayList(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Long> data) {
    }
}