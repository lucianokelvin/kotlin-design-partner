package factorymethod.delivery

import factorymethod.product.Transport
import factorymethod.product.Truck

class TruckDelivery : Delivery() {

    override fun createTransport(): Transport {
        return Truck()
    }
}