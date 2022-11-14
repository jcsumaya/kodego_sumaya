package activities.activity_01_h
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting
//from the lower number up to the largest number.
//Input:
//1, 4 -> 1, 2, 3
//10 -> 1, 2, 3, 5, 7
fun main() {
    var lowerNumber = 0
    var biggerNumber = 0
    var isPrimeNumber = false
    var primeNumbers = mutableListOf<Int>()

    logger.info { "Input first integer: " }
    var input1 = readln().toInt()
    logger.info { "Input second integer: " }
    var input2 = readln().toInt()

    if (input1 >= input2) {
        biggerNumber = input1
        lowerNumber = input2
    } else {
        lowerNumber = input1
        biggerNumber = input2
    }

    for (int in lowerNumber..biggerNumber) {
        isPrimeNumber = true
        for (divisor in 2 until int) {
            if (int % divisor == 0) {
                isPrimeNumber = false
            }
        }
        if (isPrimeNumber) {
            primeNumbers.add(int)
        }
    }
    logger.info { "Prime Numbers found: $primeNumbers" }
}