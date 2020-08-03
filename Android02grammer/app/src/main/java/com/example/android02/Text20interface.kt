package com.example.android02

fun main() {
    println("===============interface================")

    //kotlin에서 다중상속을 지원한다.
    var store = Text20Store(1000,"blue")
    println(store.price)
    println(store.color)
    println("-------------------")
    store.fn1()
    println(store.fn2("kim"))
    println(store.fn3().contentToString())
    store.fn4()
    println(store.fn5({100})(99))
    println(store.fn6())
}

//interface도 abstract와 같이 기본적으로 상속을 지원
//interface는 생성자 없음
interface Text20Book /*constructor()사용불가*/ {
    // constructor() 사용불가 : 생성자를 가질 수 없다.

    // var price:Int = 1000 -> 변수초기화 불가
    var price:Int //초기화는 선언만 가능하며 초기화는 상속받은 클래스에서 한다.

    // 함수정의부 블럭이 생략되면 무조건 abstract, 추상함수
    /*open*/ /*abstract*/ fun fn1():Unit
    fun fn2(name:String):String

    //일반함수는 무조건 재정의 가능하여 open 생략가능
    /*open*/ fun fn3():Array<Int>{
        return arrayOf(1, 2, 3)
    }
}

class Text20Store(override var price:Int,
                  override var color:String) : Text20Book, Text20Note{ //추상함수들은 재정의 필요  //클래스는 ()필요하지만 인터페이스는 ()필요없음
    override fun fn1() {
        println("Text20Store....fn1()")
    }

    override fun fn2(name: String): String {
        println("Text20Store....fn2() : $name")
        return "Kotlin"
    }

    override fun fn3(): Array<Int> {
        println("Text20Store....fn3()")
        return Array<Int>(10,{i->i})
    }

    override fun fn4() {
        println("Text20Store....fn4()")
    }

    override fun fn5(fn: () -> Int): (Int) -> String {
        println("Text20Store....fn5() : ${fn()}")
        return {x -> "yang"}
    }
}

// 공책이라는 인터페이스를 정의하고
// 속성은 색상(String)
// 기능은 기능4-추상, 기능5-추상, 기능6-일반
// store클래스가 공책인터페이스를 상속받게 만듬(위에있는 class에 다중상속)

interface Text20Note{
    var color:String
    fun fn4():Unit
    fun fn5(fn:()->Int):(Int)->String
    fun fn6():String{
        println("Text20Store....fn6()")
        return "kim"
    }

}
