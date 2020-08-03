package com.example.android02

fun main() {
    println("===============가변 배열(Array List와 같은 개념)===============")
    println("===============읽기 전용목록, 변경가능한 목록(Array List)===============")

    //1. 변경가능한 목록 : arrayListOf >> <ArrayList, MutableList> 두가지 Type존재
    val alist:ArrayList<Any?> = arrayListOf(1,2,"kim",3,false,null,IntArray(3), arrayOf(1,2,3)) // IntArray Type 와 array의 Int Type
    //val alist:MutableList<Any?> = mutableListOf(1,2,"kim",3,false,null)  arrayListOf = mutableListOf(동일하게 사용)
    alist[0] = 100
    alist.set(1,99)  // 1번index value = 99로 변경
    alist.add(33)    // 마지막 index value = 33 추가
    alist.add("yangseem")
    alist.remove(99)
    alist.removeAt(0)


    for(item in alist){
        print("$item ")
    }
    println()

    println(alist.filterNotNull())
    println(alist.filterIsInstance<Int>())  // Int Type의 값만 반환
    println(alist.filterIsInstance<IntArray>())
    println(alist.filterIsInstance<String>())
    println(alist.filterIsInstance<Array<Int>>())

    val alist2:ArrayList<Int> = arrayListOf(1,2,3,1,2,3,1,2,3,1,2,3)
    for(item in alist2){
        print("$item ")
    }
    println()
    println("alist2.sum() : ${alist2.sum()}")
    println("alist2.max() : ${alist2.max()}")
    println("alist2.min() : ${alist2.min()}")
    println("alist2.first() : ${alist2.first()}")
    println("alist2.last() : ${alist2.last()}")
    alist2.sort()
    for(item in alist2){
        print("$item ")
    }
    println()

    alist2.forEach{
        print("$it ")
    }
    println()

    val alist3:ArrayList<Double> = arrayListOf(1.1,2.2,3.3)
    for(item in alist3){
        print("$item ")
    }
    println()

    val alist4:ArrayList<Int> = arrayListOf(1,2,3,1,2,3,1,2,3,1,2,3)
    println(alist4)
    println(alist4.toIntArray())
    val arr:IntArray = alist4.toIntArray()
    println(arr.contentToString())

    val newList:MutableList<Int> = arr.toMutableList()
    println(newList)

        
}
