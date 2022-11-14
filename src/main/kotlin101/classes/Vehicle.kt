package classes

abstract class Vehicle {

    fun openDoor(){
        //do something
    }

    abstract fun moveForward()
}

class Plane: Vehicle() {
    override fun moveForward() {
        TODO("Not yet implemented")
    }

}

fun main() {
    var vehicle: Vehicle = Plane()
}