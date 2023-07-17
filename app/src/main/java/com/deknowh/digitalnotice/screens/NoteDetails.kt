package com.deknowh.digitalnotice.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.deknowh.digitalnotice.data.NoteEntity

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NoteScreenD(
    noteEntity: NoteEntity,
    navController: NavController
) {
    Scaffold(
         topBar = {
             TopAppBar(
                 colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Blue),
                 title = {
                         Text(
                             text = "Note Details",
                             color = Color.White
                         )
                 },

             )
         }

    ) {

    }
}