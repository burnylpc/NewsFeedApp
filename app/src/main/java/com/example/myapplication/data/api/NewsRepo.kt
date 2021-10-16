package com.example.myapplication.data.api

import com.example.myapplication.domain.model.NewsDomainModel

interface NewsRepo {
    fun getNews(): List<NewsDomainModel>
}