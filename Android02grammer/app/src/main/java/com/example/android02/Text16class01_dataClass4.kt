package com.example.android02

fun main() {
    println("============data Class4 (copy)=============")
    val a1:AAA = AAA()
    println(a1)
    
    val a2 = AAA(age=33)     //var 변수로 선언할 경우 a1으로 같이 사용해도 무방
    println(a2)

    val a3 = a1.copy(age = 44)
    println(a3)

    val a4 = a1.copy()
    println(a4)
    println(a1==a4)

    println("data class componentN")
    //객체의 속성을 분리해서 여러변수에 직접할당.     .으로 접근하지 않고 바로 사용 가능
    var (name,age) = AAA("kim",33)
    println(name)
    println(age)

}

data class AAA(val name:String="admin",val age:Int=0)