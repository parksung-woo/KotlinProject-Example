package com.example.android02

fun main() {
    println("===============create Class5================")
    // this()생성자

    val board = Test16Board2()
    println(board)

    val board2 = Test16Board2(99)
    println(board2)

    val board3 = Test16Board2("kotlin")
    println(board3)

    val board4 = Test16Board2(88,"kotlin88")
    println(board4)

    val board5 = Test16Board2(false)
    println(board5)
}

class Test16Board2{
    var num:Int = 0
    var title:String = "title"
    var aaa:Boolean = true
    constructor(){
        num = 1
    }
    constructor(num:Int){
        this.num = num
    }
    constructor(title:String):this(){    //class4과 this()차이   -> num의 값이 달라진다. (값을 그대로 쓰지만 title만 변경)
        this.title = title   //전역변수  var title:String = "title"의 title 변수의 생성할때 들어간 constructor(title:String)의 title 대입
    }
    constructor(num:Int, title:String):this(num){
        this.title = title
    }
    constructor(aaa:Boolean):this(){
        this.aaa = aaa
    }

    override fun toString(): String {
        return "Test16Board2(num=$num, title='$title', aaa=$aaa)"
    }


}


