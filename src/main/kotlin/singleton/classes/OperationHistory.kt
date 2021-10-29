package singleton.classes

data class OperationHistory(val n1: Double, val operation: String, val n2: Double? = null, val result: Double) {

    override fun toString(): String {
        return "$n1 $operation $n2 = $result"
    }
}