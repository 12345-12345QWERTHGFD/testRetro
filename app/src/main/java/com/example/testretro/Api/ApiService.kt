package com.example.testretro.Api

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

interface ApiService {
    @GET("{id}")
    fun getMath(@Path("id") mathId: Int): Observable<Math>
}