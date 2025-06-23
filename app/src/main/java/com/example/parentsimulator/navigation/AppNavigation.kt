package com.example.parentsimulator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.parentsimulator.screens.GenerateChildScreen
import com.example.parentsimulator.screens.ChildBornScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "generateChild") {
        composable("generateChild") { GenerateChildScreen(navController) }
        composable("childBorn")     { ChildBornScreen(navController) }
    }
}
