package Aquarium5

import android.annotation.SuppressLint
import android.util.Log
import java.util.function.Function

fun InlineFishExample() {
    val fish = Fish("gold fish")

    /* One problem with this functions is
        Every-time time you call this function it create new object of high order
        Lambdas are Objects
        Lambda expression is instance of function interface, which is itself a subtype of object


    * */
    myInlinewith(fish.name, @SuppressLint("NewApi")
    object : Function<String,Unit>){
        override fun invoke(name: String){
            Log.d("Actual High order: ",""+name.capitalize())
        }

    }
}
inline fun myInlinewith(name: String, block: Function<String, Unit>, function: () -> Unit){
    name.block()
}