package com.example.navegacionkotlin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacionkotlin.screens.firstScreen
import com.example.navegacionkotlin.screens.secondScreen
import com.example.navegacionkotlin.screens.thirdScreen

@Composable

fun AppNavigation(){
    val navController =rememberNavController()
    NavHost(
        navController=navController,
        startDestination=AppScreens.firstScreen.route
    ){
    composable(route = AppScreens.firstScreen.route){
        firstScreen(navController)
    }
        composable(route = AppScreens.secondtScreen.route){
           secondScreen(navController)
        }
        composable(route = AppScreens.thirdScreen.route){
           thirdScreen(navController)
        }

    }
}