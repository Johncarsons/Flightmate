package com.example.flightmate.ui.theme.screens

//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.foundation.text.KeyboardActions
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material.Button
//import androidx.compose.material.ButtonDefaults
//import androidx.compose.material.Text
//import androidx.compose.material.OutlinedTextField
//import androidx.compose.material.TextFieldDefaults
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.input.ImeAction
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import androidx.compose.ui.text.font.FontWeight
//import androidx.navigation.compose.rememberNavController
//
//@Composable
//fun NewScreen(navController: NavController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black)
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "Welcome to FlightMate",
//            color = Color(0xFFFFD700), // Gold text
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold
//        )
//
//        Spacer(modifier = Modifier.height(40.dp))
//
//        Button(
//            onClick = { navController.navigate("login_screen") },
//            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700)),
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(text = "Log In", color = Color.Black, fontWeight = FontWeight.Bold)
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Button(
//            onClick = { navController.navigate("register_screen") },
//            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700)),
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(text = "Register", color = Color.Black, fontWeight = FontWeight.Bold)
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewNewScreen() {
//    NewScreen(navController = rememberNavController())
//}
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
fun NewScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Welcome to FlightMate!", color = Color(0xFFFFD700), fontSize = 28.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("login_screen") }) {
            Text("Log In", color = Color.White)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("register_screen") }) {
            Text("Register", color = Color.White)
        }
    }
}