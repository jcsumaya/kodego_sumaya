package classes

class Vehicle {
    //attributes
    var doors: String = ""
    var color: String = ""
    var capacity:Int = 0
    var speed: Int = 0
    var weight:Double = 0.0
    var size:Double = 0.0
    var brand:String = ""
    var engine:String = ""

    //methods
    fun run(){}
    fun accelerate(){}
    fun stop(){}
    fun reverse(){}
}

fun main() {
    var vehicle:Vehicle = Vehicle() //object

    vehicle.brand = "Nissan"
}