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
import androidx.compose.material3.TextButton
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
fun RegistrationScreen(navController: NavController) {
    val userName by remember {
        mutableStateOf("")
    }
    val phoneNumber by remember {
        mutableStateOf("")
    }
    val emailAddress by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
    }
    val confirmPassword by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        Alignment.Center
    ) {
        Column() {
            Text(text = "Username", modifier = Modifier.padding(start = 15.dp))
            TextField(value =  userName, onValueChange = {}, modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .size(50.dp)
            )
            Text(text = "Enter Phone", modifier = Modifier.padding(start = 15.dp))
            TextField(value = phoneNumber, onValueChange = {}, modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .sizeIn(50.dp)
            )
            Text(text = "Enter emailAddress", modifier = Modifier.padding(start = 15.dp))
            TextField(value = emailAddress, onValueChange = {}, modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .size(50.dp)
            )
            Text(text = "Enter Password", modifier = Modifier.padding(start = 15.dp))
            TextField(value = password, onValueChange = {}, modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .size(50.dp)
            )
            Text(text = "Confirm password", modifier = Modifier.padding(start = 15.dp))
            TextField(value = confirmPassword, onValueChange = {}, modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .size(50.dp)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = { navController.navigate("login") }) {
                Text(
                    text = "Create Account",
                    modifier = Modifier.padding(start = 25.dp)
                )
            }
            TextButton(onClick = {
                navController.navigate("admin")
            }) {
                Text(
                    text = "Register as Admin",
                    modifier = Modifier.padding(start = 25.dp)
                )

            }

        }
    }
}