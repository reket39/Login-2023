package com.herokuapp.reketshop.loginexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.herokuapp.reketshop.loginexample.ui.theme.LoginExampleTheme
import com.herokuapp.reketshop.loginexample.userList.UserListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginExampleTheme {
                val navController = rememberNavController()
                NavHost(navController = navController , startDestination = "user_list_screen") {
                    composable("user_list_screen") {
                        UserListScreen(navController = navController)

                    }
                }

            }
        }
    }
}

