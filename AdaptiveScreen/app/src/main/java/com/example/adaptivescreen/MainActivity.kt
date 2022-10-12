package com.example.adaptivescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.adaptivescreen.ui.theme.AdaptiveScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdaptiveScreenTheme {
                val windowInfo = rememberWindowSize()
                when (windowInfo.width) {
                    WindowType.Compact -> {
                        LazyColumn(modifier = Modifier.fillMaxSize()) {
                            items(10) {
                                Text(
                                    text = "item $it", fontSize = 25.sp,
                                    color = Color.Blue,
                                    modifier = Modifier
                                        .padding(16.dp)
                                        .background(Color.Red)
                                        .fillMaxWidth()
                                )
                            }
                            items(10) {
                                Text(
                                    text = "item $it", fontSize = 25.sp,
                                    color = Color.Red,
                                    modifier = Modifier
                                        .padding(16.dp)
                                        .fillMaxWidth()
                                        .background(Color.Blue)
                                )
                            }
                        }
                    }
                    else -> {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            LazyColumn(modifier = Modifier.weight(1f)) {
                                items(10) {
                                    Text(
                                        text = "item $it",
                                        fontSize = 25.sp,
                                        color = Color.Blue,
                                        modifier = Modifier
                                            .padding(16.dp)
                                            .background(Color.Red)
                                            .fillMaxWidth()
                                    )
                                }
                            }
                            LazyColumn(modifier = Modifier.weight(1f)) {
                                items(10) {
                                    Text(
                                        text = "item $it", fontSize = 25.sp,
                                        color = Color.Red,
                                        modifier = Modifier
                                            .padding(16.dp)
                                            .background(Color.Blue)
                                            .fillMaxWidth()
                                    )
                                }
                            }

                        }
                    }
                }
            }
        }
    }

}

