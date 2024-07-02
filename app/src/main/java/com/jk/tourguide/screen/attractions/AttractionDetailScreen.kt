package com.jk.tourguide.screen.attractions

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavHostController
import com.jk.tourguide.R
import com.jk.tourguide.application.AppConstants
import com.jk.tourguide.component.HeaderView
import com.jk.tourguide.component.HtmlText
import com.jk.tourguide.component.ImageWithURL
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity
import com.jk.tourguide.domain.data.model.entity.attraction.ImageEntity
import com.jk.tourguide.ui.theme.BrightBlue
import com.jk.tourguide.ui.theme.Typography
import kotlin.math.ceil

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.AttractionDetailScreen(
    attraction: AttractionEntity?,
    navController: NavHostController?,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        val attractionValue = remember {
            attraction
        }

        Column(modifier = Modifier.fillMaxSize()) {

            HeaderView(attractionValue?.name?:stringResource(R.string.attraction_detail), onBackClick = {
                navController?.navigateUp()
            })

            attractionValue?.let {
                AttractionDetailInformation(
                    attraction = it,
                    animatedVisibilityScope = animatedVisibilityScope
                )
            }

        }

    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.AttractionDetailInformation(
    attraction: AttractionEntity,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    var openWebView by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        ImageWithURL(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
                .padding(horizontal = 24.dp)
                .sharedElement(
                    state = rememberSharedContentState(key = "${AppConstants.PREFIX_IMAGE}${attraction.idKey}"),
                    animatedVisibilityScope = animatedVisibilityScope,
                    boundsTransform = { _, _ ->
                        tween(durationMillis = 500)
                    }
                )
                .clip(RoundedCornerShape(24.dp)),
            imageUrl = if (attraction.image.isNotEmpty()) attraction.image.first().src else "",
            errorRes = R.drawable.ic_placeholder_attaction
        )

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = buildAnnotatedString {
                append(stringResource(R.string.open_status, ""))
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(stringResource(id = attraction.status))
                }
            },
            modifier = Modifier.padding(horizontal = 24.dp),
            style = Typography.bodyMedium.copy(
                fontStyle = FontStyle.Italic,
                color = Color.Black
            )
        )

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = buildAnnotatedString {
                append(stringResource(R.string.address, ""))
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(attraction.address)
                }
            },
            modifier = Modifier.padding(horizontal = 24.dp),
            style = Typography.bodyMedium.copy(
                fontStyle = FontStyle.Italic,
                color = Color.Black
            )
        )

        if (!attraction.openTime.isNullOrEmpty()) {
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = buildAnnotatedString {
                    append(stringResource(R.string.open_time, ""))
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(attraction.openTime)
                    }
                },
                modifier = Modifier.padding(horizontal = 24.dp),
                style = Typography.bodyMedium.copy(
                    fontStyle = FontStyle.Italic,
                    color = Color.Black
                )
            )
        }


        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = stringResource(R.string.introduce),
            modifier = Modifier.padding(horizontal = 24.dp),
            style = Typography.bodyMedium.copy(
                fontStyle = FontStyle.Italic,
                color = Color.Black
            )
        )
        HtmlText(
            html = attraction.description,
            modifier = Modifier.padding(horizontal = 24.dp),
            style = Typography.bodyMedium.copy(
                fontStyle = FontStyle.Italic,
                color = Color.Gray
            )
        )

        if (attraction.image.isNotEmpty()) {
            Spacer(modifier = Modifier.height(12.dp))
            ListImageView(attraction.image)
        }

        if (attraction.officialSite.isNotEmpty()) {
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = buildAnnotatedString {
                    append(stringResource(R.string.official_site, ""))
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = BrightBlue,
                            textDecoration = TextDecoration.Underline
                        )
                    ) {
                        append(attraction.officialSite)
                    }
                },
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .clickable {
                        openWebView = true
                    },
                style = Typography.bodyMedium.copy(
                    fontStyle = FontStyle.Italic,
                    color = Color.Black
                )
            )
        }

        if (openWebView) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Dialog(
                    onDismissRequest = { openWebView = false },
                    properties = DialogProperties(
                        dismissOnBackPress = true,
                        dismissOnClickOutside = true,
                        usePlatformDefaultWidth = false
                    )
                ) {
                    WebViewScreen(attraction.officialSite) {
                        openWebView = false
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun ListImageView(
    images: List<ImageEntity>,
) {
    var isOpen by remember { mutableStateOf(false) }
    var page by remember { mutableIntStateOf(0) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .height(((ceil(images.size / 3.0).toInt() * 120) + 32).dp)
    ) {
        Column {
            Text(
                text = stringResource(R.string.images),
                modifier = Modifier.padding(horizontal = 24.dp),
                style = Typography.bodyMedium.copy(
                    fontStyle = FontStyle.Italic,
                    color = Color.Black
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .heightIn(max = 60.dp)
                    .widthIn(max = 60.dp)
                    .padding(horizontal = 24.dp)
            ) {
                items(images) { item ->
                    ImageWithURL(
                        imageUrl = item.src,
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .clickable {
                                isOpen = true
                                page = images.indexOf(item)
                            }
                            .aspectRatio(1f)
                    )
                }
            }

            if (isOpen) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 24.dp)
                ) {
                    Dialog(
                        onDismissRequest = { isOpen = false },
                        properties = DialogProperties(
                            dismissOnBackPress = true,
                            dismissOnClickOutside = true,
                            usePlatformDefaultWidth = false
                        )
                    ) {
                        ImageGallery(
                            images,
                            page,
                        ) {
                            isOpen = false
                        }
                    }
                }
            }
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageGallery(images: List<ImageEntity>, initPage: Int, closeClick: () -> Unit) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        val pagerState = rememberPagerState(pageCount = {
            images.size
        }, initialPage = initPage)
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.align(Alignment.Center),
            contentPadding = PaddingValues(horizontal = 12.dp),
        ) { page ->
            ImageWithURL(
                imageUrl = images[page].src,
                modifier = Modifier
                    .aspectRatio(1f)
                    .padding(horizontal = 24.dp)
                    .clip(RoundedCornerShape(24.dp))

            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)

        ) {
            repeat(images.size) { pageIndex ->
                val isSelected = pagerState.currentPage == pageIndex
                Box(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .width(if (isSelected) 12.dp else 8.dp)
                        .height(8.dp)
                        .clip(CircleShape)
                        .background(if (isSelected) Color.White else Color.Gray)
                )
            }
        }
        Column(
            modifier = Modifier
                .align(Alignment.TopEnd)
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.ic_close),
                    contentDescription = null,
                    modifier = Modifier
                        .height(35.dp)
                        .width(35.dp)
                        .clickable {
                            closeClick.invoke()
                        }

                )
                Spacer(modifier = Modifier.width(12.dp))
            }
        }
    }
}

@Composable
fun WebViewScreen(
    url: String,
    closeClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        AndroidView(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp),
            factory = { context ->
                WebView(context).apply {
                    webViewClient = WebViewClient()
                    settings.javaScriptEnabled = true
                    settings.domStorageEnabled = true
                    settings.loadWithOverviewMode = true
                    settings.useWideViewPort = true
                    settings.allowFileAccess = false
                    settings.setSupportMultipleWindows(false)
                    settings.javaScriptCanOpenWindowsAutomatically = false
                    settings.builtInZoomControls = true
                    settings.displayZoomControls = false
                    settings.cacheMode = android.webkit.WebSettings.LOAD_CACHE_ELSE_NETWORK
                    loadUrl(url)
                }
            }
        )

        Column(
            modifier = Modifier
                .align(Alignment.TopEnd)
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.ic_close),
                    contentDescription = null,
                    modifier = Modifier
                        .height(35.dp)
                        .width(35.dp)
                        .clickable {
                            closeClick.invoke()
                        }

                )
                Spacer(modifier = Modifier.width(12.dp))
            }
        }
    }
}