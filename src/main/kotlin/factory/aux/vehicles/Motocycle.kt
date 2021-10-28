package factory.aux.vehicles

class Motocycle : Vehicle() {

    override fun deliveryCost(distance: Double): Double {
        return distance * 1.5
    }

}