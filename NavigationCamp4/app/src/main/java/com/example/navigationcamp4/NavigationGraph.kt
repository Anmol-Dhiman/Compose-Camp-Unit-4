package com.example.navigationcamp4

import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController

@Composable
//navController keep track of back stack
//nav host define our navigation graph
fun SetupNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = NavigationScreen.Hello.route) {
        composable(route = NavigationScreen.Hello.route) {
            Hello(navController)
        }
//        gdsc_screen
        composable(route = "gdsc_screen") {
            GDSC(navController)
        }

    }
}