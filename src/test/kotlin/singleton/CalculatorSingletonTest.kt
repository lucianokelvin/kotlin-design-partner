package singleton

import org.junit.Test
import kotlin.test.assertEquals

internal class CalculatorSingletonTest {

    @Test
    fun sum() {
        val instance = CalculatorSingleton.getInstance()
        assertEquals(instance.sum(3.0, 5.0), 8.0)
    }

    @Test
    fun minus() {
        val instance = CalculatorSingleton.getInstance()
        assertEquals(instance.minus(10.0, 5.0), 5.0)
    }

    @Test
    fun times() {
        val instance = CalculatorSingleton.getInstance()
        assertEquals(instance.times(3.0, 5.0), 15.0)
    }

    @Test
    fun dividedBy() {
        val instance = CalculatorSingleton.getInstance()
        assertEquals(instance.dividedBy(10.0, 5.0), 2.0)
    }

    @Test
    fun checkSingleton() {
        val instance1 = CalculatorSingleton.getInstance()
        val instance2 = CalculatorSingleton.getInstance()

        assertEquals(instance1.hashCode(), instance2.hashCode())
    }
}