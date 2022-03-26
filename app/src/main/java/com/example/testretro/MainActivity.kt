package com.example.testretro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.testretro.Api.ApiFactory
import com.example.testretro.Api.ApiService
import io.reactivex.schedulers.Schedulers.io
import rx.Scheduler
import rx.schedulers.Schedulers.io
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private val apiFactory: ApiService by lazy { ApiFactory.get()?.getApiService() as ApiService }

    //view
    private val plainTextMathId: EditText by lazy { findViewById(R.id.editTextMathId) }
    private val buttonStartActivity: Button by lazy { findViewById(R.id.buttonStartActivity) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStartActivity.setOnClickListener {
            try {
                val putValue: Int = plainTextMathId.text.toString().trim().toInt()

                val intent: Intent = Intent(applicationContext, InfoAboutMathActivity::class.java)
                intent.putExtra("id", putValue)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "incorrect math id", Toast.LENGTH_LONG).show()
            }
        }


    }
}