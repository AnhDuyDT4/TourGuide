package com.jk.tourguide.screen.category

import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity
import com.jk.tourguide.domain.interactor.GetCategoriesUserCase
import com.jk.tourguide.extention.CategoryType
import com.jk.tourguide.mvvm.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CategoriesViewModel(
    private val getCategories: GetCategoriesUserCase
): BaseViewModel() {

    private val categoriesValue : MutableStateFlow<List<CategoryEntity>> = MutableStateFlow(
        emptyList()
    )
    val categories : StateFlow<List<CategoryEntity>> = categoriesValue

    fun getCategories() {
        launchWithUIContext({
            getCategories.execute(CategoryType.ATTRACTIONS).collect { categories ->
                categoriesValue.value = categories
            }
        })

    }

}