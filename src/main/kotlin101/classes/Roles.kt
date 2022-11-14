package classes

enum class Roles(val position: String) {

    CARRY("Carry"),
    TANK("Tank"),
    JUNGLE("Jungle"),
    ASSASSIN("Assassin"),
    SUPPORT("Support"),
    STORYTELLER("Story Teller"),
    FEEDER("Feeder"),
    UNKNOWN("Unknown");

    fun doSomething(){

    }
}

fun main(){
    val ROLES = arrayOf("CARRY", "TANK", "JUNGLE", "ASSASSIN",
        "SUPPORT", "STORYTELLER", "FEEDER", "UNKNOWN")

    var myRole = Roles.SUPPORT
    var yourRole:Roles = Roles.UNKNOWN

    if(myRole == Roles.SUPPORT){
        println("I am a $myRole")
    }

    Roles.values().forEach {
        println("Roles: $it")
    }

    //what is the data type pf SUPPORT
}