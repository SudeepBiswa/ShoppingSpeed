package com.example.shoppingspeed

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Difficulty: Screen(route = "difficulty_screen")
    object EasyLvl: Screen(route = "easy_level")
    object NormalLvl: Screen(route = "normal_level")
    object HardLvl: Screen(route = "hard_level")
}