package factory.aux

import factory.Delivery
import factory.aux.vehicles.Bicycle
import factory.aux.vehicles.Vehicle

class BicycleDelivery : Delivery() {
    override fun createVehicle(): Vehicle {
        return Bicycle()
    }
}