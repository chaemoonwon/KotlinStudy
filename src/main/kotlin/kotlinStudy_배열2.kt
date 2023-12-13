
fun main() {

    //기본 타입 배열 선언
    var studnets = IntArray(10)
    var longArray = LongArray(10)
    var charArray = CharArray(10)
    var floatArray = FloatArray(10)
    var doubleArray = DoubleArray(10)

    var intArr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    //문자열 타입 배열 선언
    var strArr = Array(10, {item->"" + "[]"})

    for(i in 0..9) {
        println(strArr[i])
    }
}
