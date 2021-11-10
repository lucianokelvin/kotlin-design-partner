package factorymethod.delivery

import factorymethod.product.Car
import factorymethod.product.Transport

class CarDelivery : Delivery() {

    override fun createTransport(): Transport {
        return Car()
    }
}