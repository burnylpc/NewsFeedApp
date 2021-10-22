package com.example.newsfeed.features.main_screen.domain

import com.example.myapplication.base.attempt
import com.example.newsfeed.features.main_screen.data.api.NewsRepo

class NewsInteractor(private val repository: NewsRepo) {
    suspend fun getNews() = attempt {
        repository.getNews()
    }

}