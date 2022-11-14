package activities.activity_01_i
import mu.KotlinLogging
import java.time.LocalDateTime

private val logger = KotlinLogging.logger{}

//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.

fun main() {
    var bookList = ArrayList<String>()
    var authorList = ArrayList<String>()
    var borrowerID = ArrayList<Int>()
    var borrowerList = ArrayList<String>()
    var borrowPeriod = ArrayList<Int>()
    var dateBorrowed = ArrayList<LocalDateTime>()
    var dateNow = LocalDateTime.now()
    var returnDeadline = ArrayList<LocalDateTime>()

    do {
        logger.info { "Input student ID number: " }
        var studentNumber = readln().toInt()
        logger.info { "Input last name: " }
        var lastName = readln()
        logger.info { "Input book author: " }
        var bookAuthor = readln()
        logger.info { "Input book title: " }
        var bookTitle = readln()

        logger.info { "Borrow for how many days?: " }
        var borrow = readln().toIntOrNull()
        if (borrow == null || borrow > 14 || borrow < 1) {
            logger.error { "Students are only allowed to borrow for 1 day up to maximum of 14 days." }
        }
        borrowerID.add(studentNumber)
        borrowerList.add(lastName)
        authorList.add(bookAuthor)
        bookList.add(bookTitle)
        borrowPeriod.add(borrow!!)
        dateBorrowed.add(dateNow)
        returnDeadline.add(dateNow.plusDays(borrow.toLong()))

        logger.info { "Borrowing another book?: Y/N" }
        var yesOrNo = readln()
        var plusBorrow = true
        if (yesOrNo.uppercase() == "N") {
            plusBorrow = false
        }

    } while (plusBorrow)

        logger.info { "Display book borrowed, who borrowed and how long it can be borrowed: Y/N" }
        var yesOrNo = readln()
        if (yesOrNo.uppercase() == "Y") {
            logger.info { "Student Number : $borrowerID" }
            logger.info { "Student Name : $borrowerList" }
            logger.info { "Book Author : $authorList" }
            logger.info { "Book Title : $bookList" }
            logger.info { "Borrowed for how many days : $borrowPeriod" }
            logger.info { "Date Started : $dateBorrowed" }
            logger.info { "Return Deadline : $returnDeadline" }
        }
}