package com.example.android02

fun main() {
    print('A')
    print('B')
    print('C')
    println("hello")
    println("hello "+"android")
    println("hello "+"android "+100 + 200)
    println("hello "+"android "+(100 + 200))
    println("${100 + 200} hello")
    println("hello ${100 + 200} ")
    println("hello ${100 == 200} ")
    println("hello ${8 and 3} ")  //bit단위로 &연산
    println("hello ${8 or 3} ")  //bit단위로 &연산
    println("hello ${8 xor 3} ")  //bit단위로 &연산
    println("heool %d+%d=%d, name:%s, pi:%f".format(100, 200, 300,"kim",3.141592))  //format안에 인자를 c문법으로 출력
    println("heool %d+%d=%d, name:%s, pi:%.2f".format(100, 200, 300,"kim",3.141592))

    println(3.14)
    println(3.14f)
    println(true)
    println(false)

}