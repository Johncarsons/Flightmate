package com.example.flightmate.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.flightmate.navigation.NavigationItem.LogBookScreen
import com.example.flightmate.ui.theme.screens.CommunitiesScreen
import com.example.flightmate.ui.theme.screens.DirectMessagesScreen
import com.example.flightmate.ui.theme.screens.EfbScreen
import com.example.flightmate.ui.theme.screens.HomeScreen
import com.example.flightmate.ui.theme.screens.LoginScreen
import com.example.flightmate.ui.theme.screens.NewScreen
import com.example.flightmate.ui.theme.screens.ProfileScreen
import com.example.flightmate.ui.theme.screens.RegisterScreen
import com.example.flightmate.ui.theme.screens.ToolsScreen
import androidx.navigation.compose.composable
import com.example.flightmate.ui.theme.screens.LogbookScreen


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "new_screen") {

        composable("new_screen") {
            NewScreen(navController)
        }

        composable("login_screen") {
            LoginScreen(navController)
        }

        composable("register_screen") {
            RegisterScreen(navController)
        }

        composable("home_screen") {
            HomeScreen(navController)
        }

        composable("profile_screen") {
            ProfileScreen(navController)
        }

        composable("direct_messages_screen") {
            DirectMessagesScreen(navController)
        }

        composable("communities_screen") {
            CommunitiesScreen(navController)
        }

        composable("tools_screen") {
            ToolsScreen(navController)
        }

        composable("logbook_screen") {
            LogbookScreen(navController)
        }

        composable("efb_screen") {
            EfbScreen(navController)
        }
    }
}