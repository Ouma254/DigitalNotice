package com.deknowh.digitalnotice.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.deknowh.digitalnotice.screens.AdminChat
import com.deknowh.digitalnotice.screens.AdminLogin
import com.deknowh.digitalnotice.screens.AdminRegistration
import com.deknowh.digitalnotice.screens.ChatScreen
import com.deknowh.digitalnotice.screens.HomeScreen
import com.deknowh.digitalnotice.screens.LoginScreen
import com.deknowh.digitalnotice.screens.RegistrationScreen
import com.deknowh.digitalnotice.screens.SettingScreen
import com.deknowh.digitalnotice.screens.SplashScreen

@Composable
fun Navigate() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen(navController = navController)
        }
        composable("login") {
            LoginScreen(navController = navController)
        }
        composable("home") {
             HomeScreen(navController = navController)
        }
        composable("chat") {
            ChatScreen(navController = navController)
        }
        composable("settings") {
            SettingScreen(navController = navController)
        }
        composable("register") {
            RegistrationScreen(navController = navController)
        }
        composable("admin") {
            AdminRegistration(navController = navController)
        }
        composable("adminlogin") {
            AdminLogin(navController = navController)
        }
//        composable("adminchatScreen") {
//            AdminChat(navController = navController)
     //   }
        composable("Chat") {
            AdminChat(navController = navController)
        }

    }

     
}