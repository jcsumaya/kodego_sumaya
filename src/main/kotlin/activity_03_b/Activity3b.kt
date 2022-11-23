package activity_03_b
import activity_03_a.upperCase
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {
    var bookName = ArrayList<String>()
    bookName.addAll(listOf("Algebra", "Botany", "Calculus", "Differential Equations", "English", "Filipino"
        , "Geometry", "Astronomy", "Physics", "Chemistry", "Trigonometry", "Biology", "Statistics", "Philosophy", "Sociology", "Psychology", "History"
        , "Literature", "Geology", "Thermodynamics").upperCase())

    isBookInRecord(bookName)
    addBook(bookName)
    removeBook(bookName)
    countBooks(bookName)
    showBooks(bookName)
    searchBookWildSearch(bookName)
    searchBookName(bookName)
}

fun isBookInRecord(bookName: ArrayList<String>) {
    print("Search for a book in the record: ")
    var checkBook = readln().uppercase()
        while (checkBook !in bookName){
            logger.info { "$checkBook is not in the book record." }
            print("Search for a book in the record: ")
            checkBook = readln().uppercase()
        }
    logger.info { "$checkBook is in the book record." }
}
fun addBook(bookName: ArrayList<String>) {
    print("Add a book in record: ")
    var newBook = readln().uppercase()
        while (newBook in bookName) {
            logger.info { "$newBook is already in the book record." }
            print("Add a book in record: ")
            newBook = readln().uppercase()
    }
    bookName.add(newBook)
    logger.info { "Added $newBook in record." }
}


fun removeBook(bookName: ArrayList<String>) {
    print("Remove a book in record: ")
    var deleteBook = readln().uppercase()
        while (deleteBook !in bookName) {
            logger.info { "$deleteBook is not in the book record." }
            print("Remove a book in record: ")
            deleteBook = readln().uppercase()
    }
    bookName.remove(deleteBook)
    logger.info { "$deleteBook has been removed from the book record." }
}

fun countBooks(bookName: ArrayList<String>) {
    var bookSize = bookName.size
    logger.info { "Number of books in record = $bookSize" }
}

fun searchBookWildSearch(bookName: ArrayList<String>) {
    print("String input for Wild Search: ")
    var wildSearch = readln().uppercase()
    var match = ArrayList<String>()
    for (book in bookName){
        if(wildSearch.contains(book)){
            match.add(book)
        }
    }
    logger.info { "Found book names within the string: $match" }
}
fun searchBookName(bookName: ArrayList<String>) {
    print("String input for exact Book Search: ")
    var searchBook = readln().uppercase()
    var match = ArrayList<String>()
    if (searchBook in bookName) {
        match.add(searchBook)
        logger.info { "Found exact match of book names: $match" }
    }
}

fun showBooks(bookName: ArrayList<String>) {
    logger.info { "List of books: $bookName" }
}