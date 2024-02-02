package com.example.newshub.data.repository

import com.example.newshub.data.dto.CategoryResponse
import com.example.newshub.di.remote.CategoryRemoteDataSource
import retrofit2.Response
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(
    private val remoteDataSource: CategoryRemoteDataSource
) : CategoryRepository {
    override suspend fun getCategory(): Response<List<CategoryResponse>> {
        return remoteDataSource.getCategory()
    }
}