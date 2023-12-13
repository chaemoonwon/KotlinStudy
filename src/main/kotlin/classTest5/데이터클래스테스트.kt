package classTest5

fun main() {
    // 읽기 전용
//    val va = A("a", 123)

    // 주소가 서로 다른 것을 확인
//    println(va)
//    println(A("a",123))
//
//    println(va == A("a",123)) // 주소가 다르므로 false값이 나오는 것을 확인

    // 데이터 클래스는 값이 나오는 것을 확인
    // 클래스가 틀로써의 역할을 함
    val vb=B("b",123)
    println(vb)
    val vb2= B("b",123)
    println(vb2)


    // 데이터 값은 서로 같으므로 true값이 나오는 것을 확인
    println(vb == B("b",123))


}

//데이터 클래스(간단한 값의 저장 용도)

class A constructor(val name:String, val id:Int){

}

data class B constructor(val name:String, val id:Int){

}