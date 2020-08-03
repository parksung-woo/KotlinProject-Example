package com.example.android02

import java.util.*
import kotlin.random.Random

fun main() {    //함수를 함수인자로로 만듬
    println("=====================function lambda{}=========================")

/*  람다함수는 데이터처럼 함수인자로 할당가능
    ({Random.nextInt(10)}){}
    ({ println("----lambda fn2----")}) ()
    ({ x:Int ->  println("----lambda fn3----$x")}) (77)
    ({x:Int,y:Int -> "kim,$x,$y"}) (77,66)
*/
    //대표적인 예
    // var arr:Array<Int> = Array(3,{i -> i})     //Array<Int> 타입
    fun start(fn:()->Int){    //람다식에서 생략가능했던 것 ()->Int   ({Random.nextInt(10)}){}
       var random_su = fn()
       println("random_su:$random_su")
    }
    start({Random.nextInt(10)})
    //    start({Random.nextInt(10)}())일 경우 함수의 결과인 Int타입이 반환되기 때문에 함수타입을 받는 다는 조건에 반한다.

/*    fun start(fn:()->Int){
    }
    start({Random.nextInt(10)})
    이 경우 아직 Call을  하지않고 fn값으로 할당하기만 한 것
 */

    fun start2(fn:()->Unit){
        fn()
    }
    start2({ println("----lambda fn2----")})

    fun start3(fn:(Int)->Unit){
        fn(33)
    }
    start3({ x:Int ->  println("----lambda fn3----x:$x")})
    //
    //    fun start4(fn:(Int, Int)-> String){
    //        println(fn(77,88))
    //    }
    //    start4({x:Int,y:Int -> "kim,$x,$y"})
    //
    //    //미션1
    //    // 1일때는 합 : lambda1(2,3)
    //    // 2일때는 곱 : lambda2(2,3)
    //    // cal(1 or 2,lambda1, lambda2)
    //강사님코드
    fun cal2(su:Int,lambda3:(Int,Int)->Int,lambda4:(Int,Int)->Int){
        if(su==1) println("합 : ${lambda3(2,3)}")
            else println("곱 : ${lambda4(2,3)}")
    }
    cal2(2,{x,y -> x+y},{x,y -> x*y})  //타입 생략

    //미션2
    //size만큼 람다함수가 배열을 반환하고 출력
    //함수를 메인함수 밖에 정의해도 함수호출가능
    fun testArray(i:Int,fn:(Int) -> IntArray){
        println(fn(i).contentToString())
    }
    //testArray(10,{x -> Array(x,{i->i})})
    testArray(10,{i -> IntArray(i)})

    // 고차함수(High Order Function) 또는 일급함수 라고한다.
    // -함수를 변수에 할당,
    // -함수를 함수의 인자값으로 할당,
    // -함수를 리턴문에 할당

}

