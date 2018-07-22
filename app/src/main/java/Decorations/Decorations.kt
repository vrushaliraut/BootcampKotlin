package Decorations

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class Decorations : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    fun main(args: Array<String>) {
    }
    makeDecorations()

}



fun makeDecorations() {
    val d1 = Decorations("Granites")
    Log.d("Decorations : : ",""+d1)

    val d2 = Decorations("Granites")
    Log.d("Decorations : : ",""+d2)

    val d3 = Decorations("Granites")
    Log.d("Decorations : : ",""+d3)


    Log.d("Decorations d1 to d2 : : ",""+d1.equals(d2))

    Log.d("Decorations d3 to d2 : : ",""+d3.equals(d2))
}
data class Decorations(val rocks : String){

}