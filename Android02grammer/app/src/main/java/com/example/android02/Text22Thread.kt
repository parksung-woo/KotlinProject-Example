package com.example.android02

import kotlin.concurrent.thread

fun main() {
    println("============Thread===========")
    println("Thread")
    println("start main")
    //bundle.gradle 아래라이브러리 명세 추가
    // implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:0.27.0-eap13'
    thread(true,priority=10,name="t1") {  // start = trun은 thread를 즉시 실행하라는 옵션
        //priority는 thread우선 순위(높을 수록 우선순위증가)
        //nmae = thread명
        for(c in 111..120){
            print("$c ")
            Thread.sleep(500)  // 1000 = 1초
        }
    }//.start() 필요 없음
    
    //main이랑 별개로 돌아가는 객체
    //Thread대신 ex)AAA로 선언하고 AAA를 Thread에 상속시키면서 사용할 수 있다.
    Thread{
        for(c in 'a'..'j'){
            print("$c ")
            Thread.sleep(500)  // 1000 = 1초
        }
    }.start()
    println()
/*  자바식 Thread
    Thread(){
        void run(){
            for(c in 'a'..'j'){
                print("$c ")
                Thread.sleep(500)  // 1000 = 1초
            }
        }
    }.start()
    println()
    */

    // 2. Thread(Runnable{}의 인터페이스 안에서 Thread를 돌리는 것)
    // Thread로 돌려야하는 객체가 Runnable를 상속받아서 Runnable타입을 가지고 와야한다.
    Thread(Runnable {  //영화보면서 다운받는것과 같은 원리 -> 내가 신경쓴다고 달라지지 않는다.
        for(c in 'k'..'t'){
        print("$c ")
        Thread.sleep(500)
    } }).start()

    // 3. Runnable(Runnable).run{}
    Thread(Runnable {
        for(i in 1..10){
            print("$i ")
            Thread.sleep(500)
        }
    }).run {start() }   // run은 Thread시작 명령어
    //multi Thread 

    //1. Thread class를 상속받아서 구현
    val t = ThreadEx()
    t.start()
    // 객체 생성없이 ThreadEx().start()도 가능

    //2
    val t2 = Thread(RunnableImpl())
    t2.start()

    println("end main")

}

//1. Thread class를 상속받아서 구현
class ThreadEx: Thread() {
    override fun run(){
        for(i in 20..30){
            print("$i ")
            Thread.sleep(500)
        }
    }
}

//2. Runable interface를 상속받아서 구현
// Runable 은 기본이 인터페이스
/*class RunnableImpl: Runable  {}
interface Runable{
    fun run(){
    for(i in 30..40){
        print("$i ")
        Thread.sleep(300)
    }
}   이것은 Thread가 아니다.
}*/
class RunnableImpl : Runnable  {
    override fun run(){
    for(i in 20..30){
        print("$i ")
        Thread.sleep(500)
    }
}
}
