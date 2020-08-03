package com.example.android02

fun main() {
    println("===============inner Class================")
    //클래스 정의는 클래스 내부에도 정의할 수 있다.
    //단, 내부클래스의 기능(외부클랙스 자원 참조)을 사용하고 싶다면
    //inner class선언이 필수
    
    var out = Outer()
    println(out.name)
    out.fn()

    var inn: Outer.Inner = out.Inner()
    println(inn.age)
    inn.test()

    //함수안에 함수를 정의할 수 있듯이
    //함수안에 클래스를 정의할 수 있다.
    //이를 로컬내부클래스라 한다.
    //함수의 로컬변수를 내부클래스가 참조할 수 있다.
    // val kor = 100 -> var val 모두 사용가능
    var kor = 100
    class LocalOuter{
        var name:String = "Yang"
        fun fn(){
            println("----LocalOuter fn()----")
            println("kor:$kor")
        }
            inner class AAA{

            }
    }   //객체생성을 위에서 할 수 없다
    var localOuter = LocalOuter()
    println("localOuter : ${localOuter.name}")
    localOuter.fn()

}
class Outer {
    var name:String = "kim"
    fun fn(){
        println("----Outer fn()----")
    }   //Outer클래스의 자원을 객체생성하지 않고도
        //inner class로 선언시 사용할 수 있다.
        inner class Inner{           // inner class로 선언해야지 Outer의 접근가능
            var age:Int = 33
            fun test(){
                println("----inner fn()----")
                println("age:$age")
                println("name:$name")
                fn()
            }
        }
}





