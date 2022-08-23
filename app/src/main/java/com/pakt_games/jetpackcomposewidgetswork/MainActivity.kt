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
                    MainPage()
                }
            }
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
        Text(text = "Yazdığınız Veri: " + labelField.value)
        
        OutlinedTextField(
            value = textFieldData.value ,
            onValueChange = { textFieldData.value = it},
            label = { Text(text = "Buraya bir değer giriniz.")}
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