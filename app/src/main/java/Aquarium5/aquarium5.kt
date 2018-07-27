package Aquarium5

import android.util.Log

//TODO Practice session on High order Functions, Lambdas, let
//Writing high order functions with lambdas is the powerful and advanced part in kotlin



data class Fish(var name : String)

fun main(args : ArrayList<String>){
    FishExample()
    highOrderExample()
}

fun List<Int>.divisibleBy(block: (Int) -> Int):List<Int>{
    val result = mutableListOf<Int>()
    for (item in this){
        if (block(item) == 0){
            result.add(item)
        }
    }
    return result
}

fun highOrderExample() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    Log.d("",""+numbers.divisibleBy { it.rem(3)})

}

fun FishExample() {
    val fish = Fish("gold fish")
    //with is higher order function
    with(fish.name){
       Log.d("High order function1: ",""+capitalize())
    }
    mywith(fish.name){
        Log.d("Actual High order: ",""+capitalize())
    }

    /* 1. let - it returns copy of change object
       2. useful for chaining manipulation operation together*/
    fish.let { it.name.capitalize() }

}


/* First parameter is the name as we are passing name to Fish
    Second parameter is the - Function definition for the operation
 *  block is the function name : After colon we specify class we are extending
 *  for usinf String - We need to extend string class and class we used to extend called receiver object
 *  -> finally we specify the return type of function argument , Unit as we are not returning anything*/

//block is now extension function on string object and we can apply it on a string

fun mywith(name: String, block : String.() -> Unit){
    name.block()
}



