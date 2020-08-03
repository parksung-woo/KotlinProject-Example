package com.example.android02

import android.os.Bundle
import java.text.SimpleDateFormat
import java.util.*

fun main():Unit {
    println("===============var==============")

    //지역변수
    //var 선언된 동일한 변수명 사용불가
    //var su = 100
    var su = 100   //변수
    println("su : ${su}")
    var su2:Int?   // -> ? : null사용가능
    su2 = 200     //var su2:Int = 200
    su2 = 333
    
    println("su2 : $su2") //단일을 {}생략가능
    println("su+su2 : ${su+su2}") //다중은 {}생략불가

    println("===============val==============")
    println("val : java final -> 상수")
    val a = 10  //상수
    println("a : $a")
    //a = 20 불가 (read전용)
    val b:Int = 333  //반드시 초기화 후 사용
    println("b : $b")

    //동일 파일의 콘스트상수접근
    println(RESULT_CODE_ZERO)
    println(RESULT_CODE_PI)
    //다른 패키지의 있을 경우 패키지 풀네임명시
    //EX) println(com.example.android02.RESULT_CODE_PI)
    //EX) println(com.example.android02.RESULT_CODE_ZERO)

    var name:String ="kim"
    println("name : $name")

    var toDay:Date = Date()       // 자바에서는 new사용하지만 코틀린은 new없음
    println("toDay.time : ${toDay}")
    println("toDay.time : ${toDay.time}") // . 도 연산자이기 때문에 {}필요
    println("System.correntTimeMills() : ${System.currentTimeMillis()}")
    println(SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(toDay))

    println("============nullable : Type?============")

    var id = null
    println("id : $id")

    var pw:String? = null
    pw = "hi123456"
    println("pw : $pw")

    var kor:Int? = 100
    kor = null
    println("kor : $kor")

}

const val RESULT_CODE_ZERO:Int = 0 //public static final -> 공개되어있는 상수
const val RESULT_CODE_PI:Double = 3.14  //Type 생략가능