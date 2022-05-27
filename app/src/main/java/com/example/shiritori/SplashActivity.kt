package com.example.shiritori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000  //3 sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({  //3초(SPLASH_TIME_OUT)가 지나면 이 메서드가 실행됨

            //main activity 시작
            startActivity(Intent(this, MainActivity::class.java))

            //액티비티 닫기
            finish()
        }, SPLASH_TIME_OUT)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}