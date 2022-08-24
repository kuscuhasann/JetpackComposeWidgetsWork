package com.pakt_games.jetpackcomposewidgetswork

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun ImageWorkPage() {
    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "+ işareti")
}