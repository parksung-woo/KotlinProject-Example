package com.example.android02

import com.example.android02.aaa.Text16AAA

fun main() {
    println("===============create Class2================")
    //data class, enum class
    //일반 class
    //모든 클래스는 동일패키지안에서는 유니크해야한다.
    //클래스는 메인문 밖에 만들어도 가능하지만 class 파일로 따로 생성가능
    // kotlin 은 OOP(객체지향프로그래밍), FP(함수형 프로그래밍) 모두지원
    // 캡슐화, 상속, 다형성 등등 지원
    
    // val p = Test16Person2()
    // 생성자에서 property의 기본값 초기화를 생략 시 (constructor 내부)
    // 객체 생성할 때 인자값 필수
    val  p = Test16Person2(age=33)
    // 원하는 property 초기값 설정가능
    println(p.name)
    println(p.age)
    println(p.total)
    
    p.name = "Yang"
    p.age = 29
    //p.tel = "02"  // val 이기 때문에 사용불가 tel은 읽기 전용
    p.setTel = "02"
    println(p.name)
    println(p.age)
    println(p.tel)
    println(p.setTel)

    p.sleep()
    p.sleep2()
    p.sleep3()  //색이 다른 이유는 함수변수로 만들었기 때문이다

    println(p.getColor())
    println(p.getColor2())
    println(p.getColor3())
}

//클래스의 접근제한자 생략되어 있으면 public
// 샐성자 또한 명시가 없으면 public
// 기본생성자는 생략가능   constructor() -> 생성자  (생략가능)
// 생성자의 파라미터는 클래스의 property(속성)의 선언 및 초기화 목적
class Test16Person2 constructor(
                                var name:String = "lee",
                                var age:Int,
                                val tel:String = "010") {
    //클래스의 전역변수 : 속성, 멤버필드
    //var(getters/setters), val(getters) 모두 사용가능
    val total:String get() = "$name,$age"
    //tel은 val이라서 변경불가 이므로 다른 속성으로 생성
    var setTel:String = ""
        set(value) {
            field = value
        }

    //초기화 블럭
    init {
        age = 88
        println("init{}")
    }

    //함수만드는 3가지 방법(return 없는 3가지)
    fun sleep():Unit{
        println("----------sleep()---------")
    }
    fun sleep2() = println("----------sleep2()---------")
    var sleep3 = { println("----------sleep3()---------")}
    
    //return 있는거 3가지
    fun getColor():Int {
        return 111
    }
    fun getColor2()= 256
    var getColor3= {0}


}




