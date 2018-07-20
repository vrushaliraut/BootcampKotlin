package bootcamp.com.bootcampkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
