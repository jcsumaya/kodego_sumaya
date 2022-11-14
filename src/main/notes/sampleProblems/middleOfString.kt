package sampleProblems

//Write a program that reads a string, and then outputs the string without its middle character when the length is odd,
// and without the middle 2 characters when the length is even.
fun main(){
    var input = readln()
    if (input.length % 2 == 0) {
        println(input.substring(0, input.length / 2 - 1) + input.substring(input.length / 2 + 1))
    } else {
        println(input.substring(0, input.length / 2) + input.substring(input.length / 2 + 1))
    }
}