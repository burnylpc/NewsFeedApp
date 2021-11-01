package com.example.myapplication.features.bookmarks_screen.data

import com.example.myapplication.features.bookmarks_screen.data.local.BookmarkDAO
import com.example.myapplication.features.main_screen.domain.model.ArticleDomainModel

class BookmarksRepoImpl(private val bookmarkDAO: BookmarkDAO): BookmarksRepo {
    override suspend fun create(articleDomainModel: ArticleDomainModel) {
        bookmarkDAO.create(articleDomainModel.toEntityModel())
    }

    override suspend fun read(): List<ArticleDomainModel> {
        return bookmarkDAO.read().map { it.toDomainModel() }
    }

    override suspend fun update(articleDomainModel: ArticleDomainModel) {
        bookmarkDAO.update(articleDomainModel.toEntityModel())
    }

    override suspend fun delete(articleDomainModel: ArticleDomainModel) {
        bookmarkDAO.delete(articleDomainModel.toEntityModel())
    }
}