package bootcamp.com.bootcampkotlin

class myIntList(){
    fun getPos(pos : Int): Int{ return  0}
    fun addItem(item: Int){}
}

class myShortList(){
    fun getPos(pos : Short): Short{ return  0}
    fun addItem(item: Short){}
}

//generic classes
class myList<T>{

    fun getPos(pos : Int){}
    fun addItem(item: T){}
}

