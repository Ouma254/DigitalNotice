package com.deknowh.digitalnotice.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun LoginScreen(navController: NavController) {
    val email by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "email", modifier = Modifier.padding(start = 15.dp))
        TextField(value = email, onValueChange = {}, modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
        )
        Text(text = "password", modifier = Modifier.padding(start = 15.dp))
        TextField(value = password, onValueChange = {}, modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                navController.navigate("chat")
            }
        ) {
            Text(
                text = "Login",
                modifier = Modifier.padding(5.dp)
            )
        }
        Spacer(modifier = Modifier.padding(8.dp))
        TextButton(
            onClick = { navController.navigate("register") }
        ) {
            Text(
                text = "Sign up ",
                modifier = Modifier.padding(25.dp)
            )
        }
        TextButton(
            onClick = {
                navController.navigate("adminlogin")

        }) {
            Text(text = "Login As Admin")

        }
    }

}