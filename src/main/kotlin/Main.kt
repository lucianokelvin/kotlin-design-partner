import singleton.CalculatorSingleton

fun main(args: Array<String>) {
    val firstCalc = CalculatorSingleton.getInstance()
    val secondCalc = CalculatorSingleton.getInstance()

    firstCalc.sum(12.0, 8.0)
    firstCalc.minus(12.0, 8.0)

    secondCalc.times(4.0, 5.0)
    secondCalc.dividedBy(12.0, 4.0)

    firstCalc.showHistory()
}