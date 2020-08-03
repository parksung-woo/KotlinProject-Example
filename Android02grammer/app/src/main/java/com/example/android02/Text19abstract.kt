package com.example.android02

fun main() {
    println("===============abstract class================")

    //추상클래스의 생성자로는 객체생성(인스턴스 생성)불가
    //다형성을 이용하여 객체생성
    // var p = Text19Person()
    var p:Text19Person = Text19Man()  //다형성  (Text19Person 밖에 사용불가)
    p.name
    p.eat()   // 추상이기 때문에 Text19Man에 재정의된 함수를 호출
    p.eat2()
}

//추상함수는 상속받은 클래스가 반드시 오버라이딩해야한다.
abstract class Text19Person{
    val name:String = "kim"
    abstract fun eat()      //{}없이 추상으로 사용가능
    fun eat2(){
            //일반함수도 사용가능
        }
    }

class Text19Man:Text19Person(){
    override fun eat() {   //추상함수는 반드시 재정의해야한다.
        println("----Text19Man eat()----")
    }
    fun work(){
        
    }

}


