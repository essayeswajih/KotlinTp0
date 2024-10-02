package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.fillMaxSize().padding(innerPadding)){
                        SimpleRow1 (modifier = Modifier.fillMaxSize().padding(innerPadding))//   Design 1
                        //SimpleRow1 (modifier = Modifier.fillMaxSize().padding(innerPadding))   Design 2
                    }
                }
            }
        }
    }
}
@Composable
fun SimpleRow1(modifier: Modifier){
    Row (modifier=Modifier.fillMaxHeight(.5f)){
        Column(modifier=Modifier.fillMaxWidth(1f).fillMaxHeight(1f).background(color = Color.Red)) {

        }
    }
    Row (modifier=Modifier.fillMaxHeight(1f)){
        Column(modifier=Modifier.fillMaxWidth(.5f).fillMaxHeight(1f).background(color = Color.Blue)) {

        }
        Column(modifier=Modifier.fillMaxWidth(1f).fillMaxHeight(1f).background(color = Color.Green)) {

        }
    }
}



@Composable
fun SimpleRow(modifier: Modifier){
    Row (modifier=Modifier.fillMaxHeight(.5f)){
        Column(modifier=Modifier.fillMaxWidth(.5f).fillMaxHeight(1f).background(color = Color.Blue)) {

        }
        Column(modifier=Modifier.fillMaxWidth(1f).fillMaxHeight(1f).background(color = Color.Green)) {

        }
    }
    Row (modifier=Modifier.fillMaxHeight(1f)){
        Column(modifier=Modifier.fillMaxWidth(.5f).fillMaxHeight(1f).background(color = Color.Red)) {

        }
        Column(modifier=Modifier.fillMaxWidth(1f).fillMaxHeight(1f).background(color = Color.Yellow)) {

        }
    }
}
