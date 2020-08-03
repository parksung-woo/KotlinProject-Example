package com.example.android02

import java.util.*

fun main() {
    println("==================Array(사이지, 람다식) : 생성자=====================")
    var sus:Array<Int> = Array(10,{i -> i}) // 변수 -> 리턴값 0부터 10전까지(9)생성하여 리턴i값으로 저장
    sus.forEach { print("$it ") }
    println()

    var sus_0:Array<Int> = Array(10,{i -> 0}) // 변수 -> 리턴값 0부터 10전까지(9)생성하여 리턴i값으로 저장
    sus_0.forEach { print("$it ") }
    println()

    var sus_10:Array<Int> = Array(10,{i -> i*10}) // 변수 -> 리턴값 0부터 10전까지(9)생성하여 리턴i값으로 저장
    sus_10.forEach { print("$it ") }
    println()

    var names:Array<String> = Array(5,{i -> "kim"})
    names.forEach { print("$it ") }
    println()

    //kim1 kim2 kim3 kim4 kim5
    var names_1:Array<String> = Array(5,{i -> "kim${i+1}"})
    names_1.forEach { print("$it ") }
    println()

    //1 2 3 4 5 : String
    var names_String:Array<String> = Array(5,{i -> "${i+1}"})
    names_String.forEach { print("$it ") }
    println()
}