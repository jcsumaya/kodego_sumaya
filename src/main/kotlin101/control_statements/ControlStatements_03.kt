package control_statements

import kotlin.properties.Delegates

fun main(){
    val grade = 4
    var gpa:Double = 0.0

    when(grade){
        in 94 .. 100, in 101 .. 120 ->{
            gpa = 4.0
        }
        in 89 until 94 -> gpa = 3.5
        in 83 until 89 -> gpa = 3.0
        in 78 until 83 -> gpa = 2.5
        in 72 until 78 -> gpa = 2.0
        in 66 until 72 -> gpa = 1.5
        in 60 until 66 -> gpa = 1.0
        in Int.MIN_VALUE..59 -> gpa = 0.0
        else -> gpa = 6.5
    }
    println("GPA 1: $gpa")

    gpa = -1.0
    when{
        grade is Int -> println("Int")
        grade in 94 .. 100 -> gpa = 4.0
        grade in 89 until 94 -> gpa = 3.5
        grade in 83 until 89 -> gpa = 3.0
        grade in 78 until 83 -> gpa = 2.5
        grade in 72 until 78 -> gpa = 2.0
        grade in 66 until 72 -> gpa = 1.5
        grade in 60 until 66 -> gpa = 1.0
        grade in 0 until 60 -> gpa = 0.0
        else -> gpa = 6.5
    }
    println("GPA 2: $gpa")
}

fun getGrade(grade:Int) = when(grade){
    in 94 .. 100 -> 4.0
    in 89 until 94 -> 3.5
    in 83 until 89 -> 3.0
    in 78 until 83 -> 2.5
    in 72 until 78 -> 2.0
    in 66 until 72 -> 1.5
    in 60 until 66 -> 1.0
    in 0 .. 59 ->  0.0
    else -> 6.5


}

fun ifFunction() = if(true)
                        true
                    else
                        false

fun sample(){
    var grade:Float = 70.0F
    var gradeInCard:Float = 0.0F

    if (grade in (94.0F).rangeTo(100.0F)){
        gradeInCard = 1.0F
    }else if(grade in (89.0F).rangeTo(93.9F)){
        gradeInCard = 1.5F
    }else if(grade in (83.0F).rangeTo(88.9F)){
        gradeInCard = 2.0F
    }else if(grade in (78.0F).rangeTo(82.9F)){
        gradeInCard = 2.5F
    }else if(grade in (72.0F).rangeTo(77.9F)){
        gradeInCard = 3.0F
    }else if(grade in (66.0F).rangeTo(71.9F)){
        gradeInCard = 3.5F
    }else if(grade in (60.0F).rangeTo(65.9F)){
        gradeInCard = 4.0F
    }else{
        gradeInCard = 5.0F
    }
}