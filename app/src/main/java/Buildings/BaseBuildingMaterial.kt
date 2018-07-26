package Buildings

import android.util.Log

open class BaseBuildingMaterial{
    open val numberNeeded = 1
}

class Wood() : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick() : BaseBuildingMaterial() {
    override val numberNeeded =8
}


class Building<out T : BaseBuildingMaterial>(val buildingMaterial : T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        Log.d("","$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun numberNeeded() {

}