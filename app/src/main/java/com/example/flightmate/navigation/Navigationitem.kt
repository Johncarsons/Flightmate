package com.example.flightmate.navigation

sealed class NavigationItem(val route: String) {
    object NewScreen : NavigationItem("new_screen")
    object LoginScreen : NavigationItem("login_screen")
    object RegisterScreen : NavigationItem("register_screen")
    object HomeScreen : NavigationItem("home_screen")
    object ProfileScreen : NavigationItem("profile_screen")
    object DirectMessagesScreen : NavigationItem("direct_messages_screen")
    object CommunitiesScreen : NavigationItem("communities_screen")
    object ToolsScreen : NavigationItem("tools_screen")
    object EfbScreen : NavigationItem("efb_screen")
    object LogBookScreen : NavigationItem("logbook_screen")
}