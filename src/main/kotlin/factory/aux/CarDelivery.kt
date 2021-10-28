package factory.aux

import factory.Delivery
import factory.aux.vehicles.Car
import factory.aux.vehicles.Vehicle

class CarDelivery : Delivery() {
    override fun createVehicle(): Vehicle {
        return Car()
    }
}