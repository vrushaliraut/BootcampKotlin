package bootcamp.com.bootcampkotlin

import Buildings.Brick
import Buildings.Building
import Buildings.Wood
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

        //Generics
        Building(Wood()).build()

        //Brick does not having companion object so initialised here
        val brick = Brick()
        isSmallBuilding(Building(brick))
        genericsExample()
    }

}
