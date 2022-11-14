package functions

fun main() {
    print("Result : ${subtract(value2 = 1, value1 = 100)}")
}

fun subtract(): Int? = 0
fun subtract(value3: Int, value4: Long? = 0) = (value4 ?: 0) - value3
//use elvis operator to double-check if null
//kapag null, yung nasa side ng ? ang masusunod
//kapag hindi null, yung nasa side ng : ang masusunod

fun subtract(value1: Int, value2: Int) = value2 - value1


