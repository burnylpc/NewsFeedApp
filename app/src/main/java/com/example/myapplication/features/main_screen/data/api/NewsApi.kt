package com.example.newsfeed.features.main_screen.data.api

import com.example.myapplication.features.main_screen.data.api.model.TopNewsModel
import retrofit2.http.GET
import retrofit2.http.Query

//https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY
interface NewsApi {
    @GET("v2/top-headlines")
    suspend  fun getTopHeadlines(
        @Query("country") country: String = "ru",
        @Query("apiKey")  apiKey: String = "daa5bbe8c37b4154884e261dfa6cb771"
    ) : TopNewsModel

}

//interface NewsApi {
//
//    //const val BASE_URL = "https://newsapi.org/v2/everything?q=tesla&from=2021-09-16&sortBy=publishedA"
//    //GET https://newsapi.org/v2/everything?q=keyword&apiKey=2a573f6914a5489b9d902b4bfb752615
//
//    @GET("everything")
//    @Headers("X-Api-Key: 2a573f6914a5489b9d902b4bfb752615")
//    fun getNews(
//        @Query("q") word: String = "",
//        @Query("language") language: String = "ru",
//        @Query("country") country: String = "ru"
//    ) : ApiResponseObject
//
//}