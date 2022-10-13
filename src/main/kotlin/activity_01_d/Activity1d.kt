package activity_01_d

//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
// It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.

fun main() {
    println("INPUT 5 MONETARY AMOUNTS")

    print("Input first amount: ")
        var amount1 = readln().toIntOrNull()
            if (amount1 == null){
                do{
                    print("Please input a valid Amount #1: ")
                    amount1 = readln().toIntOrNull()
                }while (amount1 == null)
            }
    print("Input second amount: ")
        var amount2 = readln().toIntOrNull()
            if (amount2 == null){
                do{
                    print("Please input a valid Amount #2: ")
                    amount2 = readln().toIntOrNull()
                }while (amount2 == null)
            }
    print("Input third amount: ")
        var amount3 = readln().toIntOrNull()
            if (amount3 == null){
                do{
                    print("Please input a valid Amount #3: ")
                    amount3 = readln().toIntOrNull()
                }while (amount3 == null)
            }
    print("Input fourth amount: ")
        var amount4 = readln().toIntOrNull()
            if (amount4 == null){
                do{
                    print("Please input a valid Amount #4: ")
                    amount4 = readln().toIntOrNull()
                }while (amount4 == null)
            }
    print("Input fifth amount: ")
        var amount5 = readln().toIntOrNull()
            if (amount5 == null){
                do{
                    print("Please input a valid Amount #5: ")
                    amount5 = readln().toIntOrNull()
                }while (amount5 == null)
            }

    print("Divide the value by how many? ")
        var divisor= readln().toIntOrNull()
            if (divisor == null){
                do{
                    print("Please input a valid number: ")
                    divisor = readln().toIntOrNull()
                }while (divisor == null)
            }

    var totalAmount = amount1 + amount2 + amount3 + amount4 + amount5

    var sum = totalAmount.div(divisor)
                println("Answer: $sum")

}
