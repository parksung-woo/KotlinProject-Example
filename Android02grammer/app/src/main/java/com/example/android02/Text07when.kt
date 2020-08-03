package com.example.android02

fun main() {
    println("===============when : jvaa switch / -> : java case =================")
    
    var su:Int = 55
    when(su){
        0 -> println("su:0")      //  조건 -> 실행
        1 -> println("su:1")
        2 -> println("su:2")
        3,4,5,6 -> println("su:3,4,5,6")
        else -> println("other")
    }

    var name : String = "kim3"
    var result : String = when(name){
        "kim" -> {
            println("Hello $name")
            "Hello $name"
        }
        "kim2" -> {
            println("Hi $name")
            "Hi $name"
        }
        "kim3" -> {
            println("Bye $name")
            "Bye $name"
        }
        "kim4","kim5","kim6" -> {
            println("Everyone $name")
            "Everyone $name"
        }
        else -> {
            println("Who are you?")
            "Who are you?"
        }
    }
    println("result : $result")  //Unit -> void

    println("=====================When문에 in ..사용가능=======================")
    var point:Int = 90
    var grade : String = when (point){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in arrayOf(1,2,3) -> "부모님 모셔와"
        else -> "F"
    }

    println("grade : $grade")

    var kor:Int = 90
    when(kor){
        "90".toInt()-> println(kor)
        else -> println("other")
    }

    println("=================When ()가 없어도 되는 경우 -> if문처럼사용 =======================")
    when{
        true -> println("true")
        false -> println("false")
        else -> println("else")
    }
    var x:Int = 2
    when{
        x >= 3 -> println("x >= 3")
        x < 0 -> println("x < 0")
        else -> println("else")
    }
    when{
        isOdd(x) -> println("Odd(%d)".format(x))
        isEven(x) -> println("Even(%d)".format(x))
        x < 0 -> println("x < 0")
        else -> println("else")
    }

    println("=============== is !is ==================")
    var eng:Int = 88  // Int로 선언했기 때문에 무조건 Int지만 이렇게 사용할 수 있다는 것을 보여줌
    when(eng){
        is Int -> println("Int type")
        !is Int -> println("Int NotzZZ type")
    }

} // end main()

//함수
fun isOdd(x:Int):Boolean{
    if(x%2!=0)return (true)
    else return (false)
}
fun isEven(x:Int):Boolean{
    if(x%2==0)return (true)
    else return (false)
}