package com.deknowh.digitalnotice.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminLogin(navController: NavController) {
    val companyName by remember {
        mutableStateOf("")
    }
    val emailId by remember {
        mutableStateOf("")
    }
    val passwdId by remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier.padding(16.dp)) {
        Column() {
            Text(text = "Welcome to Admin Login Page")
            Column() {
                Text(text = "Enter Company Name", modifier = Modifier.padding(start = 15.dp))
                TextField(value = companyName, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .size(50.dp)
                )
                Text(text = "Enter Email Address", modifier = Modifier.padding(start = 15.dp))
                TextField(value = emailId, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .size(50.dp)
                )
                Text(text = "Enter Password", modifier = Modifier.padding(start = 15.dp))
                TextField(value = passwdId, onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .size(50.dp)
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Button(
                    onClick = { navController.navigate("adminchatScreen") }
                ) {
                    Text(text = "Sign In")

                }
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Forgot password?")

                }
            }

        }
    }

}