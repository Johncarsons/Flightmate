package com.example.flightmate

import android.annotation.SuppressLint


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.flightmate.navigation.NavGraph
import com.example.flightmate.components.BottomNavigationBar
import com.example.flightmate.ui.theme.FlightMateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlightMateApp()
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FlightMateApp() {
    FlightMateTheme {
        val navController = rememberNavController()
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        Scaffold(
            bottomBar = {
                if (shouldShowBottomNav(currentDestination)) {
                    BottomNavigationBar(navController = navController)
                }
            }
        ) {
            NavGraph(navController = navController)
        }
    }
}

fun shouldShowBottomNav(destination: NavDestination?): Boolean {
    // Define where the Bottom Navigation Bar should be visible
    return destination?.hierarchy?.any {
        it.route in listOf(
            "home_screen",
            "profile_screen",
            "direct_messages_screen",
            "communities_screen",
            "tools_screen"
        )
    } ?: false
}
