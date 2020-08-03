package com.example.android02

fun main() {
    println("==============if ~ else if ~ else==============")

    println(if (true) "kim" else "lee")

    var point: Int = 98
    println(if (point >= 90) "A" else if (point >= 80) "B" else "C")

    var result: String? = null
    result = if (point >= 90) "A" else if (point >= 80) "B" else "C" // if값으로 리턴됨
    // 위에 null로 초기화할 필요가 없음
    println("result : %s".format(result))

    // 95점이상이면 A+, 그렇지 않으면 A0, 85이상이면 B+, 그렇지 않으면 B0
    // 이런식으로 성적처리가 되도록 분기문을 추가

    var result_plus: String?
    result_plus =
        if (result == "A" && point >= 95) "A+" else if (result == "B" && point >= 85) "B+" else result
    println("result_Plus : ${result_plus}")
    // 제로를 포함하지 않았다 -> 불충분
    
    //강사님 코드 -> 새로운 변수를 추가하지않고도 가능
    if (point >= 80){
        if (point % 10 >= 5) result = result+"+"
        else result += "0"
        }
    println("result : %s".format(result))

    var su:Int = 3
    su = if(su==1){
        println("10*${su}")
        10*su
    } else if(su==2){
        println("100*$su")
        100*su
    } else if(su==3){
        println("1000*$su")
        1000*su
    } else {
        println("0")
        0*su
    }
    println("su : $su")

    println("============조건문에 is : Type 체크==========")
    if(su is Int) println("Int")
    else println("not Int")
    if(result is String) println("String")
    else println("not String")

}