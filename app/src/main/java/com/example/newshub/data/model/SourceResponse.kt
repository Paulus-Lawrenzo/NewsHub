package com.example.newshub.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SourceResponse(
    val status : String,
    val sources : List<Source>
): Parcelable
