package activity_01_d
import mu.KotlinLogging
val logger = KotlinLogging.logger{}

//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
// It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.

fun main() {
    logger.info{"INPUT 5 MONETARY AMOUNTS"}

    logger.info{"Input first amount: "}
    var amount1 = readln().toIntOrNull()
        if (amount1 == null){
            do{
                logger.error{"Please input a valid integer: "}
                amount1 = readln().toIntOrNull()
            }while (amount1 == null)
        }
    logger.info{"Input second amount: "}
    var amount2 = readln().toIntOrNull()
        if (amount2 == null){
            do{
                logger.error{"Please input a valid integer: "}
                amount2 = readln().toIntOrNull()
            }while (amount2 == null)
        }
    logger.info{"Input third amount: "}
    var amount3 = readln().toIntOrNull()
        if (amount3 == null){
            do{
                logger.error{"Please input a valid integer: "}
                amount3 = readln().toIntOrNull()
            }while (amount3 == null)
        }
    logger.info{"Input fourth amount: "}
    var amount4 = readln().toIntOrNull()
        if (amount4 == null){
            do{
                logger.error{"Please input a valid integer: "}
                amount4 = readln().toIntOrNull()
            }while (amount4 == null)
        }
    logger.info{"Input fifth amount: "}
    var amount5 = readln().toIntOrNull()
        if (amount5 == null){
            do{
                logger.error{"Please input a valid integer: "}
                amount5 = readln().toIntOrNull()
            }while (amount5 == null)
        }
    logger.info{"Divide the value by how many? "}
    var divisor = readln().toIntOrNull()
        if (divisor == null){
            do{
                logger.error{"Please input a valid integer: "}
                divisor = readln().toIntOrNull()
            }while ((divisor == null))
        }
        if (divisor == 0){
            do{
            logger.error{"Cannot be divided by 0."}
                logger.error{"Please input a valid integer: "}
            divisor = readln().toIntOrNull()
            }while ((divisor == 0))
    }

    var totalAmount = amount1 + amount2 + amount3 + amount4 + amount5
    var quotient = totalAmount.div(divisor!!)

    logger.info{"Answer: $quotient"}
}
