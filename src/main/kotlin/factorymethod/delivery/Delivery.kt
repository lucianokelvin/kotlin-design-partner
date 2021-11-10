package factorymethod.delivery

import factorymethod.product.Transport

abstract class Delivery {

    abstract fun createTransport(): Transport

    fun deliveryCost(): Double {
        val transport = createTransport()
        val tax = 1.3
        val total = transport.cost() + tax

        return total
    }

}