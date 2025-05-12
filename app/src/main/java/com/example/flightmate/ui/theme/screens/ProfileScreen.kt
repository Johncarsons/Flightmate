package com.example.flightmate.ui.theme.screens



import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.flightmate.components.BottomNavigationBar


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Profile", color = Color(0xFFFFD700), fontSize = 24.sp) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("settings_screen") }) {
                        Icon(Icons.Filled.Settings, contentDescription = "Settings", tint = Color(0xFFFFD700))
                    }
                },
                backgroundColor = Color.Black
            )
        },
        bottomBar = { BottomNavigationBar(navController) }
    ) {
        Text("Profile Details Here", color = Color.White, modifier = Modifier.padding(16.dp))
    }
}
