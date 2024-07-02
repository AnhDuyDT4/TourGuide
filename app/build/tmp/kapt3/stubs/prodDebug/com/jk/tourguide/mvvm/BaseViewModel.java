package com.jk.tourguide.mvvm;

import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.ViewModel;
import com.jk.tourguide.extention.ErrorEntry;
import com.jk.tourguide.extention.ErrorType;
import kotlinx.coroutines.Dispatchers;
import kotlin.coroutines.CoroutineContext;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002JA\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!\u00a2\u0006\u0002\b$H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%JA\u0010&\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!\u00a2\u0006\u0002\b$H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J9\u0010\'\u001a\u00020\u001b2\'\u0010(\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!\u00a2\u0006\u0002\b$H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)JU\u0010*\u001a\u00020\u001b2\'\u0010(\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!\u00a2\u0006\u0002\b$2\u001a\b\u0002\u0010+\u001a\u0014\u0012\b\u0012\u00060-j\u0002`.\u0012\u0004\u0012\u00020\u001b\u0018\u00010,H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u001bH\u0016J\u0012\u00101\u001a\u00020\u001b2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\b\u00104\u001a\u00020\u001bH\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lcom/jk/tourguide/mvvm/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "_error", "Landroidx/compose/runtime/MutableState;", "Lcom/jk/tourguide/extention/ErrorEntry;", "_loading", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "error", "Landroidx/compose/runtime/State;", "getError", "()Landroidx/compose/runtime/State;", "ioContext", "loading", "getLoading", "mLaunchManager", "", "Lkotlinx/coroutines/Job;", "mainContext", "viewModelJob", "clearError", "", "hideLoading", "launchIO", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineExceptionHandler;Lkotlin/jvm/functions/Function2;)V", "launchUI", "launchWithIOContext", "runningBlock", "(Lkotlin/jvm/functions/Function2;)V", "launchWithUIContext", "errorHandle", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "onCleared", "showError", "message", "", "showLoading", "app_prodDebug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver, kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _loading = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.jk.tourguide.extention.ErrorEntry> _error = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.jk.tourguide.extention.ErrorEntry> error = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope viewModelJob = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope ioContext = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.CoroutineScope mainContext;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlinx.coroutines.Job> mLaunchManager = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.jk.tourguide.extention.ErrorEntry> getError() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @java.lang.Override
    public void onCleared() {
    }
    
    protected final void launchWithUIContext(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> runningBlock, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> errorHandle) {
    }
    
    protected final void launchWithIOContext(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> runningBlock) {
    }
    
    private final void launchUI(kotlinx.coroutines.CoroutineExceptionHandler errorHandler, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
    
    private final void launchIO(kotlinx.coroutines.CoroutineExceptionHandler errorHandler, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    public final void clearError() {
    }
}