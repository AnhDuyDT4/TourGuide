package com.jk.tourguide.mvvm

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jk.tourguide.extention.ErrorEntry
import com.jk.tourguide.extention.ErrorType
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import kotlin.coroutines.CoroutineContext

open class BaseViewModel : ViewModel(), LifecycleObserver,
    CoroutineScope {
    private val _loading = mutableStateOf(false)
    val loading: State<Boolean> = _loading

    private val _error = mutableStateOf<ErrorEntry?>(null)
    val error: State<ErrorEntry?> = _error

    private val viewModelJob = viewModelScope

    private val ioContext = viewModelJob + Dispatchers.IO

    private var mainContext = viewModelJob + Dispatchers.Main

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private val mLaunchManager: MutableList<Job> = mutableListOf()

    public override fun onCleared() {
        super.onCleared()
        mLaunchManager.clear()
    }

    protected fun launchWithUIContext(
        runningBlock: suspend CoroutineScope.() -> Unit,
        errorHandle: ((Exception)-> Unit)? = null
    ) {
        val handler = CoroutineExceptionHandler { _, throwable ->
            hideLoading()
            if (errorHandle == null) {
                if (throwable !is CancellationException) {
                    showError(throwable.message)
                } else {
                    showError(throwable.message)
                    throw throwable
                }
            } else {
                errorHandle(throwable as Exception)
            }
        }
        launchUI(handler) {
            showLoading()
            runningBlock.invoke(this)
            hideLoading()
        }
    }

    protected fun launchWithIOContext(
        runningBlock: suspend CoroutineScope.() -> Unit
    ) {
        val handler = CoroutineExceptionHandler { _, throwable ->
            println(throwable.message)
        }
        launchIO(handler) {
            runningBlock.invoke(this)
        }
    }

    private fun launchUI(errorHandler : CoroutineExceptionHandler ,block: suspend CoroutineScope.() -> Unit) {
        val job = mainContext.launch(errorHandler) {
            block()
        }
        mLaunchManager.add(job)
        job.invokeOnCompletion { mLaunchManager.remove(job) }
    }

    private fun launchIO(errorHandler : CoroutineExceptionHandler ,block: suspend CoroutineScope.() -> Unit) {
        val job = ioContext.launch(errorHandler) {
            block()
        }
        mLaunchManager.add(job)
        job.invokeOnCompletion { mLaunchManager.remove(job) }
    }


    private fun showLoading() {
        _loading.value = true
    }

    private fun hideLoading() {
        _loading.value = false
    }

    private fun showError(message: String?) {
        _error.value = ErrorEntry(ErrorType.UNKNOWN,message)
    }

    fun clearError() {
        _error.value = null
    }

}