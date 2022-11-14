package activity_01_f
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

//Create an application that will accept 2 string inputs.
//Your application will print all unique characters in both Strings.

fun main() {
    logger.info { "Input string 1: " }
    var input1 = readln().lowercase()
    logger.info { "Input string 2: " }
    var input2 = readln().lowercase()
    var counter = 0
    var input = input1 + input2

        for (char in input) {
            for (charCompare in input)
                if (char == charCompare) {
                    counter++
                }
            if (counter == 1) {
                logger.info { "Unique Characters found in both strings: $char" }
            }
            counter = 0
        }
}

