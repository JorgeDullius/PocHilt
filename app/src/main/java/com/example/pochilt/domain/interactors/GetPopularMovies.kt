package com.example.pochilt.domain.interactors

import com.example.pochilt.domain.boundaries.MovieRepository
import javax.inject.Inject

class GetPopularMovies @Inject constructor(
    private val movieRepository: MovieRepository
) {
    suspend fun execute()  = movieRepository.getPopularMovies()
}