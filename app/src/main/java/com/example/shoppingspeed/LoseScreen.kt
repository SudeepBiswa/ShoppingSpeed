package com.example.shoppingspeed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.shoppingspeed.ui.theme.bubbley

@Composable
fun LoseScreen(navController: NavController){
    Column() {
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "You Lose", fontSize = 80.sp, fontFamily = bubbley)
        }
    }
}