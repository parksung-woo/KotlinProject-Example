package com.example.android02

import com.example.android02.aaa.Text16Work
//Text16Work생성 -> 함수객체 생성
fun main() {
    val work = Text16Work()

    work.work1()
    work.work2()
    work.work3()

    println(work.work1_return())
    println(work.work2_return())
    println(work.work3_return())
println("******************************************")
    var pr = Text16class_practice(1,"park",11,22,33)
    println("total=%d".format(pr.total()))
    println("total=${pr.total()}")
    println(pr.sum)
    println(pr)

    pr.kor = 50
    pr.eng = 50
    pr.math = 50
    println("total=${pr.total()}")
    println(pr.sum)
    println(pr)
println("******************************************")
    val Tp1 = Test16Board_practice()
    val Tp2 = Test16Board_practice(3)
    val Tp3 = Test16Board_practice("park")
    val Tp4 = Test16Board_practice(5,"sung")
    println(Tp1.num)
    println(Tp4.num)
    println(Tp1.name)
    println(Tp4.name)
    println(Tp1)
    println(Tp2)
    println(Tp3)
    println(Tp4)
println("******************************************")
    val store = Text20Store_practice(2000,"blue")
    println(store.price)
    println(store.color)
    println(store.fn5({100})(99))

}

// Test16Score_practice클래스를 정의하시오
// 속성(전역변수:property) : 번호num, 이름name, 국어kor, 영어eng, 수학math
// 기능(함수) : 총점total 반환, 모든 속성 출력하기printAll

class Text16class_practice constructor( var num:Int, var name:String, var kor:Int,
                                        var eng:Int, var math:Int){
    fun total() = kor+eng+math
    val sum= kor+eng+math // -> val sum:Int get()로 사용해야 변경된 데이터를 불러올 수 있음
    override fun toString(): String {
        return "Text16class_practice(num=$num, name='$name', kor=$kor, eng=$eng, math=$math)"
    }
}

//Test16Board_practice
// (), (int), (String), (Int, String)
class Test16Board_practice {
    var num = 0
    var name = "woo"
    constructor() {
        num = 1
        println("1번 $num")
    }
    constructor(num:Int) {
        this.num = 2
        println("2번 $num")
    }
    constructor(name:String) /*:this()*/ {
        this.name = name
        println("3번 $name")
    }
    constructor(num: Int, name: String) {
        this.name = name
        this.num = num
        println("4번 $num, $name")
    }

    override fun toString(): String {
        return "Test16Board_practice(num=$num, name='$name')"
    }
}

// 공책이라는 인터페이스를 정의하고
// 속성은 색상(String)
// 기능은 기능4-추상, 기능5-추상, 기능6-일반
// store클래스가 공책인터페이스를 상속받게 만듬(위에있는 class에 다중상속)
interface Note{
    var color:String
    fun fn4():Unit
    fun fn5():Unit
    fun fn6():String{
        println("interface fn6 hi")
        return "woo"
    }
}

class Text20Store_practice(
    var price:Int,
    override var color:String) : Text20Note{

    override fun fn4() {
        println("fn4$color,$price")
    }

    override fun fn5(fn: () -> Int): (Int) -> String {
        println("fn5$price,$color")
        return {x -> "woop"}
    }

}
