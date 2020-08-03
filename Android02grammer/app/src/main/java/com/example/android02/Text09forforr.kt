package com.example.android02

fun main() {
    println("=============== 다중 for  =================")
    
    //0~9
    //0~9
    //0~9
    //0~9 for을 먼저 만들고 반복되는 3번 반복하는 for문 안으로 집어넣는다고 생각한다.
    for(j in 0..2) {          // 변수를 둘다 i로 해도 다른 로컬변수로 인식하여 결과는 동일(코틀린 특징)
        for (i in 0..9) {
            print("$j,$i ")
        }
        println()
    }

    //구구단 찍기
    //2단부터 9단, 각 곱은 1~9
    println("구구단 찍기(2단~9단)")
    for(j in 2..9){         //(j in 2 until 10)과 동일
        for(i in 1..9)
        {
            print("$j*$i=%d ||".format(j*i))  // %d말고 ${j*i}가능
        }
        println()
    }

    // break를 이용하여 5단까지만 출력
    println("구구단 찍기(2단~5단)")
    for(j in 2..9){         //(j in 2 until 10)과 동일
        for(i in 1..9)
        {
            print("$j*$i=%d ||".format(j*i))  // %d말고 ${j*i}가능
        }
        if(j==5) break
        println()
    }
    println()

    // continue 를 이용하여 5단빼고 출력
    println("구구단 찍기(2단~5단)")
    for(j in 2..9){         //(j in 2 until 10)과 동일
        if(j==5) continue
        for(i in 1..9)
        {
            print("$j*$i=%d ||".format(j*i))  // %d말고 ${j*i}가능
        }
         println()
    }
    println()
    
    // label 사용
    loop@for(j in 2..9){         //(j in 2 until 10)과 동일
         for(i in 1..9)
        {
            print("$j*$i=%d ||".format(j*i))  // %d말고 ${j*i}가능
            if(i==5) break@loop  //전체 loop를 빠져나갈 수 있는 명령
                                 //continue 도 동일하게 사용가능
        }
        println()
    }
    println()

} // end main()

