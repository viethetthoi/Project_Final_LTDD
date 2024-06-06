package com.example.newapp_project.api

import com.example.newapp_project.models.NewResponse
import com.example.newapp_project.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.nio.channels.spi.AbstractSelectionKey
import java.util.Locale.IsoCountryCode

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getHeadlines(
        @Query("country")
        countryCode: String = "us",

        @Query("page")
        pageNumber: Int = 1,

        @Query("apiKey")
        apiKey: String = API_KEY,
    ): Response<NewResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,

        @Query("page")
        pageNumber: Int =1,

        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewResponse>
}