package com.deknowh.digitalnotice.screens

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun ChatScreen(navController: NavController) {
    var isLoading by remember {
        mutableStateOf(true)
    }
    LaunchedEffect(key1 = true ) {
        delay(10000)
        isLoading = false
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(15) {
            ShimmerListItem(
                isLoading = isLoading,
                contentAfterLoading = {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home"
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = "School of Computing and Informatics have "+
                                "announced special meeting with the students from that "+
                                "department tomorrow starting from 10 am in the morning"
                        )
                    }
                }

                )
        }
    }
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "ChatScreen"
//        )
//        Column(modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp)
//        ) {
//            Button(onClick = {
//                navController.navigate("settings")
//            }) {
//                Text(text = "Move to Settings")
//            }
//        }
//    }
}

@Composable
fun ShimmerListItem(
    isLoading: Boolean,
    contentAfterLoading: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    if (isLoading) {
        Row(modifier = modifier) {
            Box(modifier = Modifier
                .size(100.dp)
                .shimmerEffect()
                .clip(CircleShape)
            ) {
                Spacer(modifier =Modifier.width(16.dp) )
                Column(modifier) {
                    Box(modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .height(20.dp)
                        .shimmerEffect()
                    )
                }
            }
        }
    } else {
        contentAfterLoading()
    }

}

fun Modifier.shimmerEffect(): Modifier = composed {
    var size by remember {
      mutableStateOf(IntSize.Zero)
    }
    val transition = rememberInfiniteTransition()
    val startOffsetX by transition.animateFloat(
        initialValue = -2 * size.width.toFloat(),
        targetValue = 2 * size.width.toFloat(),
        animationSpec = infiniteRepeatable(
            animation = tween(100)
        )
    )
    background(brush = Brush.linearGradient(
        colors = listOf(
            Color(0xFC7BEBE),
            Color(0xFC7BEBE),
            Color(0xFC7BEBE)
        ),
        start = Offset(startOffsetX, 0f),
        end = Offset(startOffsetX + size.width.toFloat(), size.height.toFloat())
     )
    )
        .onGloballyPositioned {
            size = it.size
        }

}