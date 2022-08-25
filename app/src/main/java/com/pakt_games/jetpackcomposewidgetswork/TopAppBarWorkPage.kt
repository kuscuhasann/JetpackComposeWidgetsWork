package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun TopAppBarWorkPage() {
    val menuOpeningControl = remember {
        mutableStateOf(false)
    }
    val isSearchEnabled = remember {
        mutableStateOf(false)
    }
    val menuItemList = listOf("Şeker", "Tuz","Leblebi")
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Google")},
                actions = {
                    Text(text = "Exit", modifier = Modifier.clickable {
                    System.exit(1)
                    }
                )
                    IconButton(onClick = {
                        menuOpeningControl.value = true
                    }) {
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_menu_24), contentDescription = "")
                    }

                    DropdownMenu(expanded = menuOpeningControl.value, onDismissRequest = { menuOpeningControl.value = false }) {
                        menuItemList.forEachIndexed { index, menuItemName ->
                            DropdownMenuItem(onClick = { menuOpeningControl.value }) {
                                Text(text = menuItemName)
                            }
                        }
                    }

                    if (isSearchEnabled.value) {
                        IconButton(onClick = {
                            isSearchEnabled.value = true
                        }) {
                            Icon(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "")
                        }
                    } else {
                        IconButton(onClick = {
                            isSearchEnabled.value = true
                        }) {
                            Icon(painter = painterResource(id = R.drawable.ic_baseline_search_24), contentDescription = "")
                        }
                    }


                }
            )
        },
        content = {

        }
    )
}