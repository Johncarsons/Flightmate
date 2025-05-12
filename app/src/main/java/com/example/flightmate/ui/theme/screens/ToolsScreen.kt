package com.example.flightmate.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ToolsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tools",
            color = Color(0xFFFFD700),
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Button(
            onClick = { navController.navigate("logbook_screen") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700)),
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text("Logbook", color = Color.Black)
        }

        Button(
            onClick = { navController.navigate("efb_screen") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700)),
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text("EFB", color = Color.Black)
        }
    }
}