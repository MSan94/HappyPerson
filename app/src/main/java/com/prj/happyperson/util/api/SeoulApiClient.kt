package com.prj.happyperson.util.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SeoulApiClient {

    companion object {
        private val BASE_URL = "http://openapi.seoul.go.kr:8088"

        fun getApi() : SeoulApi = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(OkHttpClient())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SeoulApi::class.java)
    }
}