package activity_05_b
import java.util.*

//1. A book, a magazine, a newspaper and comics inherits from a Publication class.
// Identify the attributes and the methods for the publication.

class Publication {
    var publisher: String = ""
    var placeOfPublication: String = ""
    var dateFounded: Date = Date()
    var hasOnlineResources: Boolean = false

    fun showEditors(){}
    fun listPublisherWorks(){}
    fun showEnglishMaterials(){}
    fun showFilipinoMaterials(){}
    fun onlineAccess(){}
}

//2. What will you use to present the different types of Audio / Video presentation,
// a class or an enum? Why?

interface AuditoryMaterials {
    var audioFileFormat: String
    var audioFrequency: String
    var recordingLength: String
}

interface VisualMaterials {
    var videoFileFormat: String
    var videoQuality: String
    var recordingLength: String
    var refreshRate: String
    var resolution: String
}
class AudioVisualMaterials : AuditoryMaterials, VisualMaterials {
    override var audioFileFormat: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var audioFrequency: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var videoFileFormat: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var videoQuality: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var recordingLength: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var refreshRate: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var resolution: String
        get() = TODO("Not yet implemented")
        set(value) {}
}

//3. Authors and Illustrators seem to have similar data?
// What will you use to present the two a class or an enum or will you keep them as is?

open class Author (firstName: String, middleName: String, lastName: String) {
    val firstName: String = firstName
    val middleName: String = middleName
    val lastName: String = lastName
    val birthDate: Date = Date()
}
class Illustrator(firstName: String, middleName: String, lastName: String): Author(firstName, middleName, lastName){}
