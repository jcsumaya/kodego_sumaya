package exercise_1

import java.util.*
import kotlin.collections.ArrayList

//Convert Application For Employment to Kotlin Variables

fun main() {
    val form = ApplicationForm()

//    form.positionApplyingFor = "Programmer"
//
//    println("Position : ${form.positionApplyingFor}")

    val applicationForm = ApplicationForm()
    applicationForm.positionApplyingFor = "Programmer"
    println("Applying for: ${applicationForm.positionApplyingFor}")

    ApplicationForm.increaseApplication()
    println("Number of Applicant : ${ApplicationForm.applicantCount}")

}
class ApplicationForm{
    var positionApplyingFor = ""
//        get() = "Getting $field"
//        set(value) {
//            field = "Setting $value"
//        }

    var dateAvailableForWork = Date()
    var desiredSalary = 0.0

    lateinit var personalInfo : PersonalInfo        //(saves you memory, but reserves the var already) (lateinit di pwedeng nullable)
    var educationalBackground: ArrayList<Education> = ArrayList()
    var employmentBackground: ArrayList<Employment> = ArrayList()
    var referencesInfo : ArrayList<References> = ArrayList()

    init{                               //init is called before the constructor
        println("Init Called")
    }

    companion object{           //shared amongst all instances of same class
        var applicantCount = 0
        fun increaseApplication(){
            println("Companion Object Called")
            applicantCount++
        }
    }
    constructor(){
        personalInfo = PersonalInfo()
        println("Constructor Called")
    }

    fun addPersonalInfo(lastName: String?,
                        firstName: String?,
                        middleName: String?,
                        address: String?,
                        state:String,
                        zipCode: Int,
                        sss:String?,
                        usCitizen: Boolean?,
                        convictedFelony: Boolean?,
                        drugScreenTest: Boolean?){

//        with(personalInfo) {
//            this.lastName = lastName
//            this.firstName = firstName
//            this.middleName = middleName
//            this.address = address
//            this.state = state
//            this.zipCode = zipCode
//            this.sss = sss
//            this.usCitizen = usCitizen
//            this.convictedFelony = convictedFelony
//            this.drugScreenTest = drugScreenTest
//        }
        personalInfo.apply {        //if you are assigning values, use this
            this.lastName = lastName
            this.firstName = firstName
            this.middleName = middleName
            this.address = address
            this.state = state
            this.zipCode = zipCode
            this.sss = sss
            this.usCitizen = usCitizen
            this.convictedFelony = convictedFelony
            this.drugScreenTest = drugScreenTest
        }
//        personalInfo.run {
//            this.lastName = lastName
//            this.firstName = firstName
//            this.middleName = middleName
//            this.address = address
//            this.state = state
//            this.zipCode = zipCode
//            this.sss = sss
//            this.usCitizen = usCitizen
//            this.convictedFelony = convictedFelony
//            this.drugScreenTest = drugScreenTest
//        }
//        personalInfo.let {
//            it.lastName = lastName
//            it.firstName = firstName
//            it.middleName = middleName
//            it.address = address
//            it.state = state
//            it.zipCode = zipCode
//            it.sss = sss
//            it.usCitizen = usCitizen
//            it.convictedFelony = convictedFelony
//            it.drugScreenTest = drugScreenTest
//        }
//        personalInfo.also {
//            it.lastName = lastName
//            it.firstName = firstName
//            it.middleName = middleName
//            it.address = address
//            it.state = state
//            it.zipCode = zipCode
//            it.sss = sss
//            it.usCitizen = usCitizen
//            it.convictedFelony = convictedFelony
//            it.drugScreenTest = drugScreenTest
//        }
    }

    fun addPersonalInfoContact(type: String, details:String){
        personalInfo.addContacts(Contacts(type, details))
    }

    fun addEducation(schoolName:String? = "",
                     location:String? = "",
                     yearsAttended:Int? = 0,
                     degreeReceived:String? = "",
                     major:String? = "",){
        val education = Education()

        education.apply {
            this.schoolName = schoolName
            this.location = location
            this.yearsAttended = yearsAttended
            this.degreeReceived = degreeReceived
            this.major = major
            educationalBackground.add(this)
        }
    }

    fun employment(employer: String = "",
                   employmentStartDate: Date = Date(),
                   employmentEndDate: Date = Date(),
                   workPhone:String? = "",
                   payRateMinimum:Double? = 0.0,
                   payRateMaximum:Double? = 0.0,
                   address:String? = "",
                   city:String? = "",
                   state:String? = "",
                   zip:Int? = 0,
                   position:String? = "",
                   dutiesPerformed:ArrayList<String> = ArrayList(),
                   supervisors: ArrayList<Employment.Supervisor> = ArrayList(),
                   reasonForLeaving:String = "",
                   contactSupervisorAvailable:Boolean = false){

        val employment = Employment()
        employment.apply {
            this.employmentStartDate = employmentStartDate
            this.employmentEndDate = employmentEndDate
            this.workPhone = workPhone
            this.payRateMinimum = payRateMinimum
            this.payRateMaximum = payRateMaximum
            this.address = address
            this.city = city
            this.state = state
            this.zip = zip
            this.position = position
            this.dutiesPerformed = dutiesPerformed
            this.supervisors = supervisors
            this.reasonForLeaving = reasonForLeaving
            this.contactSupervisorAvailable = contactSupervisorAvailable

            employmentBackground.add(this)
        }
    }

    fun references(firstName:String = "" ,
                   middleName:String = "" ,
                   lastName:String = "" ,
                   title:String,
                   company:String,
                   contacts:Contacts,){

        val references = References()
        references.apply{
            this.firstName = firstName
            this.middleName = middleName
            this.lastName = lastName
            this.title = title
            this.company = company
            this.contacts = contacts

            referencesInfo.add(this)
        }
    }
}


class PersonalInfo{
    var lastName:String? = null
    var firstName:String? = null
    var middleName:String? = null

    var address: String? = null
    var state: String? = null
    var zipCode:Int? = null

    var sss:String? = null
    var usCitizen:Boolean? = null
    var convictedFelony:Boolean? = null
    var drugScreenTest:Boolean? = null

    var contacts:ArrayList<Contacts> = ArrayList()

    fun addContacts(contact: Contacts){
        contacts.add(contact)
    }
}
class Contacts(var type: String, var details: String){
    constructor():this("","")
}


class Education {
    var schoolName:String? = null
    var location:String? = null
    var yearsAttended:Int? = null
    var degreeReceived:String? = null
    var major:String? = null
}

class Employment{
    var employer: String = ""
    var employmentStartDate: Date = Date()
    var employmentEndDate: Date = Date()
    var workPhone:String? = null
    var payRateMinimum:Double? = 0.0
    var payRateMaximum:Double? = 0.0
    var address:String? = null
    var city:String? = null
    var state:String? = null
    var zip:Int? = null
    var position:String? = null
    var dutiesPerformed:ArrayList<String> = ArrayList()
    var supervisors: ArrayList<Supervisor> = ArrayList()
    var reasonForLeaving:String = ""
    var contactSupervisorAvailable:Boolean = false
    inner class Supervisor(
        var firstName:String = "" ,
        var middleName:String = "" ,
        var lastName:String = "" ,
        var supervisorTitle:String = ""
    )
}

class References(               // (constructor) required na may laman; di na pede i-modify get() and set()
    var firstName:String = "" ,
    var middleName:String = "" ,
    var lastName:String = "" ,
    var title:String,
    var company:String,
    var contacts: Contacts?,)
                {               // {within a class} optional. you can modify get() and set()
    constructor():this("","","","","", null)
}