package com.jk.tourguide.screen.attractions

import com.jk.tourguide.application.AppConstants
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity
import com.jk.tourguide.domain.data.model.request.AttractionRequest
import com.jk.tourguide.domain.interactor.GetAttractionUseCase
import com.jk.tourguide.mvvm.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AttractionViewModel(
    private val getAttractionUseCase: GetAttractionUseCase
) : BaseViewModel(){

    private val categoryIds = MutableStateFlow<List<Int>>(arrayListOf())
    private val attractionValue: MutableStateFlow<List<AttractionEntity>> = MutableStateFlow(
        emptyList()
    )

    private var needLoadMore = true

    val attraction: StateFlow<List<AttractionEntity>> = attractionValue

    fun getAttraction(request: AttractionRequest) {
        if (!needLoadMore) {
            return
        }

        if (categoryIds.value.isEmpty() && request.categoryIds != null) {
            categoryIds.value = request.categoryIds
        } else {
            request.copy(categoryIds = categoryIds.value)
        }

        launchWithUIContext({
            getAttractionUseCase.execute(request).collect {
                if (it.isEmpty() || it.size < AppConstants.LIMIT_OF_PAGE_SIZE) {
                    needLoadMore = false
                }
                attractionValue.value += it
            }
        })
    }

}