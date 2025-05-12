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


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.remember

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.flightmate.components.BottomNavigationBar


//@Composable
//fun HomeScreen(navController: NavController) {
//    // Dummy list of posts for the feed
//    val feedPosts = remember { listOf("Post 1", "Post 2", "Post 3", "Post 4", "Post 5") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black)
//    ) {
//        // Header with the title
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "FlightMate Feed",
//                fontSize = 24.sp,
//                color = Color(0xFFFFD700), // Gold text
//                modifier = Modifier.weight(1f)
//            )
//        }
//
//        // LazyColumn for the feed content
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp)
//        ) {
//            items(feedPosts) { post ->
//                PostCard(postContent = post)
//            }
//        }
//    }
//
//    // Bottom Navigation Bar - Use the existing BottomNavigationBar
//    BottomNavigationBar(navController = navController as NavHostController)
//}
//
//@Composable
//fun PostCard(postContent: String) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        backgroundColor = Color.Black,
//        elevation = 4.dp
//    ) {
//        Row(modifier = Modifier.padding(16.dp)) {
//            Text(
//                text = postContent,
//                color = Color(0xFFFFD700),
//                fontSize = 18.sp
//            )
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewHomeScreen() {
//    // For preview, pass an empty NavController
//    HomeScreen(navController = NavController(LocalContext.current))
//}
@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome to FlightMate",
            color = Color(0xFFFFD700), // Gold color
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate("profile_screen") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700))
        ) {
            Text(text = "Go to Profile", color = Color.Black, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("direct_messages_screen") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700))
        ) {
            Text(text = "Go to Messages", color = Color.Black, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("communities_screen") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700))
        ) {
            Text(text = "Go to Communities", color = Color.Black, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("tools_screen") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700))
        ) {
            Text(text = "Go to Tools", color = Color.Black, fontSize = 16.sp)
        }
    }
}