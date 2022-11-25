package activity_04_a
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

class Student(var firstName:String, var lastName:String, var nickName:String,
              var id:String, var yearEnrolled:Int){
}
var students = ArrayList<Student>()

fun main() {
    students.add(Student("Armel Paul", "Tabios", "ChiefArmel", "201832D", 2018))
    students.add(Student("Marc Polo Luis", "Fausto", "Raven", "201838A", 2017))
    students.add(Student("Abed", "Yusop", "Abed", "201876E", 2016))
    students.add(Student("Kuku", "Palad", "Kukuy", "201831F", 2018))
    students.add(Student("Timothy", "Randrup", "Tims", "201899G", 2015))
    searchStudentWildSearch()
}



fun searchStudentWildSearch() {

do {
    print(
    "INPUT: \n" +
            "1 -> WildSearch in First Name \n" +
            "2 -> WildSearch in Last Name \n" +
            "3 -> WildSearch in Nickname \n"
        )
    val option: Int? = readln().toIntOrNull()
    var searchFor: String

        when (option) {
            1 -> {
                print("First Name WildSearch: ")
                searchFor = readln().uppercase()
                for (data in students) {
                    if (data.firstName.uppercase().contains(searchFor)) {
                        logger.info { "First name/s found: ${data.firstName}" }
                    }
                }
            }
            2 -> {
                print("Last Name WildSearch: ")
                searchFor = readln().uppercase()
                for (data in students) {
                    if (data.lastName.uppercase().contains(searchFor)) {
                        logger.info { "Last name/s found: ${data.lastName}" }
                    }
                }
            }
            3 -> {
                print("Nickname WildSearch: ")
                searchFor = readln().uppercase()
                for (data in students) {
                    if (data.nickName.uppercase().contains(searchFor)) {
                        logger.info { "Nickname/s found: ${data.nickName}" }
                    }
                }
            }
        }
 }while((option == null) || (option !in 1..3))
}