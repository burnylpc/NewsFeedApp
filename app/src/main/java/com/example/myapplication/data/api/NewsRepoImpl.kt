package com.example.myapplication.data.api

import com.example.myapplication.data.toDomain
import com.example.myapplication.domain.model.NewsDomainModel

class NewsRepoImpl(private val newsRemoteSource: NewsRemoteSource): NewsRepo{
    override fun getNews(): List<NewsDomainModel> {
        return newsRemoteSource.getNews().listArticleModel.map { it.toDomain() }
    }
}