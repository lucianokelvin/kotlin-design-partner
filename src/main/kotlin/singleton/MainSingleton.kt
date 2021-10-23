package singleton


fun main(args: Array<String>) {
    CalculatorSingleton.sum(12.0,10.0)
    CalculatorSingleton.minus(12.0,8.0)
    CalculatorSingleton.times(4.0,5.0)
    CalculatorSingleton.dividedBy(12.0,4.0)

    CalculatorSingleton.showHistory()
}