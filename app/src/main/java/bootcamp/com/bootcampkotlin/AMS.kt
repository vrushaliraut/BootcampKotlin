package bootcamp.com.bootcampkotlin

import java.util.*

fun main(args : Array<String>){
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and fish eat $food")

    shouldChangeWeather(day, 20 , 50)
    shouldChangeWeather(day)
    shouldChangeWeather(day,dirty = 50)

    if (shouldChangeWeather(day)){
        println("Change the water today")
    }


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

