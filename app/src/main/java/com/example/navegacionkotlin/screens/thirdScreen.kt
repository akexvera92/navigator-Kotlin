package com.example.navegacionkotlin.screens
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.navegacionkotlin.navigation.AppScreens


@Composable

fun thirdScreen(navController: NavController){
    Scaffold {
        thirdBodyContent(navController)
    }
}
@Composable
fun thirdBodyContent(navController: NavController){
    Column(
        modifier= Modifier.fillMaxSize(),
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(text="tercera pantalla")
        Button(onClick = {  navController.navigate(AppScreens.secondtScreen.route)}) {
            Text(text="Regresar a la segunda")
        }
        Button(onClick = {  navController.navigate(AppScreens.firstScreen.route)}) {
            Text(text="Regresar a la primera")
        }
    }
}