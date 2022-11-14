package functions

fun main(args: Array<String>){
    print("ADD : ${add()}")
    print("ADD : ${add(1, 2)}")
    print("ADD : ${add(10L, 2L)}")
    print("ADD : ${add(.6)}")
    print("ADD : ${add(value2 = .6, value1 = 100.00)}")
}

fun add() = 0

fun add(value1: Int, value2: Int, ) : Int{
    return value1 + value2
}

fun add(value1: Long, value2:Long, ) = value1 + value2

fun add(value1: Double, value2:Double = 0.0) = value1 + value2

fun emptyFunction():Unit{
}

fun someFunction(){

}