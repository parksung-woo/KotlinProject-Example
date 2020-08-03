package com.example.android02

import java.util.*

fun main() {
    println("=====================arrayOf() 함수 사용=====================")
    //선언되어지는 타입에 따라 데이터의 종류가 달라질 수 있다.
    var datas:Array<Any> = arrayOf(1,2,3.14,"kim")   //Any or *
    // = var datas:Array<*> = arrayOf(1,2,3.14,"kim")
    for (data in datas) print("$data ")
    println()

    //forEach() 함수사용법
    datas.forEach {
        println("$it ")
    }
    println(Arrays.deepToString(datas))

    //format함수
    println("%5d,%d,%.2f,%s".format(*datas)) // 배열안의 타입을 정확히 알아야 사용가능  
            // %5d -> 앞에 5의 공란을 만들고 출력
}