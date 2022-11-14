package functions
//lambda = accepts a set of code
// pass functions in lambda

fun main(args: Array<String>){
    var array = intArrayOf(1, 2, 3, 4)
    println("ADD : ${execute { add() }}")

    println("ADD : ${execute { 1 + 1 }}")

    println("ADD : ${execute { (100 / 10) * 5 }}")

  }

fun execute(execute:() -> Int): Int{            // () lines of code to be executed
    println("EXECUTED : ${execute()}")
    return execute()
}