package com.example.android02

fun main() {
    println("============data Class2=============")
    var car:carVO = carVO()      //val을 사용할 경우 car값 변경 불가
    println(car)
    println("차량이름 : ${car.name}, 차량가격 : ${car.price}")

/*  val일경우 변경불가
    car = carVO("벤츠",5000)
    println(car)
    println("차량이름 : ${car.name}, 차량가격 : ${car.price}")
*/

}

//자동차 데이터 클래스
//속성 : 차이름 , 가격
//객체생성 및 출력(출력시 데이터는 임의의값)
data class carVO(var name:String = "BMW", var price:Int = 10000)