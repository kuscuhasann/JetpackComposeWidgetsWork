package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun DropDownMenuWorkPage() {
    val dropDownMenuStatus = remember {
        mutableStateOf(false)
    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Button(onClick = {
            dropDownMenuStatus.value = true
            }) {
            Text(text = "Aç")
            }
            DropdownMenu(expanded = dropDownMenuStatus.value, onDismissRequest = {
                dropDownMenuStatus.value = false
            }) {
                DropdownMenuItem(onClick = {
                    dropDownMenuStatus.value = false
                }) {
                    Text(text = "Kulaklıklar")
                }
                DropdownMenuItem(onClick = {
                    dropDownMenuStatus.value = false
                }) {
                    Text(text = "Klavyeler")
                }
            }
        }
    }
}