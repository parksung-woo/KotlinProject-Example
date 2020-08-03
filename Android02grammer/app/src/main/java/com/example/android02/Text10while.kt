package com.example.android02

fun main() {
    println("==================while====================")
    var count:Int = 0
    while (true){
        print("$count")
        count++
        if(count >= 5) break
    }
    println()

    var i:Int = 0
    while (i<=5){
        print("$i")
        i++
    }
    println()

    var x:Int = 0
    do{
        print("$x")
        x++
    }while (x>=5)     // 조건을 만족하지 않아도 do를 실행하기 때문에 한번은 출력한다.
    println(" end while")


    while(true){
        var x:String? = "x"
        println("$x")
        //x = "end"
        println("종료를 원할경우 end입력 : [다른키입력시 계속 실행]")
        x = readLine()
        if(x.equals("end")) break
    }
    println("end while")


}