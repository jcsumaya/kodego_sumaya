package activity_05_a

import java.time.Year
import java.util.*
import kotlin.collections.ArrayList

open class Person{
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var address: String = ""
    var birthDate = Date()
}

open class Student: Person() {
    var yearAdmitted: Year = Year.of(2000)
    var id: String = ""
}

class CertificateStudent: Student() {
    var shortCourses: ArrayList<String> = ArrayList()
}

class UnderGraduateStudent: Student() {
    var college: String = ""
    var degree: String = ""
    lateinit var collegeYearStart: Year
    var collegeYearEnd: Year? = null
    lateinit var status: StudentStatus
}

class MasterStudent: Student() {
    var college: String = ""
    var degree: String = ""
    var collegeYearStart: Year = Year.of(2000)
    var collegeYearEnd: Year? = null

}

class GraduateStudent: Student() {
    var college: String = ""
    var degree: String = ""
    var collegeYearStart: Year = Year.of(2000)
    var collegeYearEnd: Year? = null
}

enum class StudentStatus {
    LeaveOfAbsence,
    Ongoing,
    Graduated,
    WillBegin,
    Unknown,
    Shifted
}
