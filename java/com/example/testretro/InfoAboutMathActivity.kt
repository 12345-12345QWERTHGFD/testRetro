package com.example.testretro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testretro.Api.ApiFactory
import com.example.testretro.Api.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers

class InfoAboutMathActivity : AppCompatActivity() {
    private val apiService: ApiService by lazy { ApiFactory.get()?.getApiService() as ApiService }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_about_math)

        apiService.getMath(intent.getIntExtra("id", 0))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({

            },{

            })
    }
}