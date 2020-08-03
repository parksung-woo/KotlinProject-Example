package com.example.android02

import java.util.*

fun main() {
    println("=====================arrayOf() 함수 사용=====================")
    var sus:Array<Int> = arrayOf(1,2,3)

    println(Arrays.deepToString(sus))
    println(sus)   //1차원 배열의 주소값이 반환

    sus.forEach { print(" $it") }
    println()
    sus.forEach { print(" ${it*2}") }
    println()

    var nulls: Array<Int?> = arrayOfNulls<Int>(3)  // alt + enter -> 수정사항변경
    nulls.forEach { print(" $it") }
    println()

    nulls[0] = 11
    nulls[1] = 111
    nulls[2] = 1111
    nulls.forEach { print(" $it") }
    println()

    nulls.set(0,99)   // [0]의 값을 99로 변경해라
    nulls.forEach { print(" $it") }
    println()

    var names:Array<String?> = arrayOfNulls(5)
    names.forEach { print(" $it") }
    println()

    for(i in 0 until names.size){
        names[i] = "kim $i"
    }
    names.forEach { print(" $it") }
    println()

    names.set(2,"yangssem")  // [2]의 값을 yangssem으로 변경해라
    names.forEach { print(" $it") }
    println()
}