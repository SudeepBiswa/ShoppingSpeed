package com.example.shoppingspeed

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.shoppingspeed.ui.theme.bubbley
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Win(navController: NavController){
    Column() {
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "You Win", fontSize = 80.sp, fontFamily = bubbley)
        }
        Row(){
            Button(onClick = { navController.navigate(Screen.Home.route) }, modifier = Modifier.padding(12.dp)) {
                Text(text = "Main Menu")
            }
        }
    }
}