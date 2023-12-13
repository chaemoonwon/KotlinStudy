package classTest4

// object 기존 JAVA에서 static이랑 비슷하다 생각하면 됨.

// 객체가 하나만 필요해서 사용하는 경우에 쓰는 키워드 -> 싱글톤 패턴
object Pig2 {

    var name:String = "Pinky2"

    fun printname() {
        println("${name}")
    }

}