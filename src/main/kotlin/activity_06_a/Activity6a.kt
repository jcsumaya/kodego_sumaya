package activity_06_a

import java.time.Year
import java.util.*
import kotlin.Exception
import kotlin.collections.ArrayList

open class Person{
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var address: String = ""
    var birthDate = Date()
}

class InvalidInput(message: String = "Invalid Input") : Exception(message)
class IncompleteGrades(message: String = "Incomplete Grades") : Exception(message)

open class Student: Person() {
    var yearAdmitted: Year = Year.of(2000)
    var id: String = ""

    fun checkGrade(grades: ArrayList<Double>){
        println(grades)
            if(grades.size > 10) {
                throw InvalidInput()
            }
            if(grades.contains(0.0) || grades.size < 10){
                throw IncompleteGrades()
            }
    }
}

fun main() {
    var student = Student()
    var grades = arrayListOf(90.2, 91.3, 92.2, 94.5, 96.8, 90.0, 96.4, 99.9, 93.3, 70.0)
    var grades2 = arrayListOf(90.2, 91.3, 92.2, 94.5, 96.8, 90.0, 96.4, 99.9, 93.3, 97.0, 87.0)

    try {
        student.checkGrade(grades)
        student.checkGrade(grades2)
    }catch (e: Exception){
        e.printStackTrace()
    }
}