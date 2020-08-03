package com.example.android02

import java.util.*
import kotlin.String as String

// 크기 5의 null값의 배열을 만들고 그 값을 kim1, kim2..kim5로 변경해라
fun main() {
    var su:Array<String?> = arrayOfNulls(5)
    println(su)
    println(su.contentToString())

    for(i in 0 until su.size){
        su.set(i, "kim$i")
    }
    println(su.contentToString())
    
    var arr:Array<Int> = Array(5, {i -> i+1})   //람다식은 {}필요
    arr.forEach { print("$it") }   //1,2,3,4,5
println()
    var arr_name:Array<String> = Array(5,{ i -> "kim${i+1}"})
    arr_name.forEach { print("$it ") }
    println()
    //미션
    //Array 생성자로 2차원 배열데이터 생성하기 (람다식)
    //[[0,1,2,3],[0,1,2,3]]
    var mission1:Array<Int> = Array(4,{i->i})
    var mission2:Array<Array<Int>> = Array(2,{Array(4,{i->i})})
    mission2.forEach {
        it.forEach { print("$it ") }
    }
    println()
    println(Arrays.deepToString(mission2))
    //미션, arrayOf사용
    var mission1_1:Array<Int> = arrayOf(0,1,2,3)
    var mission2_1:Array<Int> = arrayOf(0,1,2,3)
    var mission:Array<Array<Int>> = arrayOf(mission1_1,mission2_1)

    mission.forEach {
        it.forEach {
            print("$it ")
        }
    }
    println()
    println(Arrays.deepToString(mission))
    
    //multiArray01까지
    
    //multiArray02미션
    //[["kim","kim","kim","kim"],["kim","kim","kim","kim"]]을 출력하고
    //[["kim1","kim1","kim1","kim1"],["kim2","kim2","kim2","kim2"]]로 변경출력
    var name1:Array<String> = Array(4,{ i->"kim"})
    var name2: Array<Array<String>> = Array(2,{Array(4,{ i->"kim"})})

    name2.forEach {
        it.forEach {
            print("$it ")
        }
        println()
    }
    println(Arrays.deepToString(name2))

    var name2_2:Array<Array<String?>?> = arrayOfNulls<Array<String?>>(2)

    println(Arrays.deepToString(name2_2))
    for(i in 0 until name2_2.size){
        name2_2[i] = arrayOf("kim${i+1}", "kim${i+1}", "kim${i+1}", "kim${i+1}")
    }
    println(Arrays.deepToString(name2_2))

    println("-----------------")
    println(name2_2.contentDeepToString())  // == Arrays.deepToString(name2_2)
    println(name2_2[0]!!.contentDeepToString())     //!! : non null   [0]번 방꺼만 출력

    println(name2_2[0]!!.first())
    println(name2_2[0]!!.last())
    println("-----------------")


}