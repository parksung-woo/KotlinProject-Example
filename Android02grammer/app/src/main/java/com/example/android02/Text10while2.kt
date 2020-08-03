package com.example.android02

fun main() {
    println("==================while2====================")

    //정규표현식
    var regex:Regex = "(\\d+)|-(\\d+)".toRegex() //(\\d+)|-(\\d+) 양의정수 or 음의정수
    var regex2:Regex = "(\\w+)".toRegex()  //(\w+) : text
    println(regex.matches(""))
    println(regex.matches("1"))
    println(regex.matches("2"))
    println(regex.matches("-200"))
    println(regex.matches("kim"))
    println(regex2.matches("kim"))

    var strNum:String? = ""
    while (true){
        println("Input numbrt[종료시 -1]:")
        strNum = readLine()
        var num = if(regex.matches(strNum.toString())){
            //strNum.toString().toInt()
            strNum!!.toInt()  // !! : 절대 null이 아닐경우 null이 아니라고 확정지어주는 것
                              // 이미 선언된 병수에 null허용한다는 선언
        }
        else{   // 숫자가 아닌 문자를 입력했을 경우
            println("잘못입력")
            999
        }
        println("num : $num")
        if(num==-1) break
        }
    println("end num")
}