package com.example.myapplication.data.api.model

import com.google.gson.annotations.SerializedName

data class ApiResponseObject(@SerializedName("source") val listArticleModel : List<ApiArticleModel>)