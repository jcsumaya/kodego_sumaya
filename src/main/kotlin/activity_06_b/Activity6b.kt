package activity_06_b

import kotlin.collections.ArrayList

fun main() {
    var bookLibrary: ArrayList<Book> = ArrayList()
    bookLibrary.addAll(arrayListOf(
        Book("Noli Me Tangere", Author("Jose Rizal")),
        Book("The Great Gatsby", Author("F. Scott Fitzgerald")),
        Book("Anna Karenina", Author("Leo Tolstoy")),
        Book("1984", Author("George Orwell")),
        Book("Moby Dick", Author("Herman Melville")),
        Book("The Adventures of Huckleberry Finn", Author("Mark Twain")),
    ))

    bookLibrary[0].reserved = true
    bookLibrary[1].damaged = true
    bookLibrary[5].internalUseOnly = true


    try{
        borrowBook(bookLibrary)
    }catch(e: Exception){
        e.printStackTrace()
    }
}

open class Author (val name: String)

class Book(var title: String, var author: Author){
    var reserved: Boolean = false
    var internalUseOnly: Boolean = false
    var damaged: Boolean = false
}

class Reader{
    var booksBorrowed: ArrayList<Book> = ArrayList()
    var hasUnpaidDues: Boolean = false
}

sealed class BorrowException(message: String) : Exception(message){
    class TooManyItems (message: String = "Cannot borrow. Too many items still borrowed.") : BorrowException(message)
    class UnpaidDues(message: String = "Cannot Borrow. You have unpaid dues.") : BorrowException(message)
    class ReservedBook (message: String = "Cannot Borrow. Book is already reserved.") : BorrowException(message)
    class InternalUseOnly (message: String = "Cannot Borrow. Book is only used in library.") : BorrowException(message)
    class DamagedBook (message: String = "Cannot Borrow. Book needs to be fixed.") : BorrowException(message)
}

fun borrowBook(fromBookLibrary: ArrayList<Book>) {
    var reader = Reader()
    var bookNumber = -1

    for(books in fromBookLibrary){
        if(books in fromBookLibrary)
        bookNumber++
        println("Book #$bookNumber: ${books.title}")
    }

    do {
        print("ADD BOOK #?: ")
        var addBook = readln().toInt()
        reader.booksBorrowed.add(fromBookLibrary[addBook])

        if (reader.booksBorrowed.size > 5) {
            throw BorrowException.TooManyItems()
        }
        if (reader.hasUnpaidDues) {
            throw BorrowException.UnpaidDues()
        }

        for (books in reader.booksBorrowed) {

            if (books.reserved) {
                throw BorrowException.ReservedBook()
            }
            if (books.internalUseOnly) {
                throw BorrowException.InternalUseOnly()
            }
            if (books.damaged) {
                throw BorrowException.DamagedBook()
            }
        }
    }while(reader.booksBorrowed.size != 5)

    println("BORROWED BOOKS: ")
        for (books in reader.booksBorrowed) {
            println(books.title)
        }
}