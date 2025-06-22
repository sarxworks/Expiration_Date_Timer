package com.example.expirationdatetimer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.expirationdatetimer.ui.theme.ExpirationDateTimerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MessageCard(
                        Message("Donte & Saloni", "Welcome to Android", "Look at My Code!")
                        )


                }
            }
        }


data class Message (val author: String, val body: String, val body2: String)

@Composable
fun MessageCard(msg: Message){
    Column {
        Text(msg.author)
        Text(msg.body)
        Text(msg.body2)
        Spacer(Modifier.padding(10.dp,10.dp))
    }



}

// For Preview Screen (optional)
@Preview
@Composable
fun MessageCardPreview() {
    MessageCard(
        Message("Donte & Saloni", "Welcome to Android", "Look at my Code!")
    )


    }
