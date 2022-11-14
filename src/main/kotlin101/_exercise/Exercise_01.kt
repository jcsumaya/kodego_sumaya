package _exercise

import java.util.Date
import kotlin.random.Random

enum class  ActiveState{
    SHOPPING,
    TRAVELING,
    LEARNING,
    SLEEPING,
    EATING,
    RESTING,
    WORKING,
    ACTIVE
}

class Job(){
    var payment:Double = 0.0
    var numberOfHours:Int = 0
    var nameOfTheJob:String = ""
    var title:String = ""

}

class Skill(){
    var skillName:String = ""
    var level:Int = 0
    val MAXSKILLLEVEL = 100
}
open class Character(var hungerLevel:Int = 100,
                var fatigueLevel:Int = 0,
                var totalMoney:Double,
                var earnRate:Double,
                var dateCreated:Date?,
                var cateLastLogin: Date?,
                var skill: Skill,
                var age:Int) {

    val MINIMUMHUNGER = 0
    val MAXFATIGUE = 100

    var activeState: ActiveState = ActiveState.RESTING
        set(state:ActiveState){
            field = state
            println("Status : $field")
        }

    var job:Job = Job()
        set(job:Job){
            field = job
            earnRate = job.payment
        }

    constructor():this(100,
        0,
        0.0,
        0.0,
        null,
        null,
        Skill(),
        0)

    fun increaseHunger(value:Int) {
        hungerLevel + value
    }

    fun decreaseHunger(value:Int, money:Double) {
        hungerLevel -= value
        totalMoney -= money
    }

    fun hungerStatus(value:Int):String{
        var state:String = ""

        when(value){
            in 0 .. 10 -> "Starved"
            in 11 .. 40 -> "Very Hungry"
        }
        return state
    }

    fun increaseSkillLevel(value:Int){
        skill.level =+ value
    }
}

class Kid():Character(){

    fun setActiveStatus(value:ActiveState){
        if(value != ActiveState.WORKING){
             activeState = value
        }
    }

    fun increaseKidSkillLevel(value:Double){
        var number = value
        var chance = Random.nextInt(100)

        if(chance > 70)
            number = (value * (Random.nextDouble(1.5, 4.0)))

        skill.level =+ number.toInt()
    }
}

enum class RelationshipType{
    AVAILABLE,
    COMPLICATED,
    NONE
}

class YoungAdult():Character(){
    var relationShipStatus: RelationshipType = RelationshipType.NONE
    var companion:Character? = null
}

class Adult():Character(){
    var savings:Double = 0.0
}

fun getCharacter(age:Int):Character?{
    if(age in 0 .. 17)
        return Kid()
    return null
}

fun main(){
}