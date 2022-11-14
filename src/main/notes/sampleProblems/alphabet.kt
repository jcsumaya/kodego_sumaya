package sampleProblems
fun main() {
    var input = readln().lowercase()
    var alphabet = ""
    for(letter in 'a'..'z') {
        alphabet += letter
        }
    println(alphabet.contains(input))
}