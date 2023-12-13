fun main() {

    //이뮤터블 컬렉션
    //크기와 값 변경 X
    var immutableList:List<Int> = listOf<Int>(1,2,3)

    println(immutableList[0])
    //listOf 리스트 자체에 변경을 할 수 없음
//    immutableList.add

//    immutableList[0].set이 없음
    println("==========================")


//    var mutableList = mutableListOf(1,2,3)
//
//    //mutableListOf 리스트 자체에 변경을 할 수 있음
//    println(mutableList[0])
//
////    mutableList[0]=4
//
//    mutableList.add(0,5)
//
//    println(mutableList[0])
////
////    mutableList.set(2 , 8)
////
////    for(i in 0..2) {
////        println(mutableList[i])
//    }

    //mutableSet
    //리스트에서 인덱스가 빠진 데이터 타입
    var mutableSet = mutableSetOf(1,2,1,3)

    // mutableSetOf set자체에 변경할 수 있음
    // 값을 중복해서 넣을 수 없다

    println(mutableSet)


    //mutableMap
    //키와 값을 쌍으로 갖는 데이터 타입
    var mutableMap = mutableMapOf<String, String>()

    mutableMap.put("1","one")
    mutableMap.put("2","two")
    mutableMap.put("3","three")

    println("${mutableMap.get("1")}")

}