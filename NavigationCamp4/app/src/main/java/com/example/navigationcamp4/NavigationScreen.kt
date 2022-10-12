package com.example.navigationcamp4


//in jetpack each screen should have a unique name or route
//when we do have to create many instances of a class then we use sealed classes
//mainly for the small work and purposes
sealed class NavigationScreen(val route: String) {
    object Hello : NavigationScreen(route = "hello_screen")
    object gdsc : NavigationScreen(route = "gdsc_screen")
}
