package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun RadioButtonhWorkPage() {
    val radioButtonSelectedIndex = remember {
        mutableStateOf(0)
    }
    val foodList = listOf("Nutella", "Et ürünleri")
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            foodList.forEachIndexed { index, food ->
                Row {
                    RadioButton(
                        selected = food == foodList[radioButtonSelectedIndex.value] ,
                        onClick = {
                            radioButtonSelectedIndex.value = index
                        })
                    Text(text = food)
                }
            }
        }
        Text(text ="Switchin son durumu: " + radioButtonSelectedIndex.value)
    }
}