package bootcamp.com.bootcampkotlin

/* for both we can assign value but const determine val
    1. Declared on top
    2. Work with on object and not with regular class declared as class
    3. To define constnat inside the class, You have to wrap them inside companion object
    4. Difference between - Companion Object and Regular Object
    5. Companion Object - Initialised from the static constructors,
                        i.e they are created when object is created
    6. Regular Object - Plain objects are initialized lazily on the first access to that object
                       i.e when they are first used

    7. Wrap constants in classes inside the companion object

    8. When we should use constant, an enum, and a data class?
 */
const val num = 6
val number = 3

class myClass {

    companion object {
        const val CONSTANT = "constant inside companion"
    }
}


/* 1. enum :- Storing simple values without any functionality
      example - URL, numeric code

   2. Constants :- They are objects that store groups of values that are related.
                    They offer type safety.

   3. data classes :- Creating objects that only have properties without additional functionality.
* */

//constant
const val MAX_NUMBER_BOOKS = 20

class Book {

    fun canBorrow(user: User): Boolean {
        return user.hasBooks < MAX_NUMBER_BOOKS
    }

    object Constants {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    //companion object
    companion object {
        const val BASE_URL = "www.bookganga.com"
    }

    fun printUrl() {
        println(Constants.BASE_URL  + ".html")
    }
}

//Data class
data class User(val hasBooks : Int = 3, val book : String)
