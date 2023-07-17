package com.deknowh.digitalnotice.screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.deknowh.digitalnotice.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {  CustomerAppBar() }
    ) {

    }
    Box(
        modifier = Modifier.fillMaxSize(), 
        contentAlignment = Alignment.Center
    ) {
        Text(text = "HomeScreen")
        Button(
            onClick = {
                navController.navigate("chat")
            }
        ) {
            Text(text = "Click here")
        }
    }    
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomerAppBar() {
    Box(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null
        )
        TopAppBar(
            title = {
                Text(
                    text = "Home",
                    color = Color.White
                )
            },
            actions = {
                 SearchAction()
            }
        )
    }

}

@Composable
fun SearchAction() {
    val content = LocalContext.current
    IconButton(
        onClick = {
        Toast.makeText(content, "search clicked", Toast.LENGTH_SHORT).show()
    }
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = "search icons",
            tint = Color.White
        )
    }

}

