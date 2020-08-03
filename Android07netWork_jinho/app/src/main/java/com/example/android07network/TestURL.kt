package com.example.android07network

import android.util.Log
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(){
    val url = URL("http://localhost:8088/test/index.jsp")
    //생략가능한 부분
    val conn = url.openConnection() as HttpURLConnection
    println("conn.responseCode:${conn.responseCode}")
    println("conn.contentType:${conn.contentType}")
    println("conn.content:${conn.content}")
    println("conn.responseMessage:${conn.responseMessage}")
    println("conn.inputStream:${conn.inputStream}")
    println()
    //200 정상응답
    //400 경로나 파일에 대한 Not Found
    //500 server code error
    if(conn.responseCode==200){
        println("=== url.readText() ===")
        println(url.readText())
    }

    println()

    if(conn.responseCode==200){
        //3종 세트
        val inputStream:InputStream = conn.inputStream
        val inputStreamReader = InputStreamReader(inputStream)
        val br = BufferedReader(inputStreamReader)
        //println("bufferedReader.readLine:${br.readLine()}")

        var temp:String? = ""
        var txt:String? = ""
        while (true){
            temp = br.readLine()
            println(temp)
            if(temp == null) break
            txt += temp
        }
        println("==========")
        println(txt)
        //txt를 가지고 분석(파싱)하면된다.
    }



}