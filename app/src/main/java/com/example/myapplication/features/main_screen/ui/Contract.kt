package com.example.newsfeed.features.main_screen.ui

import com.example.myapplication.base.Event
import com.example.myapplication.features.main_screen.domain.model.ArticleDomainModel

data class ViewState(
    val articleList: List<ArticleDomainModel>,
    val errorMessage: String?,
    val isLoading : Boolean
)

sealed class UIEvent(): Event {
    class OnArticleClick : UIEvent()
}

sealed class DataEvent(): Event {
    object OnLoadData: DataEvent()
    data class SuccessNewsRequest(val articleList: List<ArticleDomainModel>): DataEvent()
}

