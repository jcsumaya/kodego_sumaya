package functions
//infix

fun main(){
    var arrValues = arrayOf(1, 2, 3)
    println("RESULT = ${5.add(5).add(2)}")
    println("RESULT = ${100.add(arrValues)}")

    6.add(5).add(10L)   // uses line 12
}

infix fun Int.add(value1: Int) : Int {
    return this + value1
}

infix fun Int.add(value1: Long) : Long = this + value1


infix fun Int.add(values: Array<Int>) : Int {
    var result = this

    for(value in values){
        result += value
    }

    return this + result
}

data class MobileDevice(val brand: String, val model:String, )

fun MobileDevice.showDetails(){
    println("Brand : ${this.brand}")
    println("Model : ${this.model}")
}
