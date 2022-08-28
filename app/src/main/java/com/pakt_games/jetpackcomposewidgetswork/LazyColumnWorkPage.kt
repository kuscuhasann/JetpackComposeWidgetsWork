package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LayzColumnWorkPage() {
    LazyColumn {
        item {
            Card(
                modifier = Modifier
                    .padding(all = 10.dp)
                    .fillMaxWidth(),
                elevation = 10.dp,
                backgroundColor = Color.Blue,
                shape = RoundedCornerShape(corner = CornerSize(16.dp)),
                border = BorderStroke(2.dp, Color.Magenta)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.padding(all = 10.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.ic_baseline_search_24), contentDescription = "")
                    Text(text = "Arama Resmi")
                }
            }
        }

        item {
            Card(
                modifier = Modifier
                    .padding(all = 10.dp)
                    .fillMaxWidth(),
                elevation = 10.dp,
                backgroundColor = Color.Blue,
                shape = RoundedCornerShape(corner = CornerSize(16.dp)),
                border = BorderStroke(2.dp, Color.Magenta)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.padding(all = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.ic_baseline_menu_24), contentDescription = "")
                    Text(text = "Menu Resmi")
                }
            }
        }
    }
}