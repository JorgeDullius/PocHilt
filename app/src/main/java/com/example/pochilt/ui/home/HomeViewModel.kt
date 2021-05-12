package com.example.pochilt.ui.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pochilt.domain.interactors.GetPopularMovies
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getPopularMovies: GetPopularMovies
) : ViewModel() {
    val movies = mutableStateOf(listOf("1", "2", "3", "4"))

    init {
        viewModelScope.launch {
            getPopularMovies.execute()
                ?.map { it.title ?: "" }
                ?.let { movies.value = it }
        }
    }
}