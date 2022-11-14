package sampleProblems
//Input data format
//The single input line contains a sequence.
//Output data format
//The percentage of G and C characters as a double.
fun main() {
    var input = readln().lowercase()
    var counter = 0.0
    for (char in input)
        if (char in "gc") counter++
        print(counter / input.length * 100)
}