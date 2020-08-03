package com.example.android02

fun main() {
    println("===============create Class4================")
    // 생성자 오버로딩 - 파라미터의 개수, 타입, 순서가 다르면 여러 생성자를 정의할 수 있다.
    val board = Test16Board()
    println(board)

    val board2 = Test16Board(99)
    println(board2)

    val board3 = Test16Board("kotlin")
    println(board3)

    val board4 = Test16Board(88,"kotlin88")
    println(board4)
}

class Test16Board{
    var num:Int = 0
    var title:String = "title"
    constructor(){
        num = 1
    }
    constructor(num:Int){
        this.num = num
    }
    constructor(title:String){
        this.title = title   //전역변수  var title:String = "title"의 title 변수의 생성할때 들어간 constructor(title:String)의 title 대입
    }
    constructor(num:Int, title:String){
        this.num = num
        this.title = title
    }

    override fun toString(): String {
        return "Test16Board(num=$num, title='$title')"
    }


}


