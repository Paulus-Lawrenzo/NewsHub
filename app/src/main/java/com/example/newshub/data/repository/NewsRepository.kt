package com.example.newshub.data.repository

import com.example.newshub.data.source.NewsApi
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsApi: NewsApi) {

}