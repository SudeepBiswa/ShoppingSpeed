package com.example.shoppingspeed

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.shoppingspeed.ui.theme.bubbley

@Composable
fun HomeScreen(navController: NavController){
    Image(painter = painterResource(id = R.drawable.backgroundimage), contentDescription = null,
        contentScale = ContentScale.FillHeight,
        modifier = Modifier.fillMaxSize())

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize()
            .padding(top = 15.dp)) {
        Text("Speed", fontSize = 90.sp, fontFamily = bubbley, color = Color.Red)
        Text("Shopper", fontSize = 50.sp, fontFamily = bubbley, color = Color.Red)
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 40.dp)) {
        Button(
            onClick = {
                navController.navigate(route = Screen.Difficulty.route)
            }
        ) {
            Text("Start", fontSize = 60.sp, fontFamily = bubbley)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}