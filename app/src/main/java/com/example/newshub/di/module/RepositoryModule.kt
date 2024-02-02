package com.example.newshub.di.module

import com.example.newshub.data.repository.CategoryRepository
import com.example.newshub.data.repository.CategoryRepositoryImpl
import com.example.newshub.di.remote.CategoryRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideCategoryRepository(datasource: CategoryRemoteDataSource):
            CategoryRepository = CategoryRepositoryImpl(datasource)
}