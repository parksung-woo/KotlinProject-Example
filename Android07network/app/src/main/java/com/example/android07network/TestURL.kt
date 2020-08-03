package com.example.android07network
import java.net.URL
import android.util.Log
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection

fun main() {
    // 요청할 URL = http://192.168.0.9/kotlinProject/test.json
    val url = URL("http://192.168.0.9/kotlinProject/test.json")
    val conn = url.openConnection() as HttpURLConnection

    println("conn.responseCode():${conn.responseCode}")
    println("conn.contentType():${conn.contentType}")
    println("conn.content():${conn.content}")
    println("conn.responseMessage():${conn.responseMessage}")
    println("conn.inputStream():${conn.inputStream}")
    // 200 정상응답, responseMessage이 ok일 경우 정상접근
    // 400 경로나 파일에 대한 Not Found
    // 500 Server code error

    if (conn.responseCode == 200) {
        println("=======url.readText()========")
        println(url.readText())  // text를 있는 그대로 읽어들인다. (반복문 필요 없음)
    }

    if (conn.responseCode == 200) {

        // 데이터를 읽어드리는 read쪽 3총사
        val inputStream: InputStream = conn.inputStream
        val inputStreamReader = InputStreamReader(inputStream)
        val br = BufferedReader(inputStreamReader) // br = bufferedReader

        println("-------------------")
/*            while(true) {
                //br.readLine()을 사용하는 순간 한 줄을 읽기 때문에 한번만 사용해야 한다.
                if (br.readLine() != null) {
                    println("bufferedReader.readLine():${br.readLine()}") //readLine 한 줄읽기
                } else break
            }*/

        //강사님 코드
        var txt: String? = ""
        var temp: String? = ""
        while (true) {
            temp = br.readLine()
            println(temp)
            if (temp == null) break
            txt += temp
        }
        println("===============")
        println(txt) // 문자열이기 때문에 text 형식으로 출력
        // txt를 가지고 분석(파싱)하면 된다.
    }
}