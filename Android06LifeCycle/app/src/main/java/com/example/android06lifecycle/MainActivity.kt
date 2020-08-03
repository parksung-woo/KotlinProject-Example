package com.example.android06lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("testLog","onCreate()...")

        tv_title.text = "time:${System.currentTimeMillis()}"
    }

    override fun onStart(){
        super.onStart()
        Log.i("testLog","onStart()...")
        tv_title.text = "time:${System.currentTimeMillis()}"
    }

    override fun onResume() {
        super.onResume()
        Log.i("testLog","onResume()...")
        tv_title.text = "time:${System.currentTimeMillis()}" //홈버튼을 눌렀다 켜도 새로 시간을 변경
    }

    override fun onPause() {
        super.onPause()
        Log.i("testLog","onPause()...")
    }

    override fun onStop() {
        super.onStop()
        Log.i("testLog","onStop()...")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("testLog","onRestart()...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("testLog","onDestroy()...")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("testLog","onSaveInstanceState()...")
        outState.putString("userName","kim")   //key와함께 kim을 저장
        outState.putInt("userAge",33)
    }

    //화면돌아갈때
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("testLog","onRestoreInstanceState()...")
        Log.i("testLog","${savedInstanceState.getString("userName")}") //key와 맞으면 저장된 데이터를 출력
        Log.i("testLog","${savedInstanceState.getInt("userAge")}")

    }
}