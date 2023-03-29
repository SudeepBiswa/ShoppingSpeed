package com.example.shoppingspeed

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.shoppingspeed.ui.theme.bubbley

@Composable
fun DifficultyScreen(navController: NavController){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceEvenly,
    modifier = Modifier.fillMaxSize()){
        Button(onClick = { /*TODO*/ }) {
            Text("Easy", fontFamily = bubbley, fontSize = 40.sp)
        }
        Button(onClick = { /*TODO*/ }) {
            Text("Normal", fontFamily = bubbley, fontSize = 60.sp)
        }
        Button(onClick = { /*TODO*/ }) {
            Text("Hard", fontFamily = bubbley, fontSize = 80.sp)
        }
        Button(onClick = {
            navController.navigate(route = Screen.Home.route)
        }) {
            Text("Main Menu", fontFamily = bubbley, fontSize = 40.sp)
        }
    }
}