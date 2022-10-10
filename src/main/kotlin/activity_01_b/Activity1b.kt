package activity_01_b
import java.util.*

fun main() {
    var bookTitle:String? = "a".uppercase(Locale.getDefault())
        var booksAtoF = bookTitle?.first() in 'A'..'F'
        var booksGtoL = bookTitle?.first() in 'G'..'L'
        var booksMtoR = bookTitle?.first() in 'M'..'R'
        var booksStoZ = bookTitle?.first() in 'S'..'Z'
    var bookGenre:String? = null
    var bookYear:Int = 0
        var bookYear2000s = bookYear in (2000..2010)
        var bookYear2010s = bookYear in (2011..2020)
        var bookYear2020s = bookYear >= 2021
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