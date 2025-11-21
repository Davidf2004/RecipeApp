package com.pjasoft.recipeapp

import LoginScreen
import LoginScreenRoute
import MainScreen
import MainScreenGraph
import MainScreenRoute
import RecipeTheme
import RegisterScreenRoute
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.pjasoft.recipeapp.presentacion.ui.screens.Auth.RegisterScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

// Patron Observable
@Composable
@Preview
fun App() {
    RecipeTheme {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = MainScreenGraph
        ){
            composable<RegisterScreenRoute> {
                RegisterScreen(
                    navController = navController
                )
            }


            composable<LoginScreenRoute> {
                LoginScreen(
                    navController = navController
                )
            }

            navigation<MainScreenGraph>(
                startDestination = MainScreenRoute
            ){
               composable<MainScreenRoute> {
                   MainScreen()
               }
            }
        }
    }
}