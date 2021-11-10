package factorymethod

import factorymethod.delivery.CarDelivery
import factorymethod.delivery.Delivery
import factorymethod.delivery.TruckDelivery

class App {

    private lateinit var delivery: Delivery

    fun doDeliveryBy(transport: String) {
        this.delivery = getDelivery(transport)

        val cost = delivery.deliveryCost()

        println("The cost to delivery is $cost")
    }

    private fun getDelivery(transport: String): Delivery {
        return when (transport) {
            "car" -> CarDelivery()
            "truck" -> TruckDelivery()
            else -> throw IllegalArgumentException("Transport not supported")
        }
    }

}