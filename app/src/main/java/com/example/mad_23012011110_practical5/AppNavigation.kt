package com.example.mad_23012011110_practical5

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mad_23012011110_practical5.screen.components.LoginScreen
import com.example.mad_23012011110_practical5.screen.components.LoginUI
import com.example.mad_23012011110_practical5.screen.components.RegisterUI
import com.example.mad_23012011110_practical5.screen.components.RegisterationScreen

@Composable
fun AppNavigation(context: Context){
    val navcontroller = rememberNavController()
    NavHost(navController = navcontroller,
        startDestination = "login"){
        composable("login") {
            LoginScreen(context,navcontroller)
        }
       composable("register") {
           RegisterationScreen(context, navcontroller)
       }
    }
}