package com.example.myapplication.features.bookmarks_screen.data

import com.example.myapplication.features.main_screen.domain.model.ArticleDomainModel

interface BookmarksRepo {
    suspend fun create(articleDomainModel: ArticleDomainModel)
    suspend fun read() : List<ArticleDomainModel>
    suspend fun update(articleDomainModel: ArticleDomainModel)
    suspend fun delete(articleDomainModel: ArticleDomainModel)
}