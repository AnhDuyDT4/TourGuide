package com.jk.tourguide.domain.interactor;

import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/jk/tourguide/domain/interactor/CoroutineSuspendUserCase;", "R", "Params", "", "()V", "buildUseCaseObservable", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "app_prodDebug"})
public abstract class CoroutineSuspendUserCase<R extends java.lang.Object, Params extends java.lang.Object> {
    
    public CoroutineSuspendUserCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object buildUseCaseObservable(@org.jetbrains.annotations.Nullable
    Params params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super R> $completion);
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Object execute(@org.jetbrains.annotations.Nullable
    Params params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super R> $completion) {
        return null;
    }
}