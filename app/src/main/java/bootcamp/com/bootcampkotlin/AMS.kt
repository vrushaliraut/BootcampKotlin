package bootcamp.com.bootcampkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import java.util.*

class AMS : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
    }
}

fun main(){
    //Lambdas
    lamdaExample()
    lamdaExample2()
    feedTheFish()
    eagerExample()
}

fun lamdaExample2() {
   val numbers = listOf(1..12)
   val rollDice = { sides : Int -> numbers[Random().nextInt(12)] }

   val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gamePlay1(rollDice)
    gamePlay(rollDice2(4))
}

fun gamePlay(rollDice2: Int) {
    println(rollDice2)
}

fun gamePlay1(rollDice: (Int) -> IntRange) {
    println(rollDice)
}


/*Lamdas  - an expressions which declares functions
* anonymous Functions
* Function Literals
*
* Kotlin prefers Function argument to e last parameter*/
fun lamdaExample() {
    swim()
}

val swim = {Log.d("","Smimmm")}
var dirty = 20
val waterFilter: (Int) -> Int = { dirty : Int -> dirty / 2 }
fun feedFish(dirty: Int) = dirty + 10
fun updateDirty(dirty: Int, operation : (Int) -> Int) : Int{
    return operation(dirty)
}

fun eagerExample() {
    val decorations = listOf("Plates","Paan", "abs", "pp", "paper")
    val eager = decorations.filter { it[0] == 'p' }
    Log.d("eager: ","$eager")

    //apply fiter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    Log.d("filtered: ","$filtered")
    Log.d("filtered list: ","$filtered.toList()")

    //Apply map lazily
    val lazyMap = decorations.asSequence().map {
        Log.d("Map: ","$it")
    }

    Log.d("lazyMap: ", "$lazyMap")
    Log.d("first:"," ${lazyMap.first()}")
    Log.d("first:"," ${lazyMap.toList()}")

}


fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    Log.d("","Today is $day and fish eat $food")

    shouldChangeWeather(day, 20 , 50)
    shouldChangeWeather(day)
    shouldChangeWeather(day,dirty = 50)

    if (shouldChangeWeather(day)){
        Log.d("","Change the water today")
    }
    //Call Dirty processor
    dirtyProcessor()
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)

    //Feedfish is function and not a lambda so
    dirty = updateDirty(dirty, ::feedFish)

    //Using this syntax we can write down function which look like built in
    dirty = updateDirty(dirty, { dirty -> dirty + 50 })
}

fun shouldChangeWeather(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    return when{
       isTooHot(temperature) -> true
       isDirty(dirty)  -> true
       isSunday(day) -> true
       else -> false
   }
}

/* Expensive function for declaration - Examples are reading file, Allocating memory
    Default parameters are evaluated at "Call time" in kotlin
 */
fun makeNewAuarium() = println("Building new aquarium..")
fun aquariumStatusReport(aquarium : Any = makeNewAuarium()){

}

/*Single ' ' -> character , Double " " -> Strings */

//Compact function :- Simplify
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun getDirtySensorReading() = 20

fun fishFood(day: String): String {
    var food = "Fasting"

    when(day){
        "Monday"     -> food = "Falkes"
         "Tuesday"   -> food = "Pillets"
        "Wednesday"  -> food = "Redworms"
        "Thursday"   -> food = "Granules"
        "Friday"     -> food = "Rice"
        "Saturday"   -> food = "Fishfood"
        "Sunday"     -> food = "abc"
    }
    return food
}

fun randomDay(): String {
    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}

