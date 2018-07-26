package bootcamp.com.bootcampkotlin

import android.util.Log

fun Collections(){

    collectionOperators()

    mapOperators()

    practiceExample()
}

fun practiceExample() {

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespere" to allBooks)
    Log.d("Use Of any operator ::",""+ library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    Log.d("Use Of getOrPut operator ::",""+ moreBooks)
}

fun mapOperators() {
    /*Map operators */
    val veggiesMap = mapOf("Spinach"  to "Green Veggie", "Tomato" to "Soup","legumes" to "Sproutes")

    Log.d("Greeny",""+ veggiesMap.get("Spinach"))

    //GetOrDefault Operator
    //Log.d("GetOrDefault",""+ veggiesMap.getOrDefault(key = "Spinach" ,defaultValue =  "Not available"))

    //getOrElseOperator

    Log.d("GetOrElseOperator",""+ veggiesMap.getOrElse("legumes" ) {"Not available"})
}

fun collectionOperators() {
    /*Collection operators */
    val veggies = mutableListOf("Spinach","fregunated seeds", "Tomato","legumes")

    Log.d("Add Collection: ",""+veggies.add("Coriender leaves"))

    Log.d("Remove Collection: ",""+veggies.remove("Coriender leaves"))

    Log.d("Contains Collection: ",""+veggies.contains("Tomato"))

    Log.d("Remove Collection: ",""+veggies.contains("aa"))

    Log.d("Sublist",""+veggies.subList(3, veggies.size))

    Log.d("Sum",""+ listOf(1,2,3).sum())

    Log.d("Sum By",""+ listOf("q","ww","a").sumBy { it.length }) //Takes up lambda and defined

}
