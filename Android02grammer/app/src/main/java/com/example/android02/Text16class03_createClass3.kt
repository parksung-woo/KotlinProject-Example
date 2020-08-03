package com.example.android02

fun main() {
    println("===============create Class3================")

    val score = Test16Score(1,"kim",11,22,33)
    println(score)
    println("총점 : ${score.total()}")

    score.num = 2
    score.name = "lee"
    score.kor = 44
    score.eng = 55
    score.math = 66
    println(score)
    println("총점 : ${score.total()}")
    score.total()
    //println(p.printAll()) 일 경우 리턴값인 void를 함께 호출한다.  kotlin Unit
    score.printAll()
    println("score.sum : ${score.sum}")   // constructor안에 있을 경우 처음에 초기환 된 값이 오브젝트에서 변경되지 않아
                                          // 변경된 데이터를 출력할 수 없다. 때문에 밖에서 선언하고서 이용해야한다.

    val score2 = Test16ScoreData(5,"yang",77,88,99)
    println(score2)   // data class는 자동적으로 toString이 오버라이딩이 되있음
    score2.num = 2
    score2.name = "yang2"
    score2.kor = 22
    score2.eng = 22
    score2.math = 22
    println(score2)  // 데이터 클래스에서도 변경된 데이터를 읽기 위해서는 *get()필요*
}

data class Test16ScoreData constructor(var num:Int,    //constructor : 생성자
                              var name:String ,
                              var kor:Int ,
                              var eng:Int ,
                              var math:Int /*, val sum:Int = kor+eng+math*/
){
    val sum:Int get() = kor+eng+math

    override fun toString(): String {
        return "Test16ScoreData(num=$num, name='$name', kor=$kor, eng=$eng, math=$math, sum=${kor+eng+math})"
    }       //println(score)주소가 나오던 값을 재대로 출력하기 위함
    //generate(alt+insert) >> toString 추가

}


// Test16Score클래스를 정의하시오
// 속성(전역변수:property) : 번호num, 이름name, 국어kor, 영어eng, 수학math
// 기능(함수) : 총점total 반환, 모든 속성 출력하기printAll
class Test16Score constructor(var num:Int,
                              var name:String ,
                              var kor:Int ,
                              var eng:Int ,
                              var math:Int
                              ) {

    fun total():Int= kor+eng+math   //미션이 반환이기 때문에 println은 위에서 사용

    val sum:Int get() = kor+eng+math   // get()은 val변수 사용   *get()만들어야 데이터 변경가능*
                                       // constructor가 아닌 클래스 안으로 추가해야 변경된 데이터를 확인가능
                                       // sum변수에 직접접근하는 것이 아닌 국영수점수에 의해서만 값이 변경되기 때문에 읽기전용 val사용
    fun printAll() = println("번호:${num}, 이름:$name, 국어:$kor, 영어:$eng, 수학:$math")

    override fun toString(): String {
        return "Test16Score(num=$num, name='$name', kor=$kor, eng=$eng, math=$math)"
    }       //println(score)주소가 나오던 값을 재대로 출력하기 위함
            //generate(alt+insert) >> toString 추가


    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
    override fun hashCode(): Int {
        return super.hashCode()
    }
      // equals, hashCode는 값이 같은데 false가 나는 것을 true로 하기위해서 사용
}




