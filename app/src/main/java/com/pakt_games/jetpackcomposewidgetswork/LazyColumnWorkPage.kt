package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LayzColumnWorkPage(navController: NavController) {
    val countryList = remember { mutableStateListOf("İsviçre","Türkiye", "Uganda", "Norveç")}
    LazyColumn {
        countryList.forEachIndexed { index, countryName ->
            item {
                Card(
                    modifier = Modifier
                        .padding(all = 10.dp)
                        .fillMaxWidth(),
                    elevation = 10.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(corner = CornerSize(16.dp)),
                    border = BorderStroke(2.dp, Color.DarkGray)
                ) {
                    Row(modifier = Modifier.clickable {
                        navController.navigate("layzColumnDetailPage/$countryName")
                    }) {
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier.padding(all = 10.dp)
                        ) {
                            Text(text = countryName)
                        }
                    }
                }
            }
        }
    }
}