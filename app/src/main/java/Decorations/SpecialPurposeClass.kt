package Decorations

//Object class
object Mobidick{
    val author = "sdsd"
    fun jump(){

    }
}

//Define class- you can give them property or methods
enum class Color(val rgb : Int){
    Red(0xFF000),
    Green(0xFF000),
    Blue(0xFF000)
}

//Sealed class - special class
// It's a class that can be subclassed but only inside a filed which is declared
//if you try to subclass it in different file, you will get an error

//** greate for returning success or error from API Network
sealed class Seal

//both type of Seal - as all are in same class kotline file know it's Subclass
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal):String{
    return when(seal){
        is SeaLion -> "Sealion"
        is  Walrus -> "walrus"
    }
}




interface SpiceColor {
    val color: Spices.Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Spices.Color
        get() = color.Yellow
}

//Making Spice a sealed class helps keep all the spices together in one file.
sealed class Spice()


