package com.example.pochilt.ui.home.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun MoviesList(movies: List<String>){
    LazyColumn {
        items(movies){ item ->
            Text(text = item, style = MaterialTheme.typography.body1, color = MaterialTheme.colors.onPrimary)
        }
    }
}