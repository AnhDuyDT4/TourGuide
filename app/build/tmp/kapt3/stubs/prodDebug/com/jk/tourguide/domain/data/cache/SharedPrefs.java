package com.jk.tourguide.domain.data.cache;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t2\b\u0010\n\u001a\u0004\u0018\u0001H\u0005H\u00a6\u0002\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J*\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0011H&J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0007H&J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J%\u0010\u001e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u0002H\u0005H&\u00a2\u0006\u0002\u0010 J$\u0010!\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\"H&J\u0012\u0010#\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010$\u001a\u00020\u00032\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"H&\u00a8\u0006&"}, d2 = {"Lcom/jk/tourguide/domain/data/cache/SharedPrefs;", "", "clear", "", "get", "T", "key", "", "anonymousClass", "Ljava/lang/Class;", "defValue", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "getArrayList", "", "", "defaultValue", "getBoolean", "", "name", "defaultBoolean", "getFloat", "", "defaultFloat", "getInt", "", "defaultInt", "getLong", "getString", "defaultString", "isHaveKey", "put", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "putArrayList", "", "remove", "removeAll", "keys", "app_prodDebug"})
public abstract interface SharedPrefs {
    
    public abstract int getInt(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract int getInt(@org.jetbrains.annotations.NotNull
    java.lang.String name, int defaultInt);
    
    public abstract boolean getBoolean(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract boolean getBoolean(@org.jetbrains.annotations.NotNull
    java.lang.String name, boolean defaultBoolean);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getString(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String defaultString);
    
    public abstract float getFloat(@org.jetbrains.annotations.NotNull
    java.lang.String name, float defaultFloat);
    
    public abstract long getLong(@org.jetbrains.annotations.NotNull
    java.lang.String name, long defaultValue);
    
    public abstract <T extends java.lang.Object>void put(@org.jetbrains.annotations.Nullable
    java.lang.String key, T data);
    
    public abstract void remove(@org.jetbrains.annotations.Nullable
    java.lang.String key);
    
    public abstract void removeAll(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> keys);
    
    public abstract void clear();
    
    public abstract boolean isHaveKey(@org.jetbrains.annotations.Nullable
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable
    public abstract <T extends java.lang.Object>T get(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> anonymousClass, @org.jetbrains.annotations.Nullable
    T defValue);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.util.List<java.lang.Long> getArrayList(@org.jetbrains.annotations.Nullable
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.Long> getArrayList(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> defaultValue);
    
    public abstract void putArrayList(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Long> data);
}