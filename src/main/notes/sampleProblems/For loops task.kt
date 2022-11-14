package sampleProblems
fun main() {
    var listSize = readln().toInt()
    var mutList= mutableListOf<Int>()
    for (i in 0 until listSize){
        mutList.add(readln().toInt())
    }

    var (firstNum, secondNum) = readln().split(" ").map{it.toInt()}
        if (mutList.contains(firstNum) and mutList.contains(secondNum)){
        println("YES")} else println("NO")
}