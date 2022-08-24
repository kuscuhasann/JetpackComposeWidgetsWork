package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ProgresIndicator() {
    val progressStatus = remember {
        mutableStateOf(false)
    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if(progressStatus.value) {
            CircularProgressIndicator(color = Color.Green)
        }
        
        Row(
            Modifier.fillMaxWidth(), 
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = { progressStatus.value = true}) {
                Text(text = "Start")
            }
            Button(onClick = { progressStatus.value = false}) {
                Text(text = "Stop")
            }
        }
    }
}