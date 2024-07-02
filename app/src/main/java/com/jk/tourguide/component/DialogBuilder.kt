package com.jk.tourguide.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import com.jk.tourguide.ui.theme.Black40
import com.jk.tourguide.ui.theme.BrightBlue
import com.jk.tourguide.ui.theme.Font
import com.jk.tourguide.ui.theme.Typography

enum class DialogType {
    SUCCESS, ERROR, WARNING
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogBuilder(
    type: DialogType,
    description: String,
    onPositiveClick: () -> Unit,
    onNegativeClick: (() -> Unit)? = null,
    positiveAction: String? = null,
    negativeAction: String? = null
) {
    var showDialog by remember { mutableStateOf(true) }

    if (showDialog) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Black40),
            contentAlignment = Alignment.Center
        ) {
            AlertDialog(onDismissRequest = { showDialog = false },
                properties = DialogProperties(),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(24.dp)
                    ),
                content = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 24.dp, end = 24.dp)
                        ) {
                            Spacer(modifier = Modifier.height(12.dp))
                            GetTitle(type = type)
                            Spacer(modifier = Modifier.height(12.dp))
                            Text(
                                text = description,
                                style = MaterialTheme.typography.bodyLarge,
                                color = Color.Black
                            )
                            Spacer(modifier = Modifier.height(24.dp))
                            Row {
                                positiveAction?.let {
                                    Button(
                                        onClick = {
                                            onPositiveClick()
                                            showDialog = false
                                        }, modifier = Modifier
                                            .fillMaxWidth()
                                            .weight(1f),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = BrightBlue
                                        )

                                    ) {
                                        Text(
                                            text = positiveAction,
                                            modifier = Modifier.padding(4.dp),
                                            fontSize = 18.sp,
                                            fontFamily = Font.urbanistFamily
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(24.dp))
                                negativeAction?.let {
                                    Button(
                                        onClick = {
                                            onNegativeClick?.invoke()
                                            showDialog = false
                                        },
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .border(
                                                color = Color.Gray,
                                                width = 1.dp,
                                                shape = RoundedCornerShape(24.dp)
                                            )
                                            .weight(1f),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color.White
                                        )
                                    ) {
                                        Text(
                                            text = negativeAction,
                                            modifier = Modifier.padding(4.dp),
                                            fontSize = 18.sp,
                                            color = Color.Black,
                                            fontFamily = Font.urbanistFamily
                                        )
                                    }
                                }
                            }


                            Spacer(modifier = Modifier.height(12.dp))
                        }
                    }
                })
        }
    }
}

@Composable
fun GetTitle(type: DialogType) {
    return when (type) {
        DialogType.SUCCESS -> {
            Text(
                text = "Success", style = Typography.titleLarge, color = Color.Black
            )
        }

        DialogType.ERROR -> {
            Text(
                text = "Error", style = Typography.titleLarge, color = Color.Red
            )
        }

        DialogType.WARNING -> {
            Text(
                text = "Warning", style = Typography.titleLarge, color = Color.DarkGray
            )
        }
    }
}


@Preview
@Composable
fun PreviewDialog() {
    DialogBuilder(
        type = DialogType.SUCCESS,
        description = "This is a success dialog",
        onPositiveClick = { },
        positiveAction = "Ok",
        negativeAction = "Cancel",
        onNegativeClick = { }
    )
}
