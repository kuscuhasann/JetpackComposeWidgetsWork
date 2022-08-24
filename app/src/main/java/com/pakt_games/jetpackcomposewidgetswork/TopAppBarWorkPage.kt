package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun TopAppBarWorkPage() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Google")},
                actions = {
                    Text(text = "Exit", modifier = Modifier.clickable {
                    System.exit(1)
                    }
                )
                    IconButton(onClick = {  }) {
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_add_24), contentDescription = "")
                    }
                }
            )
        },
        content = {

        }
    )
}