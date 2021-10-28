package factory.aux

import factory.Delivery
import factory.aux.vehicles.Motocycle
import factory.aux.vehicles.Vehicle

class MotocycleDelivery : Delivery() {
    override fun createVehicle(): Vehicle {
        return Motocycle()
    }
}