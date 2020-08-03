package com.example.android02

fun main(arr:Array<String>?) {   //arr:Array<String>처럼 input parameter를 변경가능
    println("=====================function define2=========================")

    fun fn(x:Int, y:Int) = x+y   // 복잡하지 않는 단순한 로직(하나의 데이터타입으로 출력될 수 있는 분기문)일 경우 리턴값을 = 으로 사용가능
                                    // 분기문 : if, switch, when
 /* fun fn(x:Int, y:Int):Int{      // 위에 단순하게 표현한 함수의 전체 형태
        return x+y
    }*/
    println("x+y=${fn(10,20)}")

    fun fn2(x:Int, y:Int):String = if(x>y) "big" else "small"   //코틀린에서 if문은 실행 후 결과값을 반환하기 때문에 사용가능
    println(fn2(10,20))

    fun fn3():String = if(fn(15,25)>20) "big" else "small"
    println(fn3())

    fun fn4(x:Int):String = when(x){
        in 90..100 -> "A"
        in 80..89 -> "B"
        else -> "F"
    }
    println(fn4(90))
}

