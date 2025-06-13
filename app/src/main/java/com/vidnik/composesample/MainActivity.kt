package com.vidnik.composesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vidnik.composesample.ui.theme.ComposeSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeSampleTheme {
                ComposeSample()
            }
        }
    }
}

@Composable
fun ComposeSample() {

    /**
     * Uncomment one by one to see the Composable
     */

    /**
     * Here is two Text Composable in one Column
     */
    /*Column(
        modifier = modifier.background(Color.White).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
                .background(Color.Green)
            *//*.padding(16.dp)*//*,
            color = Color.Blue,
            fontSize = 30.sp,
        )
        Text(
            text = "Different Text",
            modifier = modifier
                .background(Color.Yellow)
            *//*.padding(16.dp)*//*,
            color = Color.Blue,
            fontSize = 30.sp,
        )
    }*/

    /**
     * Here is two Text Composable in one Row
     */
    /*Row(
        modifier = modifier.background(Color.White).fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
                .background(Color.Green)
            *//*.padding(16.dp)*//*,
            color = Color.Blue,
            fontSize = 30.sp,
        )
        Text(
            text = "Different Text",
            modifier = modifier
                .background(Color.Yellow)
            *//*.padding(16.dp)*//*,
            color = Color.Blue,
            fontSize = 30.sp,
        )
    }*/
    /**
     * Here is two Text Composable in one Box
     */
    /*Box(
        modifier = modifier.background(Color.White).fillMaxSize(),
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
                .background(Color.Green).align(Alignment.BottomEnd)
            *//*.padding(16.dp)*//*,
            color = Color.Blue,
            fontSize = 30.sp,
        )
        Text(
            text = "Different Text",
            modifier = modifier
                .background(Color.Yellow)
            *//*.padding(16.dp)*//*,
            color = Color.Blue,
            fontSize = 30.sp,
        )
    }*/
    /**
     * Here is Image Composable
     */
    /*Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = null,
        modifier = modifier.background(Color.Black)
    )*/
    /**
     * Here is Icon Composable
     */
    /*Icon(
        imageVector = Icons.Default.Add,
        contentDescription = null,
    )*/
    /**
     * Icon Composable with a Loop
     */
    /*Column {
        for (i in 1..10){
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
            )
        }
    }*/
    /**
     * Icon Composable with a LazyColumn
     * We can replace LazyColumn with LazyRow to have horizontal scroll
     */
    /*LazyColumn(modifier = modifier.fillMaxSize()) {
        items(10){
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
        }
    }*/

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "0")
        Button(onClick = {

        }) {
            Text(text = "Click me!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeSamplePreview() {
    ComposeSampleTheme {
        ComposeSample()
    }
}