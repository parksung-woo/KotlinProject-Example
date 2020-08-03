package com.example.android02

import androidx.annotation.ArrayRes
import java.util.*
import java.util.Arrays.deepToString

fun main() {
    println("===============다차원 배열===============")

    //[["kim","lee","han"],["kim","lee","han"]]
    var sus1:Array<String> = arrayOf("kim","lee","han")
    var sus2:Array<String> = arrayOf("kim","lee","han")
    var suss:Array<Array<String>> = arrayOf(sus1,sus2)
    println(Arrays.toString(suss))
    suss.forEach {
        it.forEach(
            {print("$it ")}
        )
        println()
    }
    println("-----------")
    println(Arrays.deepToString(suss))


        //[["kim1","lee1","han1"],["kim2","lee2","han2"]]
        // -> 배열의 값을 초기화시키고 새로 arrayOf로 추가한다.

    println("---------------------")
        //강사님 코드
        val suss2: Array<Array<String?>?> =
            arrayOfNulls<Array<String?>>(2) //arrayOfNulls : 원하는 만큼 null값을 추가한다.

        for (i in 0 until suss2.size) {
            suss2[i] = arrayOf("kim${i + 1}", "lee${i + 1}", "han${i + 1}")
        }
        println(Arrays.deepToString(suss2))
        println(Arrays.deepToString(suss2[0]))  // [0]번 방꺼만 출력

    println(suss2.contentDeepToString())
    println(suss2[0]!!.contentDeepToString())     //!! : non null   [0]번 방꺼만 출력

    println(suss2[0]!!.first())
    println(suss2[0]!!.last())
    println()
    println(suss2[0]!!.plus("yangssem").contentDeepToString())

    println(suss2[0]!!.indexOf("lee1"))  //lee1의 인덱스 위치를 찾는명령어 : indexOf

    var newNames= suss2[0]!! + suss2[1]!!
    println((suss2[0]!! + suss2[1]!!).contentToString())  //lee1의 인덱스 위치를 찾는명령어 : indexOf

    newNames.sort()   //오름차순  -> 반환값이 없음 : 오름차순으로 기존 데이터 변경
    println(newNames.contentToString())        // 원본을 바꾸고 싶지 않고 결과만 보여주는 것은  sorted
    newNames.reverse()  //내림차순
    println(newNames.contentToString())


}
