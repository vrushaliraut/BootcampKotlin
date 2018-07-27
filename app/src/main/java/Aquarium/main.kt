package Aquarium

import android.util.Log

fun main(args: Array<String>){



}

fun buildAquarium(){
    val myAquarium = Aquarium()
    Log.d("Length : ","${myAquarium.height} , ${myAquarium.width}, ${myAquarium.length}")

}

class SimpleSpice(){
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5 }
}

class Spice(val name: String, val spiciness : String = "mild"){
     val heat: Int
    get() {
        return when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }
    }
 }

