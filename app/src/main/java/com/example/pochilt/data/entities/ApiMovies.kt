package com.example.pochilt.data.entities


import com.google.gson.annotations.SerializedName

data class ApiMovies(
    @SerializedName("results")
    val movies: List<ApiMovie>?
)