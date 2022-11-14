package activity_02_b
import mu.KotlinLogging
import java.util.*
import kotlin.collections.HashMap

private val logger = KotlinLogging.logger{}

//Implement Activity 01 -  B using data structure.

fun main() {
    var bookTitle = ArrayList<String>()
    var bookGenre = ArrayList<String>()
    var placePublished = ArrayList<String>()
    var yearPublished = ArrayList<Int>()
    var bookAuthor = ArrayList<String>()
    var quantity = HashSet<Int>()
    var isAvailable = ArrayList<Boolean>()
    var isBorrowable = ArrayList<Boolean>()
    var callNumber = ArrayList<Int>()
    var studentNameAndNumber = HashMap<String, Int>()
    var date = ArrayList<Date>()
    var timesOut = ArrayList<Int>()
    var lateFee = HashSet<Int>()
}