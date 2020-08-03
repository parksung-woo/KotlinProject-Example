package com.example.android07network

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.test.test.R
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    val handler:Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread() {
            testURL()
        }.start()
    }
    fun testURL(){
        //테스트 하려는 디바이스에서 브라우져를 열고
        //http://192.168.0.9/kotlinProject 주소 접속유무를 확인
        //안될시 와이파이 설정할것
        //http://192.168.0.9/kotlinProject/test.json
        val url = URL("http://localhost/connect.php")
        val conn = url.openConnection() as HttpURLConnection
        Log.i("testLog","conn.responseCode:${conn.responseCode}")

        if(conn.responseCode==200){
            println("=== url.readText() ===")
            val txt = url.readText()
            println(txt)

            //XML - DOM-문서전체읽은후
            //      SAX-문서를 읽으면서
            //      pull-편리 상수화

            //분석:데이터 파싱
            //JSON [,,]:Array, {"K":"V", , ,}:Object
            var title = ""
            val arr = JSONArray(txt)
            for(i in 0 until arr.length()){
                val obj:JSONObject = arr.get(i) as JSONObject
                Log.i("testLog","${obj["member_id"]}, ${obj["member_name"]}, ${obj["member_password"]},${obj["member_email"]},${obj["member_phone"]} ")
                title += "${obj["member_id"]}, ${obj["member_name"]}, ${obj["member_password"]},${obj["member_email"]},${obj["member_phone"]} "
            }
            handler.post {
                //tv_title.text = txt //txt를 화면을 디스플레이시킴  확인용
                tv_title.text = title //txt가 아닌 title을 출력하고 싶기 때문
            }

        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}