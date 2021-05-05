package com.example.pochilt.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pochilt.ui.home.composables.MoviesList

@Composable
fun HomeScreen() {
    val viewModel: HomeViewModel = viewModel()

    Column {
        MoviesListCategory(
            "Discover",
            viewModel.movies.value
        )
        MoviesListCategory("Popular", listOf("Avatar", "O exterminador do futuro"))
    }
}

@Composable
fun MoviesListCategory(title: String, movieList: List<String>) {
    Column {
        Text(
            text = title,
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.primary
        )
        MoviesList(movies = movieList)
    }
}

//@Composable
//@Preview
//fun HomeScreenPreview() {
//    HomeScreen()
//}