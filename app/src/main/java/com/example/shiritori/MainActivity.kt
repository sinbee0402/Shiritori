package com.example.shiritori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Main_Logo = findViewById<ImageView>(R.id.main_circle_logo)
        val ROTATION_ANIM = AnimationUtils.loadAnimation(this, R.anim.animation)

        Main_Logo.startAnimation(ROTATION_ANIM)

        //게임시작 버튼 btn_play 액티비티 이동하기
        btn_play.setOnClickListener {
            val intent = Intent(this, MessageActivity::class.java)
            startActivity(intent)
        }

        //게임설명 버튼 btn_explain 액티비티 이동하기
        btn_explain.setOnClickListener {
            val intent = Intent(this, ExplainActivity::class.java)
            startActivity(intent)
        }

        //게임전적 btn_record 액티비티 이동하기
        btn_record.setOnClickListener {

        }
    }
}