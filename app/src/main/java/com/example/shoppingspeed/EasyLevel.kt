package com.example.shoppingspeed

import android.os.CountDownTimer
import android.util.Log
import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.shoppingspeed.ui.theme.bubbley
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import org.w3c.dom.Text
import kotlin.random.Random

/*
I could have a array of all items in store.
make a random list using those values.

using rows and columns I can make a grid pattern for store item placements
I can use image command to set pngs as images for each item.

I will have to figure out timer
I can have item list on the top and have item turn green when user clicks on item.
    - I will need to figure out SavedStates
*/

var shoppingItems = arrayOf("beef","apples","onions","tomatoes","pork","sugar","bacon","eggs","pasta","rice","pizza","vinegar", "popcorn","pastasauce","potatoes",
    "bread","milk","lemon","oil","cereal","butter","bananas","cheese","strawberries")
var itemImges = arrayOf(R.drawable.beef, R.drawable.apples, R.drawable.onions, R.drawable.tomatoes, R.drawable.pork, R.drawable.sugar, R.drawable.bacon, R.drawable.eggs, R.drawable.pasta, R.drawable.rice, R.drawable.pizza, R.drawable.vinegar,
    R.drawable.popcorn, R.drawable.pastasauce, R.drawable.potatoes, R.drawable.bread, R.drawable.milk, R.drawable.lemon, R.drawable.oil, R.drawable.cereal, R.drawable.butter, R.drawable.bananas, R.drawable.cheese, R.drawable.strawberries)
var listItem = arrayOf(random(),)

@Composable
fun EasyLevel(navController: NavController){

    Column() {
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)){
            Text("THE SHOP", fontFamily = bubbley, fontSize = 80.sp)
        }
        Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
            createItems()
        }
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)){
            Column() {
                var timerText : MutableState<String> = remember { mutableStateOf("")}

                object : CountDownTimer(30000, 1000) {

                    override fun onTick(millisUntilFinished: Long) {
                        timerText.value = "Time remaining: " + (millisUntilFinished / 1000) +"s"

                    }

                    override fun onFinish() {
                        timerText.value = "done!"
                        this.cancel()
                    }
                }.start()
                Text(text = "${timerText.value}")
            }
        }
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Column(modifier = Modifier.padding(8.dp)) {
                Button(onClick = { navController.navigate(Screen.Home.route) }) {
                    Text(text = "QUIT", fontSize = 8.sp)
                }
            }
        }
        Row(){
         grid() }
    }


}
@Composable
fun random(){
    shoppingItems[Random.nextInt(0,23)]
}
@Composable
fun grid(){
    //var gridItem = ""
    var gridItems = ""
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        content ={
            items(24){i ->
                Box(
                    modifier = Modifier
                        .clickable {
                            if(gridItems == item1 ||gridItems == item2 ||gridItems == item3 ||gridItems == item4 ||gridItems == item5 ||gridItems == item6){

                            }
                        }
                        .padding(12.dp)
                        .aspectRatio(1f)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.Transparent),
                    contentAlignment = Alignment.Center
                ){
                    gridItems = shoppingItems[i]
                    Image(painter = painterResource(id = itemImges[i]), contentDescription = null)
                    Text(text = gridItems, modifier = Modifier.align(Alignment.TopCenter), fontSize = 20.sp, fontFamily = bubbley)
                }
            }
        })
}

@Composable
fun createItems(){
    var score: MutableState<Int> = remember { mutableStateOf(0) }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = item1)
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = item2)
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = item3)
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = item4)
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = item5)
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = item6)
        }
        Column(modifier = Modifier.padding(8.dp)) {
           Text(text = "${score.value}")
        }


}





