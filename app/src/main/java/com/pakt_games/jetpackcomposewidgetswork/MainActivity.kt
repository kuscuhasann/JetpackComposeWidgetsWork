package com.pakt_games.jetpackcomposewidgetswork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pakt_games.jetpackcomposewidgetswork.ui.theme.JetpackComposeWidgetsWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeWidgetsWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LayzColumnPageTransfer()
                }
            }
        }
    }
}

@Composable
fun LayzColumnPageTransfer() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "layzColumnMainPage") {
        composable("layzColumnMainPage") {
            LayzColumnWorkPage(navController = navController)
        }

        composable("layzColumnDetailPage/{countryName}", arguments = listOf(
            navArgument("countryName") {type = NavType.StringType}
        )) {
            val countryName = it.arguments?.getString("countryName")
            LayzColumnDetailPage(countryName = countryName.toString())
        }
    }
}

@Composable
fun MainPage() {
    val textFieldData = remember { mutableStateOf("")}
    val labelField = remember { mutableStateOf("")}
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Yazd??????n??z Veri: " + labelField.value)
        
        OutlinedTextField(
            value = textFieldData.value ,
            onValueChange = { textFieldData.value = it},
            label = { Text(text = "Buraya bir de??er giriniz.")}
        )
        OutlinedButton(onClick = {
            labelField.value = textFieldData.value
        }) {
            Text(text = "Veriyi Aktar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeWidgetsWorkTheme {
        MainPage()
    }
}