package com.example.pochilt.data.repository

import com.example.pochilt.data.ApiService
import com.example.pochilt.domain.boundaries.MovieRepository
import com.example.pochilt.domain.entities.Movie
import javax.inject.Inject

class DefaultMovieRepository @Inject constructor(
    private val movieService: ApiService
) : MovieRepository {
    override suspend fun getPopularMovies(): List<Movie>? {
        return movieService.getPopularMovies()
            .takeIf { it.isSuccessful }
            ?.body()
            ?.movies
            ?.map { it.toDomainObject() }
    }
}