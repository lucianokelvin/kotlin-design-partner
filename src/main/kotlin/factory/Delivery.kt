package factory

import factory.aux.vehicles.Vehicle


abstract class Delivery {

    abstract fun createVehicle(): Vehicle

    fun calcCost(distance: Double): Double {
        val vehicle = createVehicle()

        val freightCost = vehicle.deliveryCost(distance)
        val profit = 2.0
        val tax = 0.3

        return freightCost + profit + tax
    }
}