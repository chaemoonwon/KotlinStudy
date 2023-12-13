package classTest3

class Pig  {

    var type:String = "하얀돼지"   //property

    lateinit var color:String   //property

//    init {
//
//    }

    constructor(color:String){
        println(color)
    }

    constructor(color:String, model:String){
        println(color + model)
    }


}