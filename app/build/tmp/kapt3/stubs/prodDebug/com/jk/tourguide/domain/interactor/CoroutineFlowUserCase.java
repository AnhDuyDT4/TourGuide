package com.jk.tourguide.domain.interactor;

import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/jk/tourguide/domain/interactor/CoroutineFlowUserCase;", "R", "Params", "", "()V", "buildUseCaseObservables", "Lkotlinx/coroutines/flow/Flow;", "params", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "execute", "app_prodDebug"})
public abstract class CoroutineFlowUserCase<R extends java.lang.Object, Params extends java.lang.Object> {
    
    public CoroutineFlowUserCase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<R> buildUseCaseObservables(@org.jetbrains.annotations.Nullable
    Params params);
    
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<R> execute(@org.jetbrains.annotations.Nullable
    Params params) {
        return null;
    }
}