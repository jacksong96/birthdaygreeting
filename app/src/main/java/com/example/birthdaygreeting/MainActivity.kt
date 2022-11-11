package com.example.birthdaygreeting

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.birthdaygreeting.ui.theme.BirthdaygreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdaygreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithText("Happy Birthday Sam!", "-from Emma")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
   Column {
       Text(text = message, fontSize = 36.sp)
       Text(text = from, fontSize = 36.sp)
   }
}

@Preview(name= "MyPreview", showSystemUi = true)
@Composable
fun BirthdayGreetingWithTextPreview() {
    BirthdaygreetingTheme {
        BirthdayGreetingWithText("Happy Birthday Sam!", "-from Emma")
    }
}