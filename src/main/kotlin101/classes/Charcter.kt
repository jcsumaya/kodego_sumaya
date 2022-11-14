package classes

open class Sample(){
    constructor(sample:String):this()
}

open class Character(val name:String,) {
    var location:String = ""
    var race: String = ""
        get() = "Getting $field"
        set(value) {
            field = "Setting $value"
        }

    companion object{
        private var objectCount = 0
        fun increaseCount(): Int {
            objectCount += 1
            return objectCount
        }
    }

    constructor():this("")
    constructor(name: String, type: String):this(name){
    }
}

open class NPC(val role: Roles = Roles.UNKNOWN,):Character("UNKNOWN") {
    companion object{
        var objectCount = 0
    }
}

fun main(){
    var char_0:Character = Character("Annie")
    char_0.race = "Human"
    println("Character: ${char_0.race}")

    var char_1:Character = Character("Sejuani")
    println("count: ${Character.increaseCount()}")

    var char_2 = Character("Atrox")
    println("count: ${Character.increaseCount()}")

    var char_3 = Character("Akali")
    println("count: ${Character.increaseCount()}")
}


