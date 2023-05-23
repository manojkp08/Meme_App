package com.example.memeapp

import retrofit2.http.GET

interface ApiInterface {

    @GET("gimme")
    fun getData(): retrofit2.Call<ResponseDataClass>

}