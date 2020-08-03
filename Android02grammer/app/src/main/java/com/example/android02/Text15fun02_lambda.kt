package com.example.android02

import kotlin.random.Random

fun main() {    //함수를 변수로 만듬
    println("=====================function lambda{}=========================")

/*    fun test():Int {
        return 100
    }
    var t =  test 이것을 사용하기 위해서 lambda를 사용 */
    // lambda는 데이터처럼 할당이 가능하기 때문에 사용
    // 할당받은 변수는 함수변수
    // 즉, 함수변수는 Call할 수 있다.
    // 함수 define 3번
    var fn:() -> Int = { Random.nextInt(10)}  //var을 사용했지만 fn은 변수가 아닌 함수
    // :() -> Int 생략가능      var fn = { Random.nextInt(10)}
    println(Random.nextInt(10))
    println(fn())

    var fn_1:() -> String = { Random.nextInt(10).toString()}
    println(fn_1())

    // 함수 define 1번
    var fn2:() -> Unit = { println("----lambda fn2----")}
    println(fn2()) // 반환값이 없는 함수이기 때문에 kotlin.Unit으로 타입만 나옴
    println("=========")
    run(fn2)  // run으로도 함수Call가능
    println("******")
    ({ println("----lambda fn2----")}) ()   // ()()로도 Call사용 가능     람다{}를 하나의 데이터 처럼 사용
    println("******")
    println()

    // 함수 define 2번
    // fun fn3(x:Int)
    var fn3 = { x:Int ->  println("----lambda fn3----$x")}    //왼쪽을 가공하는 것이 아닌 { 파라미터(타입) -> 리턴}으로 표현
    fn3(100)
    println("******")
    ({ x:Int ->  println("----lambda fn3----$x")}) (77)
    println("******")
    println()


    //fun fn4(x:Int):String
    var fn4 = {x:Int -> "kim$x"}
    println(fn4(99))

    //var fn4_1:(Int,Int) -> String = {x:Int,y:Int -> "kim,$x,$y"}
    var fn4_1 = {x:Int,y:Int -> "kim,$x,$y"}
    println(fn4_1(99,88))

    println("******")
    println(({x:Int,y:Int -> "kim,$x,$y"}) (77,66))
    println("******")

}

