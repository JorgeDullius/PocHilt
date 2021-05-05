package com.example.pochilt.home.ui.homescreen.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MoviesList(movies: List<String>) {
    LazyColumn {
        items(movies) { movie ->
            Text(text = movie, color = Color.White)
        }
    }
}