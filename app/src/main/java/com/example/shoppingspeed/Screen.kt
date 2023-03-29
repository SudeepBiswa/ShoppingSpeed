package com.example.shoppingspeed

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Difficulty: Screen(route = "difficulty_screen")
}