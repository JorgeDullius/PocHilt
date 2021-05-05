package com.example.pochilt.domain.boundaries

import com.example.pochilt.data.entities.ApiMovies
import com.example.pochilt.domain.entities.Movie

interface MovieRepository {
    suspend fun getPopularMovies(): List<Movie>?
}