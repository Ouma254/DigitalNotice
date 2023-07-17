package com.deknowh.digitalnotice.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminRegistration(navController: NavController) {
    val userName by remember {
        mutableStateOf("")
    }
    val company by remember {
        mutableStateOf("")
    }
    val emailAddr by remember {
        mutableStateOf("")
    }
    val phone by remember {
        mutableStateOf("")
    }
    val passwd by remember {
        mutableStateOf("")
    }
    val confirmPasswd by remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        Alignment.Center
    ) {
        Column() {
            Text(text = "Username", modifier = Modifier.padding(start = 15.dp))
            TextField(
                value = userName, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .size(50.dp)
            )
            Text(text = "Enter Username", modifier = Modifier.padding(start = 15.dp))
            TextField(
                value = userName, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .sizeIn(50.dp)
            )
            Text(
                text = "Enter Company/Institution Name",
                modifier = Modifier.padding(start = 15.dp)
            )
            TextField(
                value = company, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .size(50.dp)
            )
            Text(text = "Enter EmailAddress", modifier = Modifier.padding(start = 15.dp))
            TextField(
                value = emailAddr, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .size(50.dp)
            )
            Text(text = "Enter Password", modifier = Modifier.padding(start = 15.dp))
            TextField(
                value = passwd, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .size(50.dp)
            )
            Text(text = "Confirm Password", modifier = Modifier.padding(start = 15.dp))
            TextField(
                value = confirmPasswd, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .size(50.dp)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = { navController.navigate("adminlogin") }) {
                Text(
                    text = "Create Account",
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}