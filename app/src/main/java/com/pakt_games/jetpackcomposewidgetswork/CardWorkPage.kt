package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CardWorkPage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Card(
            modifier = Modifier
                .padding(all = 10.dp)
                .fillMaxWidth(),
            elevation = 10.dp,
            backgroundColor = Color.Red,
            shape = RoundedCornerShape(corner = CornerSize(16.dp)),
            border = BorderStroke(10.dp, Color.Magenta)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.clickable {
                    println("Tıklandı")
                }
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(all = 10.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "")
                    Text(text = "çarpı")
                }
            }
        }
    }
}