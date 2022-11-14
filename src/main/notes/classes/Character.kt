package classes

class Character(var name: String = "",
                var locationX: Double,
                var locationY: Double) {

    constructor(name:String) : this(name, 0.0, 0.0)
    constructor(): this("", 0.0, 0.0)
}

class Building{
    var name:String = ""

    constructor(){}
}

fun main() {
    var character: Character = Character("Shop Dealer", 0.0, 0.0)
    var maid: Character = Character("Wendy")
    var janitor: Character = Character()
}