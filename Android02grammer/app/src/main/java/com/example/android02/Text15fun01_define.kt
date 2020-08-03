package com.example.android02

fun main(arr:Array<String>?) {   //arr:Array<String>처럼 input parameter를 변경가능
    println("=====================function=========================")
   //함수의 원리 : 2번 (Only Input) Return(:Unit) 생략가능
    fun fn1():Unit{
        println("-------fn1()-------")
    }
    fun fn1(x:Int){     //오버로딩 : 같은 이름의 메소드(함수)를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
                        // cf) 오버라이딩(Overriding) : 상위 클래스에 포함되있는 메소드를 하위 클래스가 재정의 해서 사용
        println("----fn1(x:Int)--$x--")
    }
    fn1() // Input Type이 없기 때문에 위에있는 fn1()을 실행하여 fn1()을 출력
    fn1(100)
    println()

    //함수의 원리 : 3번 (Only Output)
    fun fn2():Int{
        println("----fn2():Int----")
        return 100
    }
    var x = fn2()
    println("x:$x")
    println()

    //함수의 원리 : 4번
    fun fn3(arr: Array<String>):String{
        println("----fn3(arr: Array<String>):String----")
        return arr[0]
    }
    println(fn3(arrayOf("kim","lee","yang")))
   
    //그냥한번 함수사용해봄
    if(fn3(arrayOf("kim","lee","yang")).equals("kim")){
        println("kim hi")
    }
}


/* 자바에서는 함수안에 함수사용을 불가
    class Test{
        public void fn(){
            public int fn2(){
                class Innter            // 대신 함수안에 class를 추가할 수 있다.
            }
        }
    }
   자바에서는 아래와 같이 함수를 분리해서 사용
      class Test{
        public void fn(){
            return 0
        }
        public int fn2(){
            return 0
        }
    }        
*/
