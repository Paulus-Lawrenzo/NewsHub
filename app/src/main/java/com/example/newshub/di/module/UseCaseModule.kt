package com.example.newshub.di.module

import com.example.newshub.data.repository.CategoryRepository
import com.example.newshub.data.repository.NewsRepository
import com.example.newshub.data.usecase.CategoryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideGetCategoryUseCase(repository: CategoryRepository) =
        CategoryUseCase(repository)
}