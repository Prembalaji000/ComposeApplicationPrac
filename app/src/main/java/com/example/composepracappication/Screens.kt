package com.example.composepracappication

sealed class Screens(val Screen : String){
    data object Home: Screens("Home")
    data object Profile: Screens("Profile")
    data object Setting: Screens("Setting")
    data object Notification: Screens("Notification")
    data object Post: Screens("Post")
    data object Search: Screens("Search")
}