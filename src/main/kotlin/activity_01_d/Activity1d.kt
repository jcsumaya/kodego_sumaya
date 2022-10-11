package activity_01_d

import kotlin.system.exitProcess

//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
// It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.

fun main() {
    var amount:Int? = null
    println("Input 5 monetary amounts:")
        amount = readln().toInt()
        amount += readln().toInt()
        amount += readln().toInt()
        amount += readln().toInt()
        amount += readln().toInt()

    print("Divide the value by how many?: ")
        var divisor = readln().toIntOrNull()
            if (divisor == null) {
                print ("Please input a valid integer next time.")
            }
            else {
                var sum = amount.div(divisor)
                print("Answer: $sum")
            }
}