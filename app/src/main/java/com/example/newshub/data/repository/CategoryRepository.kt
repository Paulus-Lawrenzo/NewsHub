package com.example.newshub.data.repository

import com.example.newshub.data.dto.CategoryResponse
import retrofit2.Response

interface CategoryRepository {
    suspend fun getCategory(): Response<List<CategoryResponse>>
}