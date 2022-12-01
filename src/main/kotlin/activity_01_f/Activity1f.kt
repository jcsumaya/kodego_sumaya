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
    var uniqueChar = ""
    var input = input1 + input2

    for (char in input) {
        if (char.toString().lowercase() !in uniqueChar.lowercase())
            uniqueChar += char
    }

    logger.info{"Unique Characters found: $uniqueChar"}
}

