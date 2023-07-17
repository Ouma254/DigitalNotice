package com.deknowh.digitalnotice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.deknowh.digitalnotice.data.BottomNavItem
import com.deknowh.digitalnotice.navGraph.Navigate
import com.deknowh.digitalnotice.screens.HomeScreen
import com.deknowh.digitalnotice.screens.LoginScreen
import com.deknowh.digitalnotice.ui.theme.DigitalNoticeTheme
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DigitalNoticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  Navigate()
                }
            }
        }
    }
}

//@Composable
//fun BottomNavigationBar(
//    items: List<BottomNavItem>,
//    navController: NavController,
//    modifier: Modifier = Modifier,
//    onItemClick: (BottomNavItem) -> Unit
//) {
//    BottomNavigation(
//        modifier = Modifier, backg
//    )
//}

//@Composable
//fun BottomNavigationBar(
//    items: List<BottomNavItem>,
//    navController: NavController,
//    modifier: Modifier = Modifier,
//    onItemClick: (BottomNavItem) -> Unit
//) {
//      BottomAppBar(
//          modifier = Modifier
//              .background(Color.DarkGray),
//          tonalElevation = 5.dp
//      ) {
//          items.forEach { item ->
//
//          }
//      }
//}

@SuppressLint("RestrictedApi")
@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomAppBar(
        modifier = modifier,
        containerColor = Color.DarkGray,
        tonalElevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route

        }
    }
}