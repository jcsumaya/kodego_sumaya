package activity_01_i
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.

fun main() {
    var book:String? = null
    var bookList = ArrayList<String>()

    var author:String? = null
    var authorList = ArrayList<String>()

    var isbn:String? = null
    var isbnList = ArrayList<String>()

    var isAvailable:Boolean = false
    var bookAvailability = ArrayList<Boolean>()

    var borrower:String? = null
    var borrowerList:ArrayList<String>

    var borrowDays: Int? = null
    var borrowPeriod = ArrayList<Int>()



}