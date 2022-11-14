fun main() {
    var userInput = "1222952309"

    var index = 0
    var found = false

    do {
        val char = userInput[index]
        println("char : $char")
        index++

        if (char == '9') {
            found = true
            println("Found a 9")
        }
    } while ((index < userInput.length) && !found)


    while (true) {

    }
}