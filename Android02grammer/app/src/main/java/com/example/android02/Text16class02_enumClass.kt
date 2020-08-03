package com.example.android02

fun main() {
    println("============enum Class4=============")
    //enum은 열거형(enumerated type) 서로 연관된 상수들의 집합 
    println(CarName.values())   //배열로 가지고 있음

    println(CarName.BMW)
    println(CarName.Ray)
    println(CarName.OOOO)

    println(CarName.values().contentToString())
    CarName.values().forEach { print("$it ") }
    println()

    //println(Product.values().contentToString())
    println("------------Product----------")
    println(Product.BMW.price)
    println(Product.Ray.price)
    println(Product.OOOO.price)
    println("------------pp----------")
    println(Product.BMW.pp())
    println(Product.Ray.pp())
    println(Product.OOOO.pp())
    println("----------함수사용---------")
    println(getProduct(Product.OOOO))
}
fun getProduct(p:Product) = when(p){   //p를 가지고 분기
    Product.BMW -> "Good"
    Product.Ray -> "hello"
    //Product.OOOO -> "by"
    else -> "Non Product"
}

enum class CarName{BMW,Ray,OOOO}

enum class Product(var price:Int, var power:Int){
    BMW(1000,100),
    Ray(2000,200),
    OOOO(3000,300);     // ;주의, 세미콜론은 필수
    fun pp() = price * power
    //fun qq() = arrayListOf<Product>
}

//sealed class는 enum class의 확장판으로 클래스를 담을 수 있다.  (이런 클래스도 있다...)
sealed class Zoo(val name:String){
    class Tiger(name:String,val eye:String) : Zoo(name)    // Zoo.Tiger.name 으로 접근
    fun fn(){

    }

}