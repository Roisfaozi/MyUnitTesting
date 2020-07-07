package com.kotlin.myunittesting

class MainViewModel(private val cudboidModel: CudboidModel) {
    fun getCircumference(): Double = cudboidModel.getGetCircumference()

    fun getsurfaceArea(): Double = cudboidModel.getSurfaceArea()

    fun getVolume(): Double = cudboidModel.getVolume()

    fun save(l: Double, w: Double, h: Double) {
        cudboidModel.save(l, w, h)
    }
}