package com.example.memeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitObject {

    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://meme-api.com/").addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    //now lets see that how we will connect retrofit to api interface

    val apiInterface by lazy {
        retrofit.create(ApiInterface::class.java)
    }

}