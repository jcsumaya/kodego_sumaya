package activity_03_a
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}
fun main() {
    var names:ArrayList<String> = arrayListOf("Alpha", "Bravo", "Charlie", "Dana", "Earl", "Felix"
    , "George", "Hans", "Ivan", "John", "Karl", "Lars", "Martin", "Olive", "Peter", "Roger", "Simon"
    , "Tom", "Victor", "Will")

    addStudent(names)
    isStudentInRecord(names)
    removeStudent(names)
    countStudent(names)
    println(names)
}
fun isStudentInRecord(names:ArrayList<String>){
    print("Search for a name in the student record: ")
    var checkName = readln()
        while (checkName.uppercase() !in names.toString().uppercase()) {
            logger.info { "$checkName is not in the student record." }
            checkName = readln()
        }
    logger.info { "$checkName is in the student record." }
}

fun addStudent(names: ArrayList<String>){
    print("Add a name in the student record: ")
    var newName = readln()
        while (newName.uppercase() in names.toString().uppercase()) {
            logger.info { "$newName is already in the student record." }
        print("Add a name in the student record: ")
            newName = readln()
        }
    names.add(newName)
    logger.info { "Added $newName in the student record." }
}


fun removeStudent(names: ArrayList<String>){
    print("Remove a name in the student record: ")
    var deleteName = readln()
        while (deleteName.uppercase() !in names.toString().uppercase()) {
            logger.info { "$deleteName is not in the student record." }
        print("Remove a name in the student record: ")
            deleteName = readln()
        }
    names.remove(deleteName.capitalize())
    logger.info { "$deleteName has been removed from the student record." }
}

fun countStudent(names: ArrayList<String>){
    var studentSize = names.size
    logger.info { "Student size = $studentSize" }
}