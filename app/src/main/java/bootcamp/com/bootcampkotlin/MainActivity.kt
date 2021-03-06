package bootcamp.com.bootcampkotlin

import Aquarium.*
import Buildings.Brick
import Buildings.Building
import Buildings.Wood
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buildAquarium()

        SpicesExample()

        //Abstarct class and Interface
        makeFish()

        ExamplesPairsAndTriples()

        val testList = listOf(11,12,13,14,15,16,17,18,19,20)
        Log.d("Reverse List : ",reveserList(testList))

    }

    private fun makeFish() {
        val shark = Shark()
        val costomus = Plecostomus()

        Log.d("","Shark : ${shark.color}, Plecostomus : ${costomus.color}")
        shark.eat()
        costomus.eat()
    }

    private fun SpicesExample() {

        val simpleSpice = SimpleSpice()
        println("${simpleSpice.name} ${simpleSpice.heat}")

        val spices1 = listOf(
                Spice("curry", "mild"),
                Spice("pepper", "medium"),
                Spice("cayenne", "spicy"),
                Spice("ginger", "mild"),
                Spice("red curry", "medium"),
                Spice("green curry", "mild"),
                Spice("hot pepper", "extremely spicy")
        )

        val spice = Spice("cayenne", spiciness = "spicy")
        val spicelist = spices1.filter {it.heat < 5}
        fun makeSalt() = Spice("Salt")

    }

    private fun reveserList(testList: List<Int>): String? {
        val result = mutableListOf<Int>()

        for (i in 0..testList.size - 1){
            result.add(testList[testList.size - i - 1])
        }
        return result.toString()
    }

    /*Pair Example: Here is your book The Phoenix Project by Bill
     Triples Example: Here is your book The Phoenix Project by Bill written in 2001
    * */
    private fun ExamplesPairsAndTriples() {
        val book = Book("The Phoenix Project", "Bill", 2001)

        val bookTitleAuthor = book.getTitleAuthor()

        val bookTitleAuthorYear = book.getTitleAuthorAndYear()

        Log.d("Pair Example","Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}" )

        Log.d("Triples Example ","Here is your book ${bookTitleAuthorYear.first} by" +
                " ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    }

    class Book(val title : String, val author : String, val year : Int){

        fun getTitleAuthor() :Pair<String,String>{
            return title to author
        }

        fun getTitleAuthorAndYear() : Triple<String, String, Int>{
            return Triple(title,author,year)
        }
    }
}

open class XBook(val title: String, val author: String) {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, var format: String = "text") : XBook(title, author) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250

        val collection = Collections()

        //enum, constants, data classes
        val constant = Book()

        //Extension Functions
        val puppy = Puppy()

        //Generics
        Building(Wood()).build()

        //Brick does not having companion object so initialised here
        val brick = Brick()
        isSmallBuilding(Building(brick))
        genericsExample()
    }

}

