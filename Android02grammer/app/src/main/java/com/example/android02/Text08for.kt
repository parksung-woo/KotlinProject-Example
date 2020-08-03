package com.example.android02

fun main() {
    println("=============== for  =================")
    
    for(i:Int in 0..9){     // (i in 0..9) type 생략 후 이렇게도 가능
       println("$i")
    }
    for(i:Int in 0..9)   print("$i ")  // 한줄실행은 {}생략가능
    println()
    for(i:Int in 0..9 step 2)   print("$i ")
    println()
    // ..은 작은 수에서 큰 수만 가능(--사용 불가)
    // 감소는 downTo 사용
    for(i:Int in 9 downTo 0)   print("$i ")
    println()
    for(i:Int in 9 downTo 0 step 2)   print("$i ")
    println()

    //배열의 인덱스처럼 사용하고 싶다.
    //[0],[1],....[size-1]
    var size = 10
    for (i in 0..size-1) print("$i ")
    println()

    //until : size -1
    for (i in 0 until size) print("$i ")
    println()

    //반복문 빠져나가기 : break
    for (i in 0 until size){
        print ("$i ")
        if(i>=5) break
    }
       println()

    //원하는 부분만 건너뛰어라 : continue
    for (i in 0 until size){
        if (i==4) continue    //건너뛸 대상을 위해 println 위로 와야한다.
        print ("$i ")
    }
    println()
    for (i in 0 until size){
        if (i%2==0) continue    //홀수출력
        print ("$i ")
    }
    println()


} // end main()

