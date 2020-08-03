package com.example.android02

import androidx.annotation.ArrayRes
import java.util.*
import java.util.Arrays.deepToString

fun main() {
    println("===============다차원 배열===============")

    val namess:Array<Array<String>> =
        Array(2,{Array(4,{i -> "kim$i"})})
    for (names in namess){
        for(name in names){
            print("$name ")
        }
        println()
    }
    println("=======================")
    namess.forEach {
        it.forEach {
            print("$it ")
        }
        println()
    }

    var suss:Array<IntArray> = Array<IntArray>(2,{intArrayOf(1,2,3)})
    println(suss.contentDeepToString())
    println("------------------")
    println((suss[0] + suss[1]).contentToString())

    var suss2:Array<IntArray> = Array<IntArray>(2,{IntArray(10)}) // 기본값 10개 들어가 있는 배열이 2개
    println(suss2.contentDeepToString())

    var suss3:Array<IntArray> = Array<IntArray>(2,{IntArray(4,{i ->i})})
    println(suss3.contentDeepToString())

    //[[0.0,0.0,0.0],[0.0,0.0,0.0]]
    var suss4:Array<DoubleArray> = Array<DoubleArray>(2,{DoubleArray(3)})
    println(suss4.contentDeepToString())

    //[[false,false,false],[false,false,false],[false,false,false]]
    var suss5:Array<BooleanArray> = Array<BooleanArray>(3,{BooleanArray(3)})
    println(suss5.contentDeepToString())  // -> 기본값이 아닌 true로 출력하고 싶을경우 arryOf로 선언

    //[false,false,false,false,false,false] -> 위에 배열 중 [0][1]을 하나로 합치고 싶을 경우
                                            // 1차원 배열로 선언하는 것이 아니라 2차원배열을 병합하여 1차원 배열처럼 사용
    println(suss5[0]+suss5[1])
    var suss01 = suss5[0]+suss5[1]
    println(suss01.contentToString())

    //[[0.0,0.0,0.0,0.0,0.0,0.0]]
    var suss02 = suss4[0] + suss4[1]
    println(suss02.contentToString())

}
