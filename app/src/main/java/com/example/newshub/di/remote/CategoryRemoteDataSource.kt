package com.example.newshub.di.remote

import com.example.newshub.data.dto.CategoryResponse
import retrofit2.Response

interface CategoryRemoteDataSource {
    suspend fun getCategory(): Response<List<CategoryResponse>>
}