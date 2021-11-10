package factorymethod.product

class Truck : Transport {
    override fun cost(): Double {
        return 15.0
    }

}