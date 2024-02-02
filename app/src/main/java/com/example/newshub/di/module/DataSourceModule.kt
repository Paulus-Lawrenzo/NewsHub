package com.example.newshub.di.module

import com.example.newshub.data.source.NewsApi
import com.example.newshub.di.remote.CategoryRemoteDataSource
import com.example.newshub.di.remote.CategoryRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun provideCategoryRemoteDataSource(newsApi: NewsApi):
            CategoryRemoteDataSource = CategoryRemoteDataSourceImpl(newsApi)
}