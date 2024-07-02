package com.jk.tourguide.screen.category

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.fragment.findNavController
import com.google.gson.Gson
import com.jk.tourguide.R
import com.jk.tourguide.application.MainActivity
import com.jk.tourguide.component.DialogBuilder
import com.jk.tourguide.component.DialogType
import com.jk.tourguide.component.LoadingIndicatorComponent
import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity
import com.jk.tourguide.extention.shadow
import com.jk.tourguide.mvvm.BaseFragment
import com.jk.tourguide.ui.theme.Black40
import com.jk.tourguide.ui.theme.BrightBlue
import com.jk.tourguide.ui.theme.Typography
import org.koin.androidx.viewmodel.ext.android.viewModel

class CategoriesFragment : BaseFragment() {

    private val viewModel: CategoriesViewModel by viewModel()

    private fun navigateToAttractions(categories: List<Int>) {
        val data = Gson().toJson(categories)
        val action = CategoriesFragmentDirections.toAttractionFragment(data)
        findNavController().navigate(action)
    }

    @Composable
    override fun OnComposeView() {
        val categories by viewModel.categories.collectAsState()
        val isLoading by viewModel.loading
        val isError by viewModel.error

        if (categories.isNotEmpty()) {
            CategoriesScreen(categories) { ids ->
                navigateToAttractions(ids)
            }
        }

        if (isLoading) {
            LoadingIndicatorComponent()
        }

        if (isError != null) {
            DialogBuilder(
                type = DialogType.ERROR,
                description = isError?.message.toString(),
                onPositiveClick = {
                    viewModel.clearError()
                },
                positiveAction = getString(R.string.ok)
            )
        }

    }

    override fun fetchData() {
        super.fetchData()
        if ((requireActivity() as MainActivity).isNetworkConnection()) {
            viewModel.getCategories()
        }
    }

}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CategoriesScreen(
    categories: List<CategoryEntity>,
    onShowAttractions: (List<Int>) -> Unit
) {
    val selectedItems = remember { mutableStateListOf<CategoryEntity>() }
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            Text(
                text = stringResource(R.string.select_categories_to_show_attractions),
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                style = Typography.titleLarge,
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Column {
                FlowRow(
                    modifier = Modifier.fillMaxSize(),
                    maxItemsInEachRow = 3
                ) {
                    categories.forEach { item ->
                        val isSelected = selectedItems.contains(item)
                        CategoryItem(
                            item = item,
                            selected = isSelected,
                            onClick = {
                                if (isSelected) {
                                    selectedItems.remove(item)
                                } else {
                                    selectedItems.add(item)
                                }
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { onShowAttractions.invoke(selectedItems.map { it.id }) },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .shadow(borderRadius = 28.dp, blurRadius = 12.dp, color = Black40),
                colors = ButtonDefaults.buttonColors(
                    containerColor = BrightBlue),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 4.dp,
                    pressedElevation = 8.dp
                )


            ) {
                Text(
                    text = stringResource(R.string.show_attractions),
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    style = Typography.bodySmall
                )
            }
        }
    }
}

@Composable
fun CategoryItem(item: CategoryEntity, selected: Boolean, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(8.dp)

            .border(
                width = 1.dp,
                color = if (selected) BrightBlue else Color.Black,
                shape = RoundedCornerShape(24.dp)
            )
            .shadow(borderRadius = 24.dp, blurRadius = 4.dp, color = Black40)
            .clip(RoundedCornerShape(24.dp))
            .background(Color.White)
            .clickable(onClick = onClick)
            .padding(16.dp)
    ) {
        Text(
            text = item.name,
            color = if (selected) BrightBlue else Color.Black,
            style = Typography.bodyLarge,
        )
    }
}


@Preview
@Composable
fun CategoriesFragmentPreview() {
    val mockCategories = listOf(
        CategoryEntity(1, "Hot Spring"),
        CategoryEntity(1, "Cycling Routes"),
        CategoryEntity(1, "Historic Sites"),
        CategoryEntity(1, "Religious Venues"),
        CategoryEntity(1, "Art and Cultural Centers"),
        CategoryEntity(1, "Public Art")
    )
    CategoriesScreen(mockCategories) {

    }
}