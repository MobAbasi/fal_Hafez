package com.example.mobinaabasi.ApiFaal

import com.example.mobinaabasi.ApiBio.MyData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("faal")

    fun getData(): Call<List<MyData>>

}