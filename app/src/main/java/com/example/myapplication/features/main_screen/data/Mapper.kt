package com.example.newsfeed.features.main_screen.data

import com.example.myapplication.features.main_screen.domain.model.ArticleDomainModel
import com.example.newsfeed.features.main_screen.data.api.model.ArticleModel

fun ArticleModel.toDomain() = ArticleDomainModel(
    author = this.author ?: "null",
    title = this.title ?: "null",
    description = this.description ?: "null",
    url = this.url,
    publishedAt = this.publishedAt ?: "null",

    )
//fun SourceModel.toDomain(): NewsDomainSourceModel{
//    return NewsDomainSourceModel(
//        id = id,
//        name = name
//    )
//}
//
//fun ArticleModel.toDomain(): NewsDomainModel{
//    return NewsDomainModel(
//        author = author,
//        source = source.toDomain(),
//        title = title,
//        url = url,
//        description = description,
//        urlToImage = urlToImage,
//        content = content,
//        publishedAt = publishedAt
//    )
//}