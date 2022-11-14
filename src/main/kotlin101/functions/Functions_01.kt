package functions

fun main(args: Array<String>){
    var array = intArrayOf(1, 2, 3, 4)

    println("SUM : ${add(1, 2, 3)}")

    println("SUM : ${add(1, 2, 3, *array, *array)}")
}

fun add(vararg numbers: Int) : Int{ //vararg used for adding multiple items
    var result = 0
    for(value in numbers){
        result += value
    }
    return result
}
