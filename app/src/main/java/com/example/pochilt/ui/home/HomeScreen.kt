package com.example.pochilt.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.pochilt.ui.home.composables.MoviesList

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column {
            Text(
                text = "Vinicius Android Developer At Jera",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary
            )
            MoviesList(movies = listOf("Devs", "Compose"))
        }
    }
}