package com.example.flightmate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.flightmate.ui.theme.screens.CommunitiesScreen
import com.example.flightmate.ui.theme.screens.DirectMessagesScreen
import com.example.flightmate.ui.theme.screens.EfbScreen
import com.example.flightmate.ui.theme.screens.HomeScreen
import com.example.flightmate.ui.theme.screens.LogbookScreen
import com.example.flightmate.ui.theme.screens.ProfileScreen
import com.example.flightmate.ui.theme.screens.SettingsScreen
import com.example.flightmate.ui.theme.screens.ToolsScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home_screen") {
        composable("home_screen") { HomeScreen(navController) }
        composable("profile_screen") { ProfileScreen(navController) }
        composable("direct_messages_screen") { DirectMessagesScreen(navController) }
        composable("communities_screen") { CommunitiesScreen(navController) }
        composable("tools_screen") { ToolsScreen(navController) }
        composable("logbook_screen") { LogbookScreen(navController) }
        composable("efb_screen") { EfbScreen(navController) }
        composable("settings_screen") { SettingsScreen(navController) }
    }
}