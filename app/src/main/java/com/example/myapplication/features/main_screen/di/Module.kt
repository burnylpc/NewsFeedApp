package com.example.myapplication.features.main_screen.di

import com.example.myapplication.data.api.NewsApi
import com.example.myapplication.data.api.NewsRemoteSource
import com.example.myapplication.data.api.NewsRepo
import com.example.myapplication.data.api.NewsRepoImpl
import com.example.myapplication.domain.NewsInteractor
import com.example.myapplication.features.main_screen.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val mainScreenModule = module {

    viewModel {
        MainScreenViewModel()
    }

    single { NewsInteractor(get()) }

    single<NewsRepo> { NewsRepoImpl(get()) }

    single { NewsRemoteSource(get()) }

    single { get<Retrofit>().create(NewsApi::class.java) }

}