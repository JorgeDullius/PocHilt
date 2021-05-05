package com.example.pochilt.home.ui.homescreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun MoviesList(movies: List<String>) {
    LazyColumn {
        items(movies) { movie ->
            Text(text = movie)
        }
    }
}