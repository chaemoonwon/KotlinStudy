package classTest4

class Pig3 {


    //companion object 블록으로 감싸주면 생성과정 없이 오브젝트처럼 사용
    companion object {
        var name: String = "None"


        fun printname1() {
            println("${name}")
        }
    }


    // 호출하는 메서드
    fun walk() {
        println("돼지가 걸어요")
    }
}