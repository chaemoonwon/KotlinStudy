package classTest5

fun main() {


    //변수의 초기화 시점을 사용할 때 초기화 해주는 키워드
    //lazy는 입력값을 변경할 수 없다.
    val num:Int by lazy {
        println("초기화")
        7
    }

    println(num)
}