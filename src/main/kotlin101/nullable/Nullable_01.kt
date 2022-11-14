package nullable

var systemName:String? = null
var intValue:Int? = null

fun main(){
    var username: String? = null
    var fullname: String? = "Rosepal"

//    if(username != null)
//        println("Username Length : ${username.length}")
//    if(fullname != null)
//        println("Fullname Length : ${fullname.length}")

//    println("Username Length : ${username?.length}")
//    println("Fullname Length : ${fullname?.length}")
//    println("Username Length : ${username?.length ?: "No input"}")
//    println("Fullname Length : ${fullname?.length ?: "undefined"}")
//    //assertion
//    println("Username Length : ${username!!.length}")
//    println("Fullname Length : ${fullname!!.length}")

    username?.let {
        println("Proceed with username : $it")
    }

    fullname?.let {
        println("Proceed with fullname : $it")
    }

//    var sample = ""
//    sample?.length
//    sample!!.length
}