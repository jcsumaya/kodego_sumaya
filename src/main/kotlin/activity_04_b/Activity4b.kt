package activity_04_b

import activity_03_a.upperCase
import java.util.Date

open class Author (firstName: String, middleName: String, lastName: String) {
    val firstName: String = firstName
    val middleName: String = middleName
    val lastName: String = lastName
    val birthDate: Date = Date()
}

class Illustrator(firstName: String, middleName: String, lastName: String): Author(firstName, middleName, lastName){}

class Article(title: String, author: Author){
    val title: String = title
    val author: Author = author
    var content: String = ""
}

class Publisher(name: String) {
    val name: String = name
    var address: String = ""
    var dateEstablished: Date = Date()
}
class Book(title: String, author: Author){
    var title: String = title
    var author: Author = author
    var yearPublished: Date = Date()
    var edition: String = ""
    var isbn: String = ""
    var publisher: Publisher = Publisher("")
    var chaptersList: ArrayList<String> = ArrayList()
    var pages: Long = 0L
}

class Magazine(title: String, author: Author){
    var title: String = title
    var editor: Author = author
    var monthPublished: Date = Date()
    var yearPublished: Date = Date()
    var articles: ArrayList<Article> = ArrayList()
}

class Newspaper(name: String){
    var name: String = name
    var dayPublished: Date = Date()
    var monthPublished: Date = Date()
    var yearPublished: Date = Date()
    var headline: String = ""
    var articles: ArrayList<Article> = ArrayList()
}

class Comics(title: String, illustrators: Illustrator){
    var title:String = title
    var monthPublished: Date = Date()
    var yearPublished: Date = Date()
    var illustrators: ArrayList<Illustrator> = arrayListOf(illustrators)
    var publisher: Publisher = Publisher("")
}

class AudioVideoRecording(title: String) {
    val title: String = title
    val publisher: Publisher = Publisher("")
    var lengthInHours: Double = 0.0
    var dateRecorded: Date = Date()
    var hasVideo: Boolean = false
    var hasAudio: Boolean = false
}

// Create a search function to search for the title of a magazine, newspaper, comics.
// Create a function that will list the name of the magazine, newspaper, comics or book, author has written in.

fun searchTitle() {
    var magazine = Magazine("BizNews", Author("Cha", "Tuk", "Chak"))
    var newspaper = Newspaper("Rapple")
    var comics = Comics("Marvel", Illustrator("Stan", "See", "Lee"))

    var titleList = arrayListOf(magazine.title, newspaper.name, comics.title).upperCase()
    print("Search for title of magazine, newspaper, comics: ")
    var searchTitle = readln().uppercase()
    var match = ArrayList<String>()
        if (searchTitle in titleList) {
            match.add(searchTitle)
            println ("Found: $match")
        }
}