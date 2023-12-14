package 스코프함수2

fun main() {

    var fruits = mutableListOf("Apple","Banana")
     val afterFruits = fruits.let{
        it.add("Melon")
        it.count()
    }

    println(afterFruits)
}