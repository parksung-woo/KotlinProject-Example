package com.example.android02

fun main() {
    println("===============읽기 전용Set, 변경가능한 Set목록===============")

    //1. 변경가능한 Set : hashSetOf, mutableSetOf >> HashSet, MutableSet
    // 중복허용안함, 순서가 없다.
    //val hSet:HashSet<Any?> = hashSetOf(1,2,"kim",3,false,null,IntArray(3), arrayOf(1,2,3))
    val hSet:MutableSet<Any?> = mutableSetOf(1,1,2,2,"kim",3,false,null)
    //인덱스가 없으니 수정개념이 아니고 삭제 후 다시 입력
    hSet.add(33)
    hSet.add("yangseem")
    hSet.remove(99)

    for(item in hSet){
        print("$item ")
    }
    println()

    println(hSet.filterNotNull())
    println(hSet.filterIsInstance<Int>())  // Int Type의 값만 반환
    println(hSet.filterIsInstance<IntArray>())
    println(hSet.filterIsInstance<String>())
    println(hSet.filterIsInstance<Array<Int>>())

    val hSet2:HashSet<Int> = hashSetOf(1,2,3,1,2,3,1,2,3,1,2,3)
    for(item in hSet2){
        print("$item ")
    }
    println()
    println("alist2.sum() : ${hSet2.sum()}")
    println("alist2.max() : ${hSet2.max()}")
    println("alist2.min() : ${hSet2.min()}")
    println("alist2.first() : ${hSet2.first()}")
    println("alist2.last() : ${hSet2.last()}")

    for(item in hSet2){
        print("$item ")
    }
    println()

    hSet2.forEach{
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

    val up:HashSet<Char> = ('a'..'z').map { it.toUpperCase() }.toHashSet()
    println(up)
    up.add('a') // 영문소문자를 하나 추가했다.
    println(up.all { it.isUpperCase() }) // all 모두 만족 -> true
    println(up.any { it.isLowerCase() }) // any 하나라도 만족 -> true
    println()
    println(('a'..'z').all { it.isLowerCase() }) // all 모두 만족 -> true
    println(('a'..'z').any { it.isLowerCase() }) // any 하나라도 만족 -> true

}
