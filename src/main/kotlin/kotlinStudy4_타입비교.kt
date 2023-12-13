fun main() {

    // Any class
    // The root of the Kotlin class hierarchy.
    // Every Kotlin class has Any as a superclass.

    var a: Any = 1

    // is 타입이 같은지
    if(a !is Int) {
        println("int")
    }
    if(a !is Double) {
        println("int #")
    }

}