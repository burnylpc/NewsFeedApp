package com.example.myapplication.features.bookmarks_screen.di

import com.example.myapplication.features.bookmarks_screen.data.BookmarksRepo
import com.example.myapplication.features.bookmarks_screen.data.BookmarksRepoImpl
import com.example.myapplication.features.bookmarks_screen.data.local.BookmarkDAO
import com.example.myapplication.features.bookmarks_screen.domain.BookmarkInteractor
import com.example.myapplication.features.bookmarks_screen.ui.BookmarksViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val bookmarksModule = module {
    single<BookmarksRepo> {
        BookmarksRepoImpl(get<BookmarkDAO>())
    }

    single<BookmarkInteractor> {
        BookmarkInteractor(get<BookmarksRepo>())
    }

    viewModel<BookmarksViewModel> {
        BookmarksViewModel(get<BookmarkInteractor>())
    }
}