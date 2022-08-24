package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun TopAppBarWorkPage() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Google")})
        },
        content = {

        }
    )
}