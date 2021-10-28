package factory.aux.vehicles

class Bicycle : Vehicle() {

    override fun deliveryCost(distance: Double): Double {
        return distance * 1.1
    }

}