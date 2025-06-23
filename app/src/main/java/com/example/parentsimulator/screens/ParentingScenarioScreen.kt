package com.example.parentsimulator.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ParentingScenarioScreen(navController: NavController) {
    Scaffold { inner ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(inner)
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                "家长模拟器",
                fontSize = 28.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF2196F3))
                    .padding(12.dp)
            )

            Spacer(Modifier.height(24.dp))

            // Scenario description
            Text(
                "事件：",
                fontSize = 20.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                modifier = Modifier.fillMaxWidth()
            )
            
            Spacer(Modifier.height(8.dp))
            
            Text(
                "你的孩子今年九岁，围棋业余六段选手，被誉为围棋天才。在一次比赛中，他输掉了比赛，你会选择：",
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(Modifier.height(24.dp))

            // Multiple choice options
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Button(
                    onClick = { navController.navigate("gameOver") },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "A 安抚孩子情绪，带孩子吃饭庆祝比赛结束。",
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                Button(
                    onClick = { navController.navigate("gameOver") },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "B 激励孩子上进，当场飞踹。",
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                Button(
                    onClick = { navController.navigate("gameOver") },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "C 照顾孩子自尊，回家再好好打。",
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                Button(
                    onClick = { navController.navigate("gameOver") },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "D 避免旧伤复发，选择冷暴力或阴阳怪气来激励孩子。",
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
} 