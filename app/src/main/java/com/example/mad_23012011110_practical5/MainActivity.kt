package com.example.mad_23012011110_practical5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mad_23012011110_practical5.screen.components.LoginScreen
import com.example.mad_23012011110_practical5.screen.components.RegisterationScreen
import com.example.mad_23012011110_practical5.ui.theme.Mad_23012011110_practical5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mad_23012011110_practical5Theme {
                AppNavigation(context = this@MainActivity)
            }
        }
    }
}

