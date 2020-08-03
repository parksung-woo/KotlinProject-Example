package com.example.android02.aaa

// 클래스 파일(main이 없고 파일이름과 class이름이 동일)
class Text16AAA {
    var name:String = "kim"     //->  constructor(var name:String ="kim")안으로 사용할 수 있다. 이경우 name은 전역변수가됨
    var age:Int = 33
    //함수만드는 3가지 방법(return없는 3가지)
    fun sleep():Unit{
        println("----------sleep()---------")
    }
    fun sleep2() = println("----------sleep2()---------")
    var sleep3 = { println("----------sleep3()---------")}

    //return있는거 3가지
    fun getColor():Int {
        return 111
    }
    fun getColor2()= 256
    var getColor3= {0}
}