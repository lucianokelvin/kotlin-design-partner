package singleton

import singleton.aux.OperationHistory

object CalculatorSingleton {

    private const val name = "Calculator"

    private val history: MutableList<OperationHistory> = mutableListOf()

    init {
        println("Singleton $name Started")
    }

    fun sum(n1: Double, n2: Double): Double {
        val result = n1.plus(n2)
        addHistory(n1, "+", n2, result)
        return result
    }

    fun minus(n1: Double, n2: Double): Double {
        val result = n1.minus(n2)
        addHistory(n1, "-", n2, result)
        return result
    }

    fun times(n1: Double, n2: Double): Double {
        val result = n1.times(n2)
        addHistory(n1, "*", n2, result)
        return result
    }

    fun dividedBy(n1: Double, n2: Double): Double {
        val result = n1.div(n2)
        addHistory(n1, "/", n2, result)
        return result
    }

    private fun addHistory(n1: Double, operation: String, n2: Double, result: Double) {
        history.add(OperationHistory(n1, operation, n2, result))
    }

    fun showHistory() {
        history.forEach {
            println(it)
        }
    }

}