package com.example.newshub.data.source

import com.example.newshub.data.dto.CategoryResponse
import com.example.newshub.data.model.ArticleResponse
import com.example.newshub.data.model.SourceResponse
import com.example.newshub.util.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("top-headlines/sources")
    suspend fun getCategory(
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<List<CategoryResponse>>

    @GET("top-headlines/sources")
    suspend fun getSourcesByCategory(
        @Query("category") category: String,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<SourceResponse>

    @GET("top-headlines")
    suspend fun getArticlesBySource(
        @Query("sources") source: String,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<ArticleResponse>
}