package com.herokuapp.reketshop.loginexample.userList

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun UserListScreen(
    navController: NavController
){
    
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(12.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "PAGINA DE INICIO")
        }
    }
    
}