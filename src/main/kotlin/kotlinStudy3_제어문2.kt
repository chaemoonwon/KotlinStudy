fun main() {


    // switch case : 해당 값이 정확히 일치할 경우 처리

    // 코틀린의 when문은 다른 언어와 다르게 같은 값도 처리 뿐만 아니라 범위 값도 처리

    // 문법
//    when(파라미터) {
//
//        비교값1 -> {변수값이 비교값1과 같다면 이 영역이 실행}
//        비교값2 -> {변수값이 비교값2과 같다면 이 영역이 실행}
//        else -> {변수값이 비교한 값들과 다르면 이 영역이 실행}
//    }

    //범위(in ..)
//    var score = 60
//
//    when(score) {
//        in 90 .. 100 -> {
//            println("A")
//        }
//        in 80 .. 89 -> {
//            println("B")
//        }
//        in 70 .. 79 -> {
//            println("C")
//        }
//        else -> {
//            println("D")
//        }
//    }

    //정확한 값(,)
    //정확한 값을 여러개 사용 가능
//    var score = 70
//
//    when(score) {
//        90, 100 -> {
//            println("A")
//        }
//        80, 89 -> {
//            println("B")
//        }
//        70, 79 -> {
//            println("C")
//        }
//        else -> {
//            println("D")
//        }
//    }

    // when 다음에 오는 괄호를 생략하고 마치 if문 처럼 사용 가능
    var currentTime = 6

    when {
        currentTime == 5 -> {
            println("5시")
        }

        currentTime > 5 -> {
            println("5시가 넘음")
        }

        else -> {
            println("현재 시간은 5시 이전입니다.")
        }
    }


}