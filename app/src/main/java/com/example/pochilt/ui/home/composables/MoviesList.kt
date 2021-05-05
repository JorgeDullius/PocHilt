package com.example.pochilt.ui.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pochilt.R

@Composable
fun MoviesList(movies: List<String>) {
    LazyRow {
        items(movies) { item ->
            Card()
        }
    }
}

@Composable
fun Card(
) {
    Image(
        modifier = Modifier
            .height(190.dp)
            .padding(end = 6.dp),
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Composable
@Preview
fun MoviesListPreview() {
    MoviesList(movies = listOf("Devs", "Compose"))
}