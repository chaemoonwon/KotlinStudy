package classTest4

class Pig {

    var name:String = "Pinky"

    // lateinit : 미리 선언(Null 값을 입력)하고 초기화(다른 메서드에 값을 입력) 하는 방식
    lateinit var color:String

    fun printname() {
        println("${name}")
    }

}