package com.example.newsfeed.features.main_screen.data.api

import com.example.myapplication.features.main_screen.domain.model.ArticleDomainModel
import com.example.newsfeed.features.main_screen.data.toDomain

class NewsRepoImpl (private val source: NewsRemoteSource): NewsRepo {
    override suspend fun getNews(): List<ArticleDomainModel> {
        return source.getNews().articles!!.map {
            it.toDomain()
        }
    }
}