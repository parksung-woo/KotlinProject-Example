package com.example.android02

fun main() {
    println("============data Class3(함수(fun)사용)=============")
    fun fn(pvo:ProductVO){
        println("${pvo.pname}, ${pvo.price}")
     }
    fn(ProductVO())
    fn(ProductVO("pc",300000))
    println("--------------------------------")

    fun fn2(pvo:ProductVO) = if(pvo.price >= 1000000) "big" else "good"
    println(fn2(ProductVO()))
    var pvo:ProductVO = ProductVO()
    println(fn2(pvo))
    pvo = ProductVO("pc",300000)
    println(fn2(pvo))
    println("--------------------------------")

    var fn3 = {pvo:ProductVO -> if(pvo.price >= 1000000) "big" else "good"}
    println(fn3(pvo))
    println("--------------------------------")

    fun fn4():ProductVO{
        return ProductVO()
    }
    println(fn4().pname)
    println(fn4().price)
    println("--------------------------------")

    fun fn5() = ProductVO()     //따로 언급없으면 자동 return
    println(fn5().pname)
    println(fn5().price)
    println("--------------------------------")

    val fn6 = {ProductVO()}
    println(fn6().pname)
    println(fn6().price)
    println("--------------------------------")

    //[ProductorVO(),ProductorVO("TV",500000)]
    var arr:Array<ProductVO> = arrayOf(ProductVO(),ProductVO("TV",500000))
    for (pvo in arr){
        println("${pvo.pname}, ${pvo.price}")
    }
    
    //위와 동일하지만 함수를 사용해서 만듬
    fun create(arr:Array<ProductVO>){
        for (pvo in arr){
            println("---------create----------")
            println("${pvo.pname}, ${pvo.price}")
        }
    }
    create(arrayOf(ProductVO(),ProductVO("TV",500000)))

    fun create2(list:ArrayList<ProductVO>){
        println("-----------create2()------------")
        list.forEach{println("${it.pname}, ${it.price}")}
    }
    create2(arrayListOf(ProductVO(),ProductVO("TV",500000)))

    //data class는 동일타입, 동일 데이터일때 같은 객체가 됨
    println(ProductVO() == ProductVO("TV",500000))
    println(ProductVO(pname="Fan") == ProductVO(price = 44444))
    println(ProductVO() == ProductVO())

}

data class ProductVO(var pname:String = "notebook", var price:Int = 1000000)