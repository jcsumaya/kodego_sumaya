package exercise_1
import java.time.LocalDate
fun main() {
    val position = ("Mobile Developer")
        println("Position you're applying for: $position \n")

    val date = LocalDate.of(2023, 2, 24)
        println("Date available for Work: $date \n")

    val salary = 40000.00
        println("Your desired Salary is: ₱$salary \n")

    val lastName = ("Sumaya")
        println("Last Name: $lastName")
    val firstName = ("Juan")
        println("First Name: $firstName")
    val middleName = ("")
        println("Middle Name: $middleName \n")

    val birthDate = LocalDate.of(1998, 7, 22)
        println("Birth date: $birthDate")

    val age:Int = LocalDate.now().year - birthDate.year
            println ("$age years old")
        if (age >= 18)
            println("Age is at least 18 y.o. \n")

    val address = ("143 KodeGo street")
        println("Address: $address")
    val city = ("Santa Rosa")
        println("City: $city")
    val municipal = ("Laguna")
        println("State: $municipal")
    val zip = 1000
        println("Zip: $zip \n")

    val areaCode = "(049)"
    val telNumber:Int = (1234567)
    val homeNumber = areaCode.plus(telNumber)
        println("Home Number: $homeNumber \n")

    val countryCode = "(+63)"
    val mobileNumber:Int = (1234567890)
    val cellNumber = countryCode + mobileNumber
        println("Cell Phone: $cellNumber \n")

    val emailAdd = "juan.kodegoph@gmail.com"
        println ("Email Address: $emailAdd \n")

    val socialNum = "SS-123456"
        println ("Social Security Number: $socialNum \n")

    val usCitizen = false
        println("Are you a U.S. Citizen?: $usCitizen \n")

    val hasFelony = false
        println("Have you ever been convicted of a felony?: $hasFelony \n")

    val drugTest = true
        println("If Selected for employment are you willing to submit to a pre-employment drug screening test?: $drugTest \n")

    val schoolName = "KodeGo University"
        println("School Name: $schoolName")
    val schoolYear = 2022
        println("Year Attended: $schoolYear")
    val schoolLoc = ("1234 Taft Ave., Malate, Manila, 1004 Metro Manila, PH")
        println("Location: $schoolLoc \n")

    val degree = "BS-CS"
        println("Degree: $degree \n")

    val major = "Mobile Development"
        println("Major: $major \n")

    val others = "N/A"
        println("Other training, certifications or licenses held: $others")

}