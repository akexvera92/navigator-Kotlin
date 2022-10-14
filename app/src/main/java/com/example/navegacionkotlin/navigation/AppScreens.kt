package com.example.navegacionkotlin.navigation

sealed class AppScreens( val route: String){
    object  firstScreen :AppScreens(route = "firstScreen")
    object  secondtScreen :AppScreens(route = "secondScreen")
    object thirdScreen :AppScreens(route = "thirdScreen")
}