package bootcamp.com.bootcampkotlin

import android.util.Log
import java.util.*

/* Extension Functions
    1. Work as a util
    2. Helpful functionality to classes which you don't own

    3. You can also use it to separate the core API from helper method on classes
    which you don't own

    4. Extension function are defined outside the class they extend,
    don't have access to private

    5. Extension Properties :- 1.apply
* */
fun String.hasSpace() = find {it == ' '} != null

fun ExtensionExample(){
    "Does it have spaces?".hasSpace()
}

class Aquarium(val color : String, private  val size : Int)

fun Aquarium.isRed() = color == "red" // helper function

//fun Aquarium().isBig() = size > 50  // private can not access

//Practice session
 /*
 *  Here we defined Expension functions, and used extension function in puppy class
 *  We use "Data classes" to store the Bookies values
 * */

fun Bookies.weight() : Double { return (pages * 1.5) }

fun Bookies.torn(torn : Int){
    if (pages >= torn){
        pages = pages - torn
    }else{
        pages = 0
    }
}

class Puppy {

    val book = Bookies("Oliver Twist", "Charles Dickens", 1837, 540)

    val puppyPlay = Puppy()

    fun Puppy(){
        while (book.pages > 0) {
            playWithBook(book)
            Log.d("","${book.pages} left in ${book.title}")
        }
        Log.d("Sad puppy, no more pages in ","${book.title}")
    }

    private fun playWithBook(book: Bookies){
        book.torn(Random().nextInt(12))
    }

}

data class Bookies(val name : String, val title : String, var pages : Int, var count : Int)