package com.example.pochilt.di

import com.example.pochilt.BuildConfig
import com.example.pochilt.data.ApiService
import com.example.pochilt.ui.PocHiltApplication
import com.example.pochilt.utils.API_ENDPOINT
import com.example.pochilt.utils.API_ENDPOINT_NAMED
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named

@Module
@InstallIn(PocHiltApplication::class)
object ApiProviderModule {

    @Provides
    fun provideApiService(
        @Named("retrofit") retrofit: Retrofit
    ): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun provideAuthInterceptorOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        gson: Gson,
        @Named(API_ENDPOINT_NAMED) apiEndPoint: String
    ): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(apiEndPoint)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    @Provides
    @Named(API_ENDPOINT_NAMED)
    fun provideApiEndpoint(): String {
        return API_ENDPOINT
    }
}