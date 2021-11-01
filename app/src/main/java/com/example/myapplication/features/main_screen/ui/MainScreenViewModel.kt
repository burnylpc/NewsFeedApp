package com.example.newsfeed.features.main_screen.ui


import com.example.myapplication.base.Event
import com.example.myapplication.features.bookmarks_screen.domain.BookmarkInteractor
import com.example.newsfeed.base.BaseViewModel
import com.example.newsfeed.features.main_screen.domain.NewsInteractor

class MainScreenViewModel(
    private val newsInteractor: NewsInteractor,
    private val bookmarkInteractor: BookmarkInteractor
) : BaseViewModel<ViewState>() {
    init {
        processDataEvent(DataEvent.OnLoadData)
    }

    override fun initialViewState(): ViewState {
        return ViewState(emptyList(), null, true)
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
//            is UIEvent.OnArticleClick -> {
//                bookmarkInteractor.create(event.articleDomainModel)
//            }
            is DataEvent.OnLoadData -> {
                newsInteractor.getNews().fold(
                    onSuccess = { processDataEvent(DataEvent.SuccessNewsRequest(it)) },
                    onError = {
                        processDataEvent(
                            DataEvent.ErrorNewsRequest(
                                it.localizedMessage ?: ""
                            )
                        )
                    }
                )
            }
            is DataEvent.SuccessNewsRequest -> {
                return previousState.copy(articleList = event.articleList, isLoading = false)
            }
            is DataEvent.ErrorNewsRequest -> {
            }
        }
        return null
    }
}

//https://github.com/kadehar/innopolis-newsfeed/tree/news-ui
//конс от 21.10.2021