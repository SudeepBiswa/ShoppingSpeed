package com.example.shoppingspeed

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*
I could have a array of all items in store.
make a random list using those values.

using rows and columns I can make a grid pattern for store item placements
I can use image command to set pngs as images for each item.

I will have to figure out timer
I can have item list on the top and have item turn green when user clicks on item.
    - I will need to figure out SavedStates
*/
@Composable
fun EasyLevel(navController: NavController){
    Column(modifier = Modifier.border(width = 5.dp,brush = Brush.horizontalGradient(), shape = RectangleShape )){

    }
}