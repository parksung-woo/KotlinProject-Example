package com.example.android02

import android.R

fun main():Unit {
    println("==================산술연산자==================")

    println(10/3)
    println(10.0/3)
    println(10/3.0)

    println("=================산술연산함수==================")
    println(10.plus(3))  //10+3
    println(10.minus(3))  //10-3
    println(10.times(3))  //10*3
    println(10.div(3))  //10/3
    println(10.0.div(3))  //10/3
    println(10.rem(3))  //10%3

    println("=================bit 연산자==================")
    println(8 and 3)
    println(8 or  3)
    println(8 xor 3) // 8^3
    println(8 shl 1) // >> shift연산(1/2)
    println(8 shr 1) // << shift연산(2배증가)
    println(8 ushr 1) // 양수 shift(오른쪽으로만)
    println(8.inv()) // 반전 (+1후 (-)부호추가)  / java : ~8

    println("===================비교연산자====================")
    println(5==5) //동일type끼리 비교 (동일타임, 동일값 -> 참)
    println(5===5) //(동일타임, 동일값, 동일주소 -> 참)
    println(5!=5)
    println(5>=5)
    println(5<=5)
    println(5<5)
    println(5>5)
    println(5>5)
    println("kim"=="kim")
    println(String()=="") //String() : 빈문자
    println(String()==null) //String() : 빈문자
    
    println("=================문자열 비교 연산함수==============")
    println(String().equals(""))
    println("kim".equals("kim"))
    println("kim".equals("KIM",true))  // ignoreCase : 대소문자 무시

    println("kim".compareTo("kim")==0)
    println("kim".compareTo("Kim")==0)
    println("kim".compareTo("Kim",true)==0)

    println("=================논리연산,함수==================")
    println(true and false)  // java : & (앞, 뒤 모두 만드시 돌아감)
    println(true && false)  // 결과만 중요한경우 사용 (앞이 거짓일 경우 뒤는 돌지 않는다)
                            // 뒤에 있는 부분이 돌지않을 수 있기 때문에 꼭 돌아야하는 경우 && -> and 로 사용
    println(true or false)
    println(true || false)

    println("in 연산자....or연산이 많은 경우")
    println( (3==1) or (3==2) or (3==3) or (3==4) )
    println( 3 in 1..3 )
    println( 3 in 1..10 )
    println( -3 in 1..10 )
    println( -3 in 1..10 )
    println( -3 !in 1..4 )
    println( 3 in arrayOf(1,2,3) )

    println("=================type체크 연산자 is !is==================")
    println(3 is Int)
    println(3.14 is Double)
    println(3.14f is Float)
    println(true is Boolean)
    println("kim" is String)
    println("100" is String)
    println(100.toString() is String)
    println(100.toString() !is String)
    
    println("=================증감연산자 ++,-- ==================")
    var count = 10 //변수선언
    println("count: "+count++)
    println("count: "+count++)
    println("count: "+count++)
    println("count: "+count++)
    println("count: ${count++}")

    var count2 = 20 //변수선언
    println("count: "+ ++count2)
    println("count: "+ ++count2)
    println("count: "+ ++count2)
    println("count: "+ ++count2)
    println("count: ${++count2}")

    println("=================대입연산, 복합대입연산==================")
    var sum = 0
    sum = sum +1  // sum += 1과 동일(복합대입연산)
    sum = sum +1  // sum += 1과 동일
    sum = sum +1  // sum += 1과 동일
    println("sum:${sum}")

    //and, or, xor 등은 복합대입안되고 일반 대입으로 사용할 것
    sum = sum and 10
    sum = sum or 10
    sum = sum xor 10
    sum = sum shl 2
    println("코틀린에서는 삼항연산이 사라짐.(?은 다른곳에서 사용해야하기 때문에 -> if문으로 대체)")
    //if else 문으로 대체 (자바와는 다르게 if실핼 후 값이 리턴된다.)
    println(if (true) "kim" else "iee")
    var x = if (false) "kim" else "iee"
    println(x)
    var point = 80
    println(if(point>=90) "A" else if(point>=80) "B" else "C")

    println("==================객체 형변환 as====================")
    var obj:Any = "hello" // null불가 AnyType
    //(String)obj : 캐스팅(형변환)
    var s1 : String = obj as String
    println(s1)
    println(s1 is String)
    println(obj === s1)
    println("======================================")
    var password:String = "1234"
    var password_confirm:String = "1234"
    var success: Boolean = (password.equals(password_confirm));
    println(success)
    if (success){
        println("hi")
    }else println("asd")

    val a =4
    val b =1
    val c =null
    val d =3
    if((a==null) or (b==null) or (c==null) or (d==null)){
        print("입력")
    }else
        print("실패")

    if((a.equals(null)) or (b.equals(null)) or (c.equals(null)) or (d.equals(null))){
        print("입력")
    }else
        print("실패")
}