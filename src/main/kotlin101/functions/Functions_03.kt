package functions

fun main(args: Array<String>){
    var array = intArrayOf(1, 2, 3, 4)
    println("COMPUTE : ${compute(1, 2, 3, *array, 1, divisor = 1)}")
    println("COMPUTE : ${compute(1, 2, 3, *array, 1, *array)}")
}
fun compute(vararg numbers: Int, divisor:Int = 1): Int{
    var result = 0
    for(value in numbers){
        result += value
    }
    return result
}

