package com.example.parentsimulator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.parentsimulator.screens.GenerateChildScreen
import com.example.parentsimulator.screens.ChildBornScreen
import com.example.parentsimulator.screens.ParentingScenarioScreen
import com.example.parentsimulator.screens.GameOverScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "generateChild") {
        composable("generateChild") { GenerateChildScreen(navController) }
        composable("childBorn")     { ChildBornScreen(navController) }
        composable("parentingScenario") { ParentingScenarioScreen(navController) }
        composable("gameOver")      { GameOverScreen(navController) }
    }
}
