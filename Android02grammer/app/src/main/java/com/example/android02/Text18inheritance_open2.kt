package com.example.android02

fun main() {
    println("===============inheritance_Open Class, Open fun, Open property================")

    //Kotlin의 기본클래스는 상속을 허용하지 않는다.
    //속성과 기능도 재정의 허용하지 않는다.
    var p = Text18Person2()   //부모클래스 super class
    println(p.name)
    println(p.name2)  // Text18Person2있는 이름
    p.eat()
    p.sleep()

    var m = Text18Man2()
    println(m.name)
    println(m.name2)  // Text18Man2의 있는 이름(재정의된 값)
    m.sleep()

    var p2:Text18Person2 = Text18Man2() //다형성   Text18Man2안에있는 것 중 Text18Person2안에있는것만 사용가능
                                                  // 결국 재정의 된 것만 사용가능
    println(p2.name2)
    p2.sleep()

}



open class Text18Person2{
    val name:String = "kim"
    open val name2:String = "kim2"  // override하기 위해 open해야한다.
    fun eat(){
        println("----Text18Person2 eat()----")
    }
    open fun sleep(){
        println("----Text18Person2 sleep()----")
    }
}

class Text18Man2 : Text18Person2() {
    // var name:String = "kim2" 재정의불가
    override var name2:String = "yang2"  //override 명시
    val tel: String = "010"
    fun work() {
        println("----Text18Man2 work()----")
        println("----Text18Man2 name:$name----")
        eat()
    }

    override fun sleep(){    // 상속받은 sleep를 재정의
        println("----Text18Person2 sleep2()----")
    }


}



