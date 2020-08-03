package com.example.android02

import com.example.android02.aaa.Text16AAA

fun main() {
    println("===============create Class================")
    //data class, enum class
    //일반 calss
    //모든 클래스는 동일패키지안에서는 유니크해야한다.
    //클래스는 메인문 밖에 만들어도 가능하지만 class 파일로 따로 생성가능
    // kotlin 은 OOP(객체지향프로그래밍), FP(함수형 프로그래밍) 모두지원
    // 캡슐화, 상속, 다형성 등등 지원
    
    //val p = Test16Person()
    val p = Text16AAA()  //코틀린의 기본이 public이기 때문에 따로 선언하지 않아도 다른 패키지 접근 가능

    p.name = "Yang"
    p.age = 29
    println(p.name)
    println(p.age)

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
//Text16AAA의 내용과 동일
class Test16Person /*constructor(var name:String ="kim")*/{
    //클래스의 전역변수 : 속성, 멤버필드
    //var(getters/setters), val(getters) 모두 사용가능
    var name:String = "kim"     //->  constructor(var name:String ="kim")안으로 사용할 수 있다. 이경우 name은 전역변수가됨
    var age:Int = 33
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




