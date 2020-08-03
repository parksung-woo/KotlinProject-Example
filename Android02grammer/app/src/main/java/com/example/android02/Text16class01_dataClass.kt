package com.example.android02

fun main() {
    println("============data Class=============")
    //data class : equals(),hashCode(),toString()를 자동 오버라이딩
    var pvo:PersonVO = PersonVO()     // 데이터클래스를 만들면 만든 데이터클래스가 하나의 데이터타입이 된다.
    // 문법 : var or val 번수명 : 변수타입(이경우 데이터클래스가 하나의 데이터 타입) = 객채명()
    println(pvo)
    pvo.name = "Yang"
    println(pvo.name)
    println(pvo.age)

    pvo = PersonVO("lee",44)
    println(pvo)
    println(pvo.name)
    println(pvo.age)

}
// 모든 파라미터는 val or var로 선언해야한다.
// data class PersonVO(var name:String, var age:Int)

// 데이터클래스의 값들을 한번에 초기화 한다. (파라미터는 최소 한개 이상)
// 디폴트값을 부여할 수 있다.
data class PersonVO(var name:String = "kim", var age:Int=33)    // VO = Value Object : 값만 처리

/* 자바식
    class PersonVO{
    var name:String="kim"
    var age:Int=33
}*/
