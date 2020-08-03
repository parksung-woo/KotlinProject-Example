package com.example.android02

import com.example.android02.aaa.Text21DDD
import com.example.android02.aaa.Text21CCC

/*   public (생략가능) : 전체 공개. 아무것도 안쓰면 기본적으로 public
     private : 현재 파일 내부에서만 사용
     internal : 같은 모듈 내에서만 사용
     protected : 상속받은 클래스에서 사용
*/

fun main() {
    println("============Visiblity Modifier(접근제한)============")
    //접근제한자
    //private (자기자신허용)
    //public or internal(공개)

    //private class가 메인함수와 동일한 파일에 존재시 접근가능
    var a = Text21AAA()

    //private class가 메인함수와 동일한 파일에 존재하지 않는다 -> 접근불가
   // var b = Text21BBB()
    //internal class도 다른패키지에 있어도
    //    접근가능
    //동일모듈(같이 컴파일되는 모든곳) 일때 사용가능
    var c = Text21CCC()
    
    var d = Text21DDD()
//    println(d.d1)  // protected 접근불가
//    println(d.d2)  // private 접근불가
    println(d.d3)  // public 접근가능
    println(d.d4)  // internal 접근가능(동일모듈에 있다고 판단)
    
    println(d.d3)
    println(d.d4)
    d.test3()
    d.test4()      // 1,2접근불가

}

private class Text21AAA{

}

class Text21EEE:Text21DDD(){   //Text21EEE와 Text21DDD의 패키지는 다름
    fun eee(){
        println(d1)
    }
}