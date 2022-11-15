package activity_03_a
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {
    var names:ArrayList<String> = ArrayList()
    names.addAll(listOf("Alpha", "Bravo", "Charlie", "Dana", "Earl", "Felix"
        , "George", "Hans", "Ivan", "John", "Karl", "Lars", "Martin", "Olive", "Peter", "Roger", "Simon"
        , "Tom", "Victor", "Will").upperCase())

    isStudentInRecord(names)
    addStudent(names)
    removeStudent(names)
    showStudents(names)
    countStudent(names)
    searchStudentWildSearch(names)
    searchStudentName(names)
    searchStudent(names)
    showStudents(names)
}
fun isStudentInRecord(names:ArrayList<String>) {
    print("Search for a name in the student record: ")
    var checkName = readln().uppercase()
        while (checkName !in names){
            logger.info { "$checkName is not in the student record." }
            print("Search for a name in the student record: ")
            checkName = readln().uppercase()
        }
    logger.info { "$checkName is in the student record." }
}

fun addStudent(names: ArrayList<String>) {
    print("Add a name in the student record: ")
    var newName = readln().uppercase()
        while (newName in names) {
            logger.info { "$newName is already in the student record." }
            print("Add a name in the student record: ")
            newName = readln().uppercase()
        }
    names.add(newName)
    logger.info { "Added $newName in the student record." }
}


fun removeStudent(names: ArrayList<String>) {
    print("Remove a name in the student record: ")
    var deleteName = readln().uppercase()
        while (deleteName !in names) {
            logger.info { "$deleteName is not in the student record." }
            print("Remove a name in the student record: ")
            deleteName = readln().uppercase()
        }
    names.remove(deleteName)
    logger.info { "$deleteName has been removed from the student record." }
}

fun countStudent(names: ArrayList<String>) {
    var studentSize = names.size
    logger.info { "Student size = $studentSize" }
}

fun searchStudentWildSearch(names: ArrayList<String>) {
    print("String input for Wild Search: ")
    var wildSearch = readln().uppercase()
    var match = ArrayList<String>()
    for (studentName in names){
        if(wildSearch.contains(studentName)){
            match.add(studentName)
        }
    }
    logger.info { "Found student names within the string: $match" }
}
fun searchStudentName(names: ArrayList<String>) {
    print("String input for exact Student Search: ")
    var searchName = readln().uppercase()
    var match = ArrayList<String>()
    if (searchName in names) {
        match.add(searchName)
        logger.info { "Found an exact match of student names: $match" }
    }
}

fun searchStudent(names: ArrayList<String>) {
    print("Input a string: ")
    var searchStudent = readln().uppercase()
        if(searchStudent.length > 3){
            return searchStudentName(names)
        }else {
            return searchStudentWildSearch(names)
        }
}

fun showStudents(names: ArrayList<String>) {
    logger.info { "List of students: $names" }
}
fun List<String>.upperCase(): List<String> = this.map { it.uppercase() }