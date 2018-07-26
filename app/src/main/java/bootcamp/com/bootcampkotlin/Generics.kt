package bootcamp.com.bootcampkotlin

import android.util.Log

open class WaterSupply(var needProcessed : Boolean)

class TapWater :WaterSupply(true){
    fun addChemicalCleaners(){
        needProcessed = false
    }
}

class FishstoreWater :WaterSupply(false)

class LakeWater :WaterSupply(true){
    fun filter(){
        needProcessed = false
    }
}

class Aquarium1<T>(val WaterSupply : T)

//Kotlin does have type interference
fun genericsExample(){
   // val aquarium  = Aquarium1<TapWater>(TapWater())
    val aquarium  = Aquarium1(TapWater())
    aquarium.WaterSupply.addChemicalCleaners()
    isWaterClean(aquarium)
}

//generic Function
fun <T:WaterSupply> isWaterClean(aquarium: Aquarium1<T>){
    Log.d("Is Water clean","${aquarium.WaterSupply}")
}