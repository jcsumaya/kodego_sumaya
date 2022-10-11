package activity_01_b
import java.util.*

//You are tasked to automate a school’s library.
//Identify the items that can be borrowed in a Library.
//After listing the different items, identify the characteristics of the items.
//Use the proper data types.
fun main() {
    var bookTitle:String? = "".uppercase(Locale.getDefault())
        var booksAtoF = bookTitle?.first() in 'A'..'F'
        var booksGtoL = bookTitle?.first() in 'G'..'L'
        var booksMtoR = bookTitle?.first() in 'M'..'R'
        var booksStoZ = bookTitle?.first() in 'S'..'Z'
    var bookGenre:String? = null
    var placePublished:String? = null
    var yearPublished:Int = 0
        var Year2000s = yearPublished in (2000..2010)
        var Year2010s = yearPublished in (2011..2020)
        var Year2021 = yearPublished >= 2021
    var bookAuthor:String? = null
    var quantity:Int = 0
    var isAvailable = true
        if (quantity >= 1) print(isAvailable) else print(false)
    var isBorrowable:Boolean? = null
    var callNumber:Int? = null
    var studentName:String? = null
    var studentNumber:Int? = null
    var date:Date? = null
    var checkIn:Date? = null
    var checkOut:Date? = null
    var timesOut:Int? = null
    var lateFee:Double? = null
}