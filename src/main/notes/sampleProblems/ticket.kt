package sampleProblems

// A ticket is considered a lucky one if the sum of the first three numbers in this ticket
// matches the sum of the last three numbers in the same ticket.
// which will check the equality of the sums
// and display "Lucky" if the sums match, and "Regular" if the sums differ.
// A string of six digits is provided as input to the program.
fun main() {
    var number = readln()
    var firstHalf = 0
    var secondHalf = 0
    for (index in 0..2) {
        firstHalf += number[index].digitToInt()
    }
    for (index in 3..5) {
        secondHalf += number[index].digitToInt()
    }
    if (firstHalf == secondHalf) println("Lucky") else println("Regular")

}
