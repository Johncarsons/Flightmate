package com.example.flightmate.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    BottomNavigation(
        backgroundColor = Color.Black,
        contentColor = Color(0xFFFFD700) // Gold color for the icons
    ) {
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = false,
            onClick = { navController.navigate("home_screen") }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.AccountCircle, contentDescription = "Profile") },
            label = { Text("Profile") },
            selected = false,
            onClick = { navController.navigate("profile_screen") }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Message, contentDescription = "Messaging") },
            label = { Text("Messages") },
            selected = false,
            onClick = { navController.navigate("direct_messages_screen") }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Group, contentDescription = "Communities") },
            label = { Text("Communities") },
            selected = false,
            onClick = { navController.navigate("communities_screen") }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Build, contentDescription = "Tools") },
            label = { Text("Tools") },
            selected = false,
            onClick = { navController.navigate("tools_screen") }
        )
    }
}