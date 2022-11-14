package functions
// use functions when executing a task, para hindi crowded yung main function

fun main() {
//    var result = add(1, 2)
//    print("Result : $result")
//    print("Result: ${add( 3, 4)}")

    println("Result : ${add(2.2F)}")
}

fun add(value1: Int, value2: Int) : Int{
    return value1 + value2
}

fun add(value1: Int) = value1

//fun add(value1: Float) = value1
//callable if 1 float value only

fun add(value1: Double, value2: Double) = value1 + value2

fun add(value1: Long, value2: Long) = value1 + value2

fun add(value1: Float, value2:Float = 0.0F) = value1 + value2
//callable if 2 float values

fun emptyFunction():Unit{
//    var result = add(30, 4)
//
//    println("Start Function")
//
//    if(result > 10)
//        return
//    else
//        print("Result : $result")
//
//    println("Finish Function")
}