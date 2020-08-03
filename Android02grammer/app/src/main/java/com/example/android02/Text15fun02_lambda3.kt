package com.example.android02

import java.util.*
import kotlin.random.Random

fun main() {    //함수를 리턴값으로 만듬
    println("=====================function lambda{}=========================")

/*  람다함수는 데이터처럼 함수의 리턴값으로 할당가능
    ({Random.nextInt(10)}){}
    ({ println("----lambda fn2----")}) ()
    ({ x:Int ->  println("----lambda fn3----$x")}) (77)
    ({x:Int,y:Int -> "kim,$x,$y"}) (77,66)
*/
    fun start1():()->Int{
        return {Random.nextInt(10)}
    }
    println(start1()())     //start1()자체가 함수이므로 Call하기위해서 ()를 사용한다.

    fun start2():()->Unit{
        return  {println("----lambda fn2----")}
    }
    println(start2())

    fun start3():(Int) -> Unit {
        return  { x:Int -> println("----lambda fn3----$x")}
    }
    println(start3()(2))

    fun start4():(Int,Int) -> String {
        return  {x:Int,y:Int -> "kim,$x,$y,${x+y}"}
    }
    println(start4()(3,2))

}

