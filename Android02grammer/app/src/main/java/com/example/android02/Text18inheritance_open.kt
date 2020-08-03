package com.example.android02

fun main() {
    println("===============inheritance_Open Class================")

    //Kotlin의 기본클래스는 상속을 허용하지 않는다.
    var p = Text18Person()   //부모클래스 super class
    println(p.name)
    p.eat()

    var m = Text18Man()      //자식클래스 sub class
    println(m.name)
    println(m.tel)
    m.eat()
    m.work()

    //다형성
    //상속이 전제로 된 경우 슈퍼클래스 타입객체 생성시
    //서브클래서 생성자로 객체 생성가능
    //대신, 접근할 수 있는 자원은 슈퍼클래스 본인것만 가능 (자신클래스의 자원은 접근 불가)
    //속도는 느려지지만 개발의 편리성과 유지보수의 장점때문에 사용
    var p2:Text18Person = Text18Man()  //타입이 Text18Person(부모클래스)이므로 tel, work(자식클래스)접근불가
                                       // Text18Man() 접근불가
    //var p2:Text18Person = Text18Woman()
    println(p2.name)
    //println(p2.tel)
    p2.eat()
    //p2.work()


}
open class Text18Person{  //상속하기 위해서 open를 선언해줘야한다.
    val name:String = "kim"
    fun eat(){
        println("----Text18Person eat()----")
    }

}

class Text18Man : Text18Person() {    //Text18Person를 상속받음
    val tel: String = "010"
    fun work() {
        println("----Text18Man work()----")
        println("----Text18Man name:$name----")
        eat()
    }

class Text18Woman : Text18Person() {    //Text18Person를 상속받음
    val tel: String = "02"
    fun work() {
        println("----Text18Woman work()----")
        println("----Text18Woman name:$name----")
        eat()
        }
    }

}



