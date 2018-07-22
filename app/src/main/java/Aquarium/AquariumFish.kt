package Aquarium

import android.util.Log

/* The function which is common for each fish - Eat and Have color
*   We can achieve it using two ways 1. Abstract Classes And  2. Interfaces
*   Both Interfaces and Abstarct classes can not instantiate by ourselfs -
*   Difference- Abbstract Class have Constructors while interfaces don't have any constructor logic
*
*   How to use it correct?
*   Use  Interface- When you have lot of classes and one or two function classes
*   Use Abstract Classes :- when you can't complete  a class example: -
*
* */

abstract class AquariumFish{
    abstract val color : String
}

//Now  we can use this sub- class like any  other class
class Shark : AquariumFish() ,FishAction{
    override fun eat() {
        Log.d("","Hunt and Eat")
    }

    override val color: String = "Grey"
}


/* Used Inteface delegation - FishColor by GoldColor -
*  Its lets you use Compositions to plug in behaviours
* */
class Plecostomus(fishColor: FishColor = GoldColor): AquariumFish() ,
        FishAction by PrintingFishAction("A lot of algae")
        ,FishColor by GoldColor

interface FishAction{
    fun eat()
}
interface FishColor{
    val color : String
}

//No way to make instantce of this class - this is called singletone instance of this class
object GoldColor : FishColor{
    override val color = "gold"
}

object RedColor :FishColor{
    override val color = "red"
}

class PrintingFishAction(val food : String) : FishAction{
    override fun eat() {
        Log.d("Printing Action Food : ","Food")
    }
}