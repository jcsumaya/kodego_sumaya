lateinit var userInput:String
val EVENT = "Beginning Kotlin"

var number: Int = 0
var truth: Boolean = true

//public static void main(String[] args)
fun main(args: Array<String>){

    var somevalue = (0).plus(4)

    print("Enter your name: ")
    userInput = readLine().toString()
    println("Hi $userInput, Enjoy ${EVENT}")
}
