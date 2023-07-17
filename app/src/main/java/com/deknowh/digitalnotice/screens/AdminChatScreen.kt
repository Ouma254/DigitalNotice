package com.deknowh.digitalnotice.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminChat(navController: NavController) {
    Box(modifier = Modifier.padding(16.dp)) {
         val title by remember {
             mutableStateOf("")
         }
        val description by remember {
            mutableStateOf("")
        }
//        if (noteEntity != null) {
//            title = noteEntity.title
//            description = noteEntity.description
//        }

        val context = LocalContext.current

    }
     Scaffold(
         topBar = {
             TopAppBar(
                 title = {
                 Text(text = "Create A New notice")
             },
                 
             )
         },
     ) {
         Column(modifier = Modifier
             .fillMaxWidth()
             .padding(16.dp)) {
             Text(
                 text = "title",
                 modifier = Modifier.fillMaxWidth(),
                 color = Color.White,
                 fontSize = 24.sp,
                 fontWeight = FontWeight(500)
             ) 
             Spacer(modifier = Modifier.height(16.dp))
             Text(text = "Description", color = Color.Blue, fontSize = 18.sp, fontWeight = FontWeight.Normal)
         }
     }
}