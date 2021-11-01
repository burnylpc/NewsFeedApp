package com.example.myapplication.features.bookmarks_screen.data

import com.example.myapplication.features.bookmarks_screen.data.local.BookmarksEntity
import com.example.myapplication.features.main_screen.domain.model.ArticleDomainModel

fun ArticleDomainModel.toEntityModel() = BookmarksEntity(
    url = url,
    author = author,
    title = title,
    description = description,
    publishedAt = publishedAt
)

fun BookmarksEntity.toDomainModel() = ArticleDomainModel(
    url = url,
    author = author,
    title = title,
    description = description,
    publishedAt = publishedAt
)