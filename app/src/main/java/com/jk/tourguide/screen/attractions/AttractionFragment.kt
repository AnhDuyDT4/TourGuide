package com.jk.tourguide.screen.attractions

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import org.koin.androidx.viewmodel.ext.android.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.fragment.findNavController
import com.google.gson.Gson
import com.jk.tourguide.R
import com.jk.tourguide.application.AppConstants
import com.jk.tourguide.component.DialogBuilder
import com.jk.tourguide.component.DialogType
import com.jk.tourguide.component.HeaderView
import com.jk.tourguide.component.ImageWithURL
import com.jk.tourguide.component.LoadingIndicatorComponent
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity
import com.jk.tourguide.domain.data.model.request.AttractionRequest
import com.jk.tourguide.extention.shadow
import com.jk.tourguide.mvvm.BaseFragment
import com.jk.tourguide.ui.theme.Black40
import com.jk.tourguide.ui.theme.Typography

@OptIn(ExperimentalSharedTransitionApi::class)
class AttractionFragment : BaseFragment() {

    private val viewModel: AttractionViewModel by viewModel()
    private var page = 1

    override fun fetchData() {
        super.fetchData()
        val json = arguments?.getString(CATEGORY_ID)
        val ids = Gson().fromJson(json, Array<Int>::class.java).toList()
        viewModel.getAttraction(
            AttractionRequest(
                categoryIds = ids,
                page = page,
            )
        )
    }

    @Composable
    override fun OnComposeView() {
        val navController = rememberNavController()
        val isLoading by viewModel.loading
        val isError by viewModel.error
        val attractions by viewModel.attraction.collectAsState()
        var attraction: AttractionEntity? = remember { null }

        SharedTransitionLayout {
            NavHost(navController = navController, startDestination = ATTRACTION_SCREEN) {

                composable(ATTRACTION_DETAIL) {
                    AttractionDetailScreen(
                        navController = navController,
                        attraction = attraction,
                        animatedVisibilityScope = this
                    )
                }
                composable(
                    route = ATTRACTION_SCREEN
                ) {
                    AttractionScreen(
                        attractions,
                        onBack = this@AttractionFragment::onBack,
                        animatedVisibilityScope = this,
                        onItemClick = {
                            attraction = it
                            navController.navigate(ATTRACTION_DETAIL)
                        },
                        isLoading = isLoading,
                        onLoadMore = {
                            page++
                            viewModel.getAttraction(
                                AttractionRequest(
                                    page = page
                                )
                            )
                        }
                    )
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
                    positiveAction = stringResource(R.string.ok)
                )
            }
        }
    }

    private fun onBack() {
        findNavController().popBackStack()
    }

    companion object {
        const val CATEGORY_ID = "category_id"
        const val ATTRACTION_DETAIL = "attraction_detail"
        const val ATTRACTION_SCREEN = "attraction_screen"
    }

}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.AttractionScreen(
    attractions: List<AttractionEntity> = emptyList(),
    isLoading: Boolean,
    onItemClick: (AttractionEntity) -> Unit = {},
    onLoadMore: () -> Unit,
    onBack: () -> Unit,
    animatedVisibilityScope: AnimatedVisibilityScope,
) {
    val listState = rememberLazyListState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            HeaderView(stringResource(R.string.attractions), onBackClick = onBack)
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn(
                state = listState,
                verticalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 16.dp)
            ) {
                items(
                    items = attractions,
                    key = { item -> item.idKey }
                ) { item ->
                    ItemAttraction(
                        item,
                        animatedVisibilityScope = animatedVisibilityScope,
                        onClick = { onItemClick(item) }
                    )
                }

            }
            LaunchedEffect(key1 = listState) {
                snapshotFlow {
                    val lastVisibleItemIndex =
                        listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: -1
                    val totalItemCount = listState.layoutInfo.totalItemsCount
                    lastVisibleItemIndex to totalItemCount
                }.collect { (lastVisibleItemIndex, totalItemCount) ->
                    if (lastVisibleItemIndex >= totalItemCount - 1 && !isLoading && totalItemCount > 0) {
                        onLoadMore()
                    }
                }
            }
        }
    }

}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.ItemAttraction(
    item: AttractionEntity,
    animatedVisibilityScope: AnimatedVisibilityScope,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .shadow(
                borderRadius = 32.dp,
                blurRadius = 18.dp,
                color = Black40,
                offsetY = 4.dp,
                offsetX = 12.dp
            )

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(24.dp))
                .background(Color.White)
                .padding(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                ImageWithURL(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16f / 9f)
                        .sharedElement(
                            state = rememberSharedContentState(
                                key = "${AppConstants.PREFIX_IMAGE}${item.idKey}",
                            ),
                            animatedVisibilityScope = animatedVisibilityScope,
                            boundsTransform = { _, _ ->
                                tween(durationMillis = 500)
                            })
                        .clip(RoundedCornerShape(24.dp)),
                    imageUrl = if (item.image.isNotEmpty()) item.image.first().src else "",
                    errorRes = R.drawable.ic_placeholder_attaction
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = item.name,
                    maxLines = 1,
                    style = Typography.titleMedium.copy(fontStyle = FontStyle.Italic)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = item.description,
                    maxLines = 2,
                    style = Typography.bodyMedium.copy(
                        fontStyle = FontStyle.Italic,
                        color = Color.Gray
                    )
                )
            }
        }
    }
}