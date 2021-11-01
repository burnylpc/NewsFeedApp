package com.example.myapplication.features.bookmarks_screen.ui

import com.example.myapplication.base.Event
import com.example.myapplication.features.main_screen.domain.model.ArticleDomainModel

data class ViewState(
    val articleList: List<ArticleDomainModel>
)

sealed class DataEvent: Event {
    object RefreshDataBase: DataEvent()
}