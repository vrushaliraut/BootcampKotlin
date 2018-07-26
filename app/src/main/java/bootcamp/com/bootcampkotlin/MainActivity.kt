package bootcamp.com.bootcampkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val collection = Collections()

        //enum, constants, data classes
        val constant = Book()

        //Extension Functions
        val puppy = Puppy()
    }
}
