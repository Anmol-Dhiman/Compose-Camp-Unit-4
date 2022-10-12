package com.example.navigationcamp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationcamp4.ui.theme.NavigationCamp4Theme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NavigationCamp4Theme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}


