package Aquarium

import android.util.Log

/* The function which is common for each fish - Eat and Have color
*   We can achieve it using two ways 1. Abstract Classes And  2. Interfaces
*   Both Interfaces and Abstract classes can not instantiate by ourselfs -
*   Difference- Abstract Class have Constructors while interfaces don't have any constructor logic
*
*   How to use it correct?
*   Use  Interface- When you have lot of classes and one or two function classes
*   Use Abstract Classes :- when you can't complete  a class example: -
*
* */

/*String example: - Need for Abstract Classes :-
Only one strong difference -
Difference- Abstract Class have Constructors while interfaces don't have any constructor logic
both interfaces and abstract classes can contain implementation of methods
in interfaces we call them - default implementations
The big difference is When and how you use them ?

Use Interface when you have lot of methods and one and two default implementations

example: -
interface AquariumAction{
    fun eat()
    fun jump()
    fun clean()
    fun swim(){
     println("Swim")
     }
}

use an abstract class any time you can't complete a class

interface FishAction{
    fun eat()
}

abstract class AquariumFish : FishAction{
    abstract val color : String
    override fun eat(){
        println("Yum")
    }
}

Making all Aquarium Fish implement FishAction,
we can provide default implementation for "eat" while leaving color abstract,
that's because there isn't really good color for fish

*/


/*
* The practical side of abstract classes is that you can
* encapsulate a part of implementation that works with the state,
* so that it cannot be overridden in the derived classes.
*
*
* In an interface, you can only define a property without a backing field,
 * and an implementation class must override that property
 *
 *
 * Apart from that, abstract classes can have non-public API (internal, protected) and final members
 * , whereas interfaces cannot (they can only have private members,
  * which can be used in the default implementations), and all their default implementations
   * can be overridden in the classes.
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


/* Used Interface delegation - FishColor by GoldColor -
Interface delegation  - Lets you add features to class via composition
Composition is - When you use and instance of another class as  opposed to inheriting from it.
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