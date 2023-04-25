package com.example.shoppingspeed

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.example.shoppingspeed.ui.theme.bubbley

@Composable
fun Win(){
    Text(text = "You Win", fontSize = 80.sp, fontFamily = bubbley)
}