package activity_02_d
import mu.KotlinLogging
val logger = KotlinLogging.logger{}

//Implement Activity 01 -  D using data structure.
fun main() {
    var monetaryAmounts = ArrayList<Int>()

    activity_01_d.logger.info{"INPUT 5 MONETARY AMOUNTS"}

    activity_01_d.logger.info{"Input first amount: "}
    var amount1 = readln().toIntOrNull()
    if (amount1 == null){
        do{
            activity_01_d.logger.error{"Please input a valid integer: "}
            amount1 = readln().toIntOrNull()
        }while (amount1 == null)
    }
    monetaryAmounts.add(amount1)
    activity_01_d.logger.info{"Input second amount: "}
    var amount2 = readln().toIntOrNull()
    if (amount2 == null){
        do{
            activity_01_d.logger.error{"Please input a valid integer: "}
            amount2 = readln().toIntOrNull()
        }while (amount2 == null)
    }
    monetaryAmounts.add(amount2)
    activity_01_d.logger.info{"Input third amount: "}
    var amount3 = readln().toIntOrNull()
    if (amount3 == null){
        do{
            activity_01_d.logger.error{"Please input a valid integer: "}
            amount3 = readln().toIntOrNull()
        }while (amount3 == null)
    }
    monetaryAmounts.add(amount3)
    activity_01_d.logger.info{"Input fourth amount: "}
    var amount4 = readln().toIntOrNull()
    if (amount4 == null){
        do{
            activity_01_d.logger.error{"Please input a valid integer: "}
            amount4 = readln().toIntOrNull()
        }while (amount4 == null)
    }
    monetaryAmounts.add(amount4)
    activity_01_d.logger.info{"Input fifth amount: "}
    var amount5 = readln().toIntOrNull()
    if (amount5 == null){
        do{
            activity_01_d.logger.error{"Please input a valid integer: "}
            amount5 = readln().toIntOrNull()
        }while (amount5 == null)
    }
    monetaryAmounts.add(amount5)
    activity_01_d.logger.info{"Divide the value by how many? "}
    var divisor = readln().toIntOrNull()
    if (divisor == null){
        do{
            activity_01_d.logger.error{"Please input a valid integer: "}
            divisor = readln().toIntOrNull()
        }while (divisor == null)
    }

    var totalAmount = monetaryAmounts.sum()
    var quotient = totalAmount.div(divisor)

    activity_01_d.logger.info{"Answer: $quotient"}
}