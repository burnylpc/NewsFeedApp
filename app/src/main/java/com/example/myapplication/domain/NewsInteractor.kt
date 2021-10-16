package com.example.myapplication.domain

import com.example.myapplication.data.api.NewsRepo
import com.example.myapplication.domain.model.NewsDomainModel

class NewsInteractor(private val newsRepo: NewsRepo) {

    fun getNews() : List<NewsDomainModel> {
        return newsRepo.getNews()
    }

}