package com.example.mad_23012011110_practical5.screen.components

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mad_23012011110_practical5.R
import com.example.mad_23012011110_practical5.ui.theme.Mad_23012011110_practical5Theme
@Composable
fun RegisterationScreen(context: Context, navController: NavController){
    Scaffold (modifier = Modifier.fillMaxSize() ){
            innerpadding->
        Box(modifier = Modifier.fillMaxSize().padding(innerpadding)) {
            RegisterUI(navController = navController)
        }
    }
}

@Composable
fun RegisterUI(navController: NavController? =null){
    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    Column (modifier = Modifier.fillMaxSize().padding(10.dp)){
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(R.drawable.guni_logo),
            contentDescription = "App logo",
            modifier = Modifier.height(120.dp).width(370.dp).align(Alignment.CenterHorizontally)
        )
        Card (
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            shape = MaterialTheme.shapes.medium,
            colors = CardDefaults.cardColors(containerColor = Color(0xFFC5CAE9)),
            elevation = CardDefaults.cardElevation(8.dp)
        ){

            Column (
                modifier = Modifier.fillMaxWidth().padding(10.dp),
            )
            {
                formField(label = "Name", textState = name, onTextChange = { name = it })
                formField(label = "Phone Number", textState = phone, onTextChange = { phone = it })
                formField(label = "City", textState = city, onTextChange = { city = it })
                formField(label = "Email", textState = email, onTextChange = { email = it })
                formField(label = "Password", textState = password, onTextChange = { password = it }, isPasswordField = true)
                formField(label = "Confirm Password", textState = confirmPassword, onTextChange = { confirmPassword = it }, isPasswordField = true)

                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /* TODO: Handle login action */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0091EA))
                ) {
                    Text(
                        text = "Register",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Don't have an account?",
                color = Color.Gray,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.width(4.dp))
            TextButton(onClick = {
                if (navController != null)
                    navController.navigate("login"){
                        popUpTo("register")
                    }
            }) {
                Text(
                    text = "LOGIN",
                    color = Color(0xFFE91E63),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun RegisterUIPreview() {
    Mad_23012011110_practical5Theme {
        RegisterUI()
    }
}
