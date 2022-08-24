package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.layout.*

import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun SliderWorkPage() {
    val valueOfSlider = remember {
        mutableStateOf(0f)
    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Slider Değeri: " + valueOfSlider.value)

        Slider(value = valueOfSlider.value, onValueChange = {valueOfSlider.value = it} )
    }
}