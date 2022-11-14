package sampleProblems

fun main() {
    var number = readln()
    var firstHalf = 0
    var secondHalf = 0
    for (index in 0 until number.length / 2) {
        firstHalf += number[index].digitToInt()
    }
    for (index in number.length / 2 until number.length) {
        secondHalf += number[index].digitToInt()
    }
    if (firstHalf == secondHalf) println("YES") else println("NO")
}
