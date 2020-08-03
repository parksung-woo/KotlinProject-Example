package com.example.android02

import java.util.*
import java.util.Arrays.deepToString

fun main() {
    println("===============다차원 배열===============")
    
    //[[1,2,3],[11,22,33]]
    var sus1:Array<Int> = arrayOf(1,2,3)
    var sus2:Array<Int> = arrayOf(11,22,33)
    var suss:Array<Array<Int>> = arrayOf(sus1,sus2)
    // var suss:Array<Array<Int>> = arrayOf(arrayOf(1,2,3),arrayOf(11,22,33)) 한번에 적어도 가능

    //1 2 3
    //11 22 33
    //큰 범위에서 작은 범위로
    for(sus2 in suss){
        for(sus1 in sus2){
            print("$sus1 ")
        }
        println()
    }
    println()

    suss.forEach {
        it.forEach { print("$it ") }
        println()
    }
    println(Arrays.deepToString(suss))
    println()

    //미션
    //Array 생성자로 2차원 배열데이터 생성하기
    //[[0,1,2,3],[0,1,2,3]]
    var ar = Array(4,{i -> i})
    var ar2 = Array(2,{j -> j})
    ar2.forEach {
        ar.forEach {
                print("$it ")
        }
        println()
    }
    println(Arrays.deepToString(ar2))
    println()

    //강사님 코드
    val suss2:Array<Array<Int>> = Array(2,{ Array(4,{ i -> i}) })
    suss2.forEach {
        it.forEach { print("$it ") }
        println()
    }
    println(Arrays.deepToString(suss2))
}