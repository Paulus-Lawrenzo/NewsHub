package com.example.newshub.di.remote

import com.example.newshub.data.dto.CategoryResponse
import com.example.newshub.data.source.NewsApi
import retrofit2.Response
import javax.inject.Inject

class CategoryRemoteDataSourceImpl @Inject constructor(
    private val api: NewsApi
) : CategoryRemoteDataSource {
    override suspend fun getCategory(): Response<List<CategoryResponse>> {
        return api.getCategory()
    }
}