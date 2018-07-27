package Decorations

import Spices.Curry
import Spices.Spice
import android.util.Log

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("Granites")
    Log.d("Decorations : : ", "" + d1)

    val d2 = Decorations("Granites")
    Log.d("Decorations : : ", "" + d2)

    val d3 = Decorations("Granites")
    Log.d("Decorations : : ", "" + d3)


    Log.d("Decorations d1 to d2 ", "" + d1.equals(d2))

    Log.d("Decorations d3 to d2 ", "" + d3.equals(d2))

    //Decomposition
    val d5 = Decorations2("crystal", "wood", "diver")
    val(rock,wood,diver) = d5

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}

data class Decorations(val rocks: String) {
}

data class Decorations2(val rocks: String, val wood : String, val diver : String) {
}


data class SpiceContainer(val spice : Spice){
    val label = spice.name

}


