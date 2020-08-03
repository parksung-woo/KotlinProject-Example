package com.example.android02

import java.util.*

fun main() {
    println("====================원시타입(primitiveType) 함수=====================")

    var sus: IntArray = IntArray(10,{ i -> i})
    sus.forEach { print("$it ") }
    println()

    var sus_Of: IntArray = intArrayOf(11,22,33)   // ArrayOf -> 데이터 값을 직접대입 (소문자 intArrayOf)
    sus_Of.forEach { print("$it ") }
    println()

    var ds = DoubleArray(5,{i -> i*1.0}) // 변수는 int, 리턴은 Double
    ds.forEach { print("$it ") }
    println()

    var ds_Of = doubleArrayOf(1.1,1.2,1.3,1.4,1.5) // 변수는 int, 리턴은 Double
    ds_Of.forEach { print("$it ") }
    println()

    var cs = CharArray(5)  // Char의 기본값은 " "이기 때문에 콘솔창에서 확인이 안되는것같지만 드래그하면 확인할 수 있다.
    for (item in cs) print("$item, ")
    println()

    var bs = BooleanArray(5) // 기본값 : false
    for (item in bs) print("$item, ")
    println()

}