package Spices

import android.graphics.Color.YELLOW


fun main(args: Array<String>){

}

abstract class Spice(val name: String, val spiciness : String = "mild"){
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

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String = "mild", color : Color = CurryColor) :
        Spice(name, spiciness), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }

}


interface Grinder{
    fun grind()
}

interface Color{
    val color : String
}


object CurryColor : Color{
    override val color = "yellow"
}



