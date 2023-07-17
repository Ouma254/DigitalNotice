package com.deknowh.digitalnotice.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.deknowh.digitalnotice.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

@Composable
fun SplashScreen(navController: NavController) {
    val scale = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = true ) {
        scale.animateTo(
            targetValue = 0.3f, 
            animationSpec = tween(
                durationMillis = 500, 
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(3000L)
        navController.navigate("login")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "MEMO UPDATES",
            color = Color.White,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
        )
    }
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Column(
//            modifier = Modifier.padding(16.dp),
//            verticalArrangement = Arrangement.spacedBy(20.dp)
//        ) {
//
//            Text(text = "WELCOME TO DIGITAL NOTICE...",
//                modifier = Modifier
//                    .fillMaxWidth().padding(32.dp),
//                style = MaterialTheme.typography.bodyLarge,
//                color = Color.Blue,
//                fontSize = TextUnit.Unspecified
//            )
//            Spacer(modifier = Modifier.padding(8.dp))
//            Image(
//                painter = painterResource(id = R.drawable.logo),
//                contentDescription = "logo photo",
//                modifier = Modifier.padding(32.dp)
//            )
//        }
//
//    }
//    LaunchedEffect(key1 = true) {
//        withContext(Dispatchers.Main) {
//            delay(3000)
//            navController.popBackStack()
//            navController.navigate( "chat")
//        }
//    }



}