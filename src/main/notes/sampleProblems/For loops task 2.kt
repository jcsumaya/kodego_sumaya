package sampleProblems

//Write a program that reads a list of integers and outputs the number of triples in the list.
//
//A triple is three consecutive integers in ascending order — 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not.
//
//The first line contains the size of the list.
//The rest of the lines contain the elements of the list.
//
//Output a single integer value that represents the number of triples in the list.
//
//In the example below, there are two triples: 4,5,6 and 5,6,7.

fun main() {
    val size = readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    var  counter = 0
    for (i in 0 until size){
        mutList.add(readln().toInt())
    }

    for (i in 0 until mutList.size-2){
        if (mutList[i] + 1 == mutList[i + 1] && mutList[i] + 2 == mutList[i + 2]){
            counter++
        }
    }
    println(counter)
}