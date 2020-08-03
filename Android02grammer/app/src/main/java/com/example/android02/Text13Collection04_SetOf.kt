package com.example.android02

import java.util.*
import kotlin.random.Random

fun main() {
    println("===============읽기 전용Set==============")

    //1. 읽기전용 Set : SetOf >> Set
    // 중복허용안함, 순서가 없다.
    val hSet: Set<Any?> = setOf(1, 1, 2, 2, "kim", 3, false, null)
    //추가, 수정, 삭제 불가능 : 읽기전용

    for (item in hSet) {
        print("$item ")
    }
    println()

    println(hSet.filterNotNull())
    println(hSet.filterIsInstance<Int>())  // Int Type의 값만 반환
    println(hSet.filterIsInstance<IntArray>())
    println(hSet.filterIsInstance<String>())
    println(hSet.filterIsInstance<Array<Int>>())

    val hSet2: Set<Int> = setOf(1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3)
    for (item in hSet2) {
        print("$item ")
    }
    println()
    println("alist2.sum() : ${hSet2.sum()}")
    println("alist2.max() : ${hSet2.max()}")
    println("alist2.min() : ${hSet2.min()}")
    println("alist2.first() : ${hSet2.first()}")
    println("alist2.last() : ${hSet2.last()}")

    for (item in hSet2) {
        print("$item ")
    }
    println()

    hSet2.forEach {
        print("$it ")
    }
    println()

    println(('a'..'z').asSequence().toList())
    println(('a'..'z').asSequence().toMutableList())
    println(('a'..'z').asSequence().toSet())
    println(('a'..'z').asSequence().toMutableSet())

    println('a'..'Z')
    println(('a'..'z').toMutableSet()) //Sequence개념이 아닌 range개념

    println(('a'..'z').map { it.toUpperCase() }.toMutableSet())

    val up: Set<Char> = ('a'..'z').map { it.toUpperCase() }.toHashSet()
    println(up)
    // up.add('a') 사용불가
    println(up.all { it.isUpperCase() }) // all 모두 만족 -> true
    println(up.any { it.isLowerCase() }) // any 하나라도 만족 -> true
    println()
    println(('a'..'z').all { it.isLowerCase() }) // all 모두 만족 -> true
    println(('a'..'z').any { it.isLowerCase() }) // any 하나라도 만족 -> true
    
    //자바 Random
     /*   val random : Random = Random()
    for(i in 0..10){
        print("${random.nextInt(5)} ")
    }*/
    //코틀린 Random
    for (i in 0..10){
        println("${Random.nextInt(5)}")
    }
    println()

}
