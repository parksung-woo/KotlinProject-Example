package com.example.android07network

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.net.URL
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection


class MainActivity : AppCompatActivity() {
    val handler:Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //URL : Network에서 사용하는 변수
        //Thread 처리
        //Nox를 사용하는 경우 설정에서 네트워크 연결을 해야한다.
        
        Thread(){
            testURL()
        }.start()
        //다른 디바이스에서 네트워크 연결이 되지 않을 경우
        //공유폴더 확인
    }

    //Thread 처리함수
    fun testURL(){
        // 요청할 URL = http://192.168.0.9/kotlinProject/test.json
        val url = URL("http://192.168.0.9/kotlinProject/test.json")
        val conn = url.openConnection() as HttpURLConnection
        Log.i("testLog","conn.responseCode():${conn.responseCode}")

        if (conn.responseCode == 200) {
            println("=======url.readText()========")
            val txt = url.readText()
            println(txt)

            var title = ""
            // 분석 : 데이터파싱(Parsing)
            val arr = JSONArray(txt)
            for(i in 0 until arr.length()){
                val obj: JSONObject = arr.get(i) as JSONObject
                Log.i("testLog","${obj["name"]},${obj["age"]}")
                title += "${obj["name"]},${obj["age"]}"
            }
            // Thread가 전부 끝난 후에 실행하게 핸들링
            handler.post {
                //tv_title.text = txt //txt를 화면을 디스플레이시킴  확인용
                tv_title.text = title //txt가 아닌 title을 출력하고 싶기 때문
            }

        }
    }

    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        //multi permission Logic
    }


}