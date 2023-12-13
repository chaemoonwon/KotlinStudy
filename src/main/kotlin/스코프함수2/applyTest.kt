package 스코프함수2

import 스코프함수.Book

//let/also
//also, let이 있음, also, let의 공통된 차이점은 it키워드를 사용해 객체 변수를 참조한다는 것

//run = let


fun main() {
    var price = 5000
    var a = Book2("a",20000)
//    a.run{
//        //20000원이 출력되야 하지만 main문의 price가 스코프 우선순위가 높아 5000원 출력
//        println(price)
//    }

    // it으로 사용되는 스코프 함수
    // 마지막 구문이 호출되는 것을 확인
    a.let {
        println(it.price)
    }

}

class Book2 constructor(var name:String, var price:Int) {


}