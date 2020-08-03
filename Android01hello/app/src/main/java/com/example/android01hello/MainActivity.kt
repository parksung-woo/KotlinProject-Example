package com.example.android01hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // 눈으로 볼 수 있는 화면을 출력
                                               // 자바에서 xml 접근은 .으로 접근
    }
}