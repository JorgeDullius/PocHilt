package com.example.pochilt.data

import com.example.pochilt.data.entities.ApiMovie
import com.example.pochilt.data.entities.ApiMovies
import retrofit2.http.GET

interface ApiService {

    @GET("/movie/popular?api_key=ef60f290754b298f307a2b64735fddfb&language=en-US&page=1")
    fun getPopularMovies(): ApiMovies
}