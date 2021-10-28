package factory

import factory.aux.BicycleDelivery
import factory.aux.CarDelivery
import factory.aux.MotocycleDelivery
import factory.exceptions.OptionNotFoundException


fun main(args: Array<String>) {
    val vehicleType = "car"
    val distance = 10.0

    val vehicle = giveMeDelivery(vehicleType)

    println("The delivery cost is ${vehicle.calcCost(distance)}")

}

private fun giveMeDelivery(vehicleType: String) = when (vehicleType) {
    "car" -> CarDelivery()
    "moto" -> MotocycleDelivery()
    "bicycle" -> BicycleDelivery()
    else -> throw OptionNotFoundException()
}