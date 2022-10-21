package activity_01_g
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.

fun main(){
    while(true)
    {
        var input:String? = readln()
        logger.info { if (input == input?.reversed()) {"$input is a Palindrome"}
        else {"$input is not a Palindrome"} }
    }
}