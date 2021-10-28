package factory.aux.vehicles

class Car : Vehicle() {

    override fun deliveryCost(distance: Double): Double {
        return distance * 2.5
    }
}