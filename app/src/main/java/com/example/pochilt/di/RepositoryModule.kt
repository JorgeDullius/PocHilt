package com.example.pochilt.di

import com.example.pochilt.data.repository.DefaultMovieRepository
import com.example.pochilt.domain.boundaries.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun provideMovieRepository(defaultMovieRepository: DefaultMovieRepository): MovieRepository
}