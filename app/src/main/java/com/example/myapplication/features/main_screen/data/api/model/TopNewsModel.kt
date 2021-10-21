package com.example.myapplication.features.main_screen.data.api.model

import com.example.newsfeed.features.main_screen.data.api.model.ArticleModel
import com.google.gson.annotations.SerializedName

data class TopNewsModel (

    @SerializedName("status")
    val status: String?,

    @SerializedName("totalResults")
    val totalResults: Int?,

    @SerializedName("articles")
    val articles: List<ArticleModel>?,
)
