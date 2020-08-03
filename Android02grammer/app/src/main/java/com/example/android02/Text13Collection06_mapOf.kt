package com.example.android02

import java.util.*
import kotlin.collections.HashMap
import kotlin.random.Random

fun main() {
    println("===============읽기 전용Map==============")

    //2. 읽기 전용 map : mapOf >> Map
    // key중복허용안함(value는 중복허용), 순서가 없다.
    val map:Map<Any,Any?> = 
        mapOf("key1" to "kim","key2" to 100,"key3" to 100, 1 to 111)
    
    println("map.size : ${map.size}")
    println("map.key : ${map.keys}")
    println("map.values : ${map.values}")
    println("map.get : ${map.get("key1")}")
    println("map.get : ${map.get("key2")}")
    println("map.get : ${map.get(1)}")
    println("map.get : ${map.get(2)}")    //인덱스를 가지고 오는 것이 아니고 해당key가 있을 경우 값을 가지고 온다.

    /*   추가,수정,삭제 불가
    // key to value 추가 
    map.put("key4",Array(4,{i -> i}))
    // key to value 수정 -> replace(version없으므로) put으로 덮어씁
    //map.replace("key1","yangssem")
    map.put("key1","yangssem")
    // 삭제(유니크한 key의 이름을 가지고 삭제)
    map.remove("key3")*/

    println(map) //map확인
    println("----------------------")
    for( key in map.keys){
        print(("${map.get(key)} "))
    }
    println()

    for( param in map){
        println("${param.key}:${param.value}  ")
    }
    println()

    //filterValues
    println(map.filter { it == null })
    println(map.filter { it != null }) // it = key
    println(map.filterValues { it != null })
    println(map.filterValues { it is String })
    println(map.filterValues { it is Int })
    println(map.filterValues { it is Array<*> })
    println(map.filterValues { it is IntArray })

    //mapValues
    println(map.mapValues { it.value.toString()+"%%" })
    println(map.mapValues {
        if(it.value is String){
            it.value.toString()+"hello"
        } else if (it.value is Int){
            it.value.toString()+"%%"
        } else it.value
        })
    println("---------------------------------")
    //Pair (ex. One Pair, two Pair)
    val p1 = Pair<String,String>("name1","Yang1")
    val p2 = Pair<String,String>("name2","Yang2")
    val p3 = Pair<String,String>("name3","Yang3")
    val p4 = Pair<String,String>("name4","Yang4")

    var pMap:Map<String, String> = mapOf(p1,p2,"name5" to "Yang5")
    pMap = pMap.plus(p3)  //plus -> val:상수에서는 사용 불가
    pMap = pMap.plus(p4)
    println(pMap)

}


