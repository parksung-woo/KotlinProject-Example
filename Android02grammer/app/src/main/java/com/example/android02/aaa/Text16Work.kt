package com.example.android02.aaa

class Text16Work {
    //함수를 만드는 3가지 방법 (return없는 경우)
    /*1.*/ fun work1():Unit {
        println("work1")
    }
    /*2.*/fun work2() = println("work2")
    /*3.*/var work3 = { println("work3")}

    //return있는 경우
    /*1.*/fun work1_return():Int{
        return 100
    }
    /*2.*/fun work2_return() = 200
    /*3.*/var work3_return = {300}


}