package com.example.newshub.data.usecase

import com.example.newshub.data.dto.CategoryResponse
import com.example.newshub.data.model.CategoryModel
import com.example.newshub.data.repository.CategoryRepository
import javax.inject.Inject

class CategoryUseCase @Inject constructor(
    private val repository: CategoryRepository
) {
    suspend fun getCategory(): List<CategoryModel>? {
        repository.getCategory().apply {
            if (isSuccessful) {
                return body()?.let { mappingRemoteToModel (it) }
            }
            return listOf()
        }
    }

    suspend fun mappingRemoteToModel(response: List<CategoryResponse>):List<CategoryModel> {
        return response.map { categoryResponse ->
            categoryResponse.let {
                CategoryModel(
                    id = it.id,
                    name = it.name,
                    description = it.description,
                    url = it.url,
                    category = it.category,
                    language = it.language,
                    country = it.country
                )
            }
        }
    }
}