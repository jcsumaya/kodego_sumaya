package functions

fun main(args: Array<String>){
    println("${randomEntry(1, "apple", 2, "orange", 3.0, 'c')}")
}

fun <T> randomEntry(vararg entries: T): List<T> {
    val result = ArrayList<T>()
    for (item in entries) // ts is an Array
        result.add(item)
    return result
}
