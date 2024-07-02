package com.jk.tourguide.domain.interactor

import kotlinx.coroutines.flow.Flow

abstract class CoroutineSuspendUserCase <R, in Params> {

    abstract suspend fun buildUseCaseObservable(params: Params?): R?

    open suspend fun execute(params: Params? = null): R? {
        return this.buildUseCaseObservable(params)
    }
}

abstract class CoroutineFlowUserCase <R, in Params> {

    abstract fun buildUseCaseObservables(params: Params?): Flow<R>

    open fun execute(params: Params? = null): Flow<R> {
        return this.buildUseCaseObservables(params)
    }

}