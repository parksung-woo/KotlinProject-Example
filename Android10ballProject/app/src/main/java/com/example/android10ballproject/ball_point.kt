package com.example.android10ballproject

import java.util.*

fun main() {
    var su_point = arrayOf("10","15","20","25","30","35","40","45","50","60","70","80","90","100")
    var One_point:Array<Int> = Array(11,{i -> (i)*10})
    var Three_point:Array<Int> = Array(11,{i -> (i)*10})
    println("--------------------")

    print("su_point :")
    su_point.forEach { print("$it ") }
    println()
    print("One_point :")
    One_point.forEach { print("$it ") }
    println()
    print("Three_point :")
    Three_point.forEach { print("$it ") }
    println()
    println("---------------------")


    val a = Random()
    val a_num = a.nextInt(10)
    val su_num:Int = su_point[a_num].toInt()
    println("su_point : ${su_point[a_num]}")  //50

    val b = Random()
    val b_num = b.nextInt(10)
    val one_num = One_point[b_num]
    println("one_point : ${One_point[b_num]}")  //30

    val c = Random()
    val c_num = c.nextInt(10)
    val three_num = Three_point[c_num]
    println("Three_point : ${Three_point[c_num]}")  //20

    if (su_num == one_num + three_num){
        println("성공")
    } else println("실패")

/*    val a_num = b_num + c_num
    println("su_point : ${su_point[a_num]}")*/

}