package com.example.android02

fun main() {
    println("=====================arrayOf() 함수 사용=====================")
    //선언되어지는 타입에 따라 데이터의 종류가 달라질 수 있다.
    var datas = arrayOf(1,2,3)
    datas = arrayOf(4,5,6)

    println(datas[0])
    println(datas[1])
    println(datas[2])

    println("datas.size : ${datas.size}")
    for(i in 0 until datas.size){
        println(datas[i])
    }
    for(item in datas){    // 배열안에있는 요소 : item -> x, data등과 같은 다른변수를 사용해도 무방
        println(item)
    }

    var names:Array<String> = arrayOf("kim", "lee", "yang")
    for (i in 0 until names.size){
        println(names[i])
    }
    for (name in names){
        println(name)
    }
    for(i in names.size-1 downTo 0){   //배열의 역순으로 출력
        println(names[i])
    }
    var bools:Array<Boolean> = arrayOf(true,false,false)
    for(bool in bools) println("$bool ")
    println()
}