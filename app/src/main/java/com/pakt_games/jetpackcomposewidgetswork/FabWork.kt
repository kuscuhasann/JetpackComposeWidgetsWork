package com.pakt_games.jetpackcomposewidgetswork

import android.util.Log
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun PageFab() {
    Scaffold(content = {

    }, floatingActionButton = {
        FloatingActionButton(
            onClick = {
                Log.e("fab","Tıklandı")
            },
            backgroundColor = Color.Blue,
            content = {
                Icon(painter = painterResource(id = R.drawable.ic_baseline_add_24), contentDescription = "fab")
            }
        )
    })
}