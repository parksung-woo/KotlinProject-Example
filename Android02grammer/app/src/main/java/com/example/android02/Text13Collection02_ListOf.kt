package com.example.android02

import kotlin.random.Random

fun main() {
    println("===============가변 배열(Array List와 같은 개념)===============")
    println("===============읽기 전용목록, 변경가능한 목록(Array List)===============")

    //2. 읽기 전용목록 : ListOf >> <List> Type
    val alist:List<Any?> = listOf(1,2,"kim",3,false,null,IntArray(3), arrayOf(1,2,3))
    // 수정, 추가, 삭제 불가 -> 읽기전용
    //    alist[0] = 100
    //   alist.set(1,99)
    //    alist.add(33)
    //    alist.add("yangseem")
    //   alist.remove(99)
    //   alist.removeAt(0)

    for(item in alist){
        print("$item ")
    }
    println()

    println(alist.filterNotNull())
    println(alist.filterIsInstance<Int>())  // Int Type의 값만 반환
    println(alist.filterIsInstance<IntArray>())
    println(alist.filterIsInstance<String>())
    println(alist.filterIsInstance<Array<Int>>())

    val alist2:List<Int> = listOf(1,2,3,1,2,3,1,2,3,1,2,3)
    for(item in alist2){
        print("$item ")
    }
    println()
    println("alist2.sum() : ${alist2.sum()}")
    println("alist2.max() : ${alist2.max()}")
    println("alist2.min() : ${alist2.min()}")
    println("alist2.first() : ${alist2.first()}")
    println("alist2.last() : ${alist2.last()}")

    val new_alist2 = alist2.sorted() // -> 원본을 수정하기 때문에 sort 사용 불가
    for(item in new_alist2){
        print("$item ")
    }
    println()

    new_alist2.forEach{
        print("$it ")
    }
    println()

    val alist3:List<Double> = listOf(1.1,2.2,3.3)
    for(item in alist3){
        print("$item ")
    }
    println()
    println("---------------------")

    //원본이 읽기전용이어도 복제한 배열에 데이터 추가하는 함수사용가능
    var alist4:List<Int> = listOf(1,2,3)
    println(alist4)
    //alist4.plus(44)  // plus는 원본을 복제하기 때문에 sorted와 같이 사용가는(새로운 배열)
    var new_alist4 = alist4.plus(44)
    println(new_alist4) // 추가 수정은 여전히 불가

    alist4 += 88 //alist4의 변수가 var이어야 변경가능
                 //연산자오버로딩은 가능 var일때
                 //alist4.plus(88)과 동일
    println(alist4)

     val alist5:List<Int> = listOf<Int>(1,2,3,4,5)
    println(alist5)
    println(alist5.toIntArray()) //toIntArray 정수배열로 만들어주는 함수
    val arr:IntArray = alist5.toIntArray()
    println(arr.contentToString())
    arr[0] = 100
    println(arr.contentToString())
    println(arr.toList())   // 결과값은 위와 동일
    
    val newList:List<Int> = arr.toList()
    // newList[1] = 99   ->  수정불가

    println("===================================")
    println(sequenceOf(1,2,3,4,5,6))
    val seqList:List<Int> = sequenceOf(1,2,3,4,5,6).toList()
    println(seqList)
//    println(sequenceOf(1,2,3,4,5,6).toList()) // 수정할 수 없는 List로 만들겠다.

    val seqMutList:MutableList<Int> = sequenceOf(1,2,3,4,5,6).toMutableList()
//    println(sequenceOf(1,2,3,4,5,6).toMutableList()) // 수정할 수 있는 List로 만들겠다.
    seqMutList.add(7)
    seqMutList.add(8)
    println(seqMutList)

    val seqList2:List<Int> = (1..10).asSequence().toList()  //sequenceOf은 값을 직접 집어넣는것이고 asSequence는 범위로 값을 넣는다.
    println(seqList2)
    println((1..10).asSequence().filter { it%2==0}.toList()) //filter안에는 참,거짓의 결과를 가져올수 있는 문장을 표현(ex 짝수출력)
    println((1..10).asSequence().filter { it%2==0}.map { it*10 }.toList()) 
    // 1부터 10까지 asSequence()에서 짝수를 뽑아서 각각 *10을 한 후 수정할 수 없게 리스트로 변경하여 출력

    println(generateSequence (0,{it}))
    println(generateSequence (0,{it}).take(10))
    println(generateSequence (0,{it}).take(10).toList())
    println(generateSequence (0,{it+1}).take(10).toList())
    println(generateSequence (10,{it+2}).take(10).toList())

    val newLIst2 = listOf<Int>(1,2,3,4,5,6)
    println(newLIst2.filter { it%2==0})
    println(newLIst2.map { it*10})

    println(newLIst2.joinToString ("-"))
    println(newLIst2.joinToString ("-","[","]"))
    println(newLIst2.joinToString ("-","[","]",3))
    //List:List<Int> =  null(x)[null(x)] : List도 null일 수 없고, element 도 null 허용 안함
    //List:List<Int?> =  null(x)[null(o)] : List도 null일 수 없고, element 도 null 허용
    //List:List<Int>? =  null(o)[null(x)] : List도 null일 수 있고, element 도 null 허용 안함
    //List:List<Int?>? =  null(o)[null(o)] : List도 null일 수 있고, element 도 null 허용

    val arr2:Array<Int> = arrayOf(1,2,3)
    val arr3:Array<Int> = Array(4,{i -> i})

    val lst:List<Int> = listOf(1,2,3)
    val lst2:List<Int> = List(4,{i -> i})
    val lst3:List<Int> = List(6,{Random.nextInt(1,46)}) // 1~45를 랜덤하게 6개 출력(중복가능)
    println(lst3)

    println(HashSet<Int>(3))
}
