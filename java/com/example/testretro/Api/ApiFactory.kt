package com.example.testretro.Api

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Url

class ApiFactory// converter
// observe
private constructor() {

    init {
        RETROFIT = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create()) // converter
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) // observe
            .baseUrl(BASE_URL)
            .build()
    }
    companion object {
        private var INSTANCE: ApiFactory? = null

        private var RETROFIT: Retrofit? = null
        private var BASE_URL: String = "https://api.opendota.com/api/matches/"

        fun get(): ApiFactory? {
            synchronized(this) {
                if (INSTANCE == null)
                    INSTANCE = ApiFactory()
            }
            return INSTANCE
        }
    }

    fun getApiService(): ApiService? {
        return RETROFIT?.create(ApiService::class.java)
    }
}