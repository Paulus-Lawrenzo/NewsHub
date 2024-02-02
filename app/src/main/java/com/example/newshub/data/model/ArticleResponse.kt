package com.example.newshub.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArticleResponse(
    val status: String,
    val totalResult: Int,
    val articles: List<Article>
): Parcelable
