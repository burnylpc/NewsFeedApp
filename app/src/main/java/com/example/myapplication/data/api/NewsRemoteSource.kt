package com.example.myapplication.data.api

import com.example.myapplication.data.api.model.ApiResponseObject

class NewsRemoteSource(private val newsApi: NewsApi) {

    fun getNews(): ApiResponseObject{
        return newsApi.getNews()
    }
}