package com.jk.tourguide.mvvm;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;
import com.jk.tourguide.component.NetworkChangeReceiver;
import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository;
import com.jk.tourguide.extention.LanguageType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\r\u0010\u0016\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0006\u0010\u0019\u001a\u00020\u000bJ\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000bH&J\b\u0010 \u001a\u00020\u0015H\u0014J\b\u0010!\u001a\u00020\u0015H\u0002J\u0012\u0010\"\u001a\u00020\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J\b\u0010%\u001a\u00020\u0015H\u0002J\u0018\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010#\u001a\u00020$H\u0002R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/jk/tourguide/mvvm/BaseActivity;", "V", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "isNetworkConnected", "", "networkChangeReceiver", "Lcom/jk/tourguide/component/NetworkChangeReceiver;", "sharedPreferences", "Lcom/jk/tourguide/domain/data/cache/CacheSharedPreferencesRepository;", "getSharedPreferences", "()Lcom/jk/tourguide/domain/data/cache/CacheSharedPreferencesRepository;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "cleanGarbage", "", "inflateBinding", "initFragment", "initView", "isNetworkConnection", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNetworkChange", "isConnected", "onResume", "registerNetworkChangeReceiver", "renderLanguage", "language", "", "unregisterNetworkChangeReceiver", "updateLocale", "context", "Landroid/content/Context;", "app_prodDebug"})
public abstract class BaseActivity<V extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sharedPreferences$delegate = null;
    private com.jk.tourguide.component.NetworkChangeReceiver networkChangeReceiver;
    private boolean isNetworkConnected = true;
    @org.jetbrains.annotations.Nullable
    private V _binding;
    
    public BaseActivity() {
        super();
    }
    
    private final com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository getSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final V getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void registerNetworkChangeReceiver() {
    }
    
    private final void unregisterNetworkChangeReceiver() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final V inflateBinding() {
        return null;
    }
    
    public final boolean isNetworkConnection() {
        return false;
    }
    
    public final void renderLanguage(@org.jetbrains.annotations.Nullable
    java.lang.String language) {
    }
    
    private final void updateLocale(android.content.Context context, java.lang.String language) {
    }
    
    public abstract void onNetworkChange(boolean isConnected);
    
    public void cleanGarbage() {
    }
    
    public void initFragment() {
    }
    
    public void initView() {
    }
}