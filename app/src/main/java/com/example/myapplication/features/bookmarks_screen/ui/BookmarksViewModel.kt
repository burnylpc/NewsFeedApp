package com.example.myapplication.features.bookmarks_screen.ui

import com.example.myapplication.base.Event
import com.example.myapplication.features.bookmarks_screen.domain.BookmarkInteractor
import com.example.newsfeed.base.BaseViewModel

class BookmarksViewModel(private val bookmarkInteractor: BookmarkInteractor) :
    BaseViewModel<ViewState>() {

    init {
        processDataEvent(DataEvent.RefreshDataBase)
    }

    override fun initialViewState(): ViewState = ViewState(emptyList())

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when(event) {
            is DataEvent.RefreshDataBase -> {
                val newArticleList = bookmarkInteractor.read()
                return previousState.copy(articleList = newArticleList)
            }
            else -> return null
        }
    }

}