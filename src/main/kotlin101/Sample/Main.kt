package Sample

fun main() {
    var animal1 = Animal("Dog")
    var animal2 = Animal()
    var animal3 = Animal("Dog", "canine", "askal")

    animal3.commonName = "Cow"
        animal3.genus = ""

    println("Animal 3 : ${animal3.commonName}")
}

class Animal constructor(var commonName: String){
    lateinit var phylum: String
    lateinit var genus: String

    init {
        println("Initializing object")
        increaseObject()
        println("Companion Object Count : $objectCount")
    }

    companion object{
        var objectCount: Int = 0
            private set(value) {
                field = value
            }
            public get() = field

        private fun increaseObject() {
            objectCount ++;
        }
    }

    constructor() :this(""){
        println("1st Secondary Constructor")
    }

    constructor(commonName: String, phylum: String, genus:String)
        :this(commonName){
        println("2nd Secondary Constructor")
        this.phylum = phylum
        this.genus = genus
    }
}

open class Dog(val commonName: String)
open class Pig(val commonName: String)

class GermanShepherd() : Dog("German Shepherd")

data class Cat(val commonName: String)

enum class REGION{
    REGION_I,
    REGION_II,
}

interface Shape{
    var sides:Int

    fun setShade(value:Double)
}

class Square(override var sides: Int) : Shape,
    Dog("") {
    override fun setShade(value: Double) {
        TODO("Not yet implemented")
    }

}