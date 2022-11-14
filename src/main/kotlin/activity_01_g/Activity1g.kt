package activity_01_g
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
fun main() {
    var input = readln()
    var leftCount = 0
    var rightCount = input.length - 1

    while (leftCount < rightCount)
    {
        leftCount++
        rightCount--
        if(input[leftCount] != input[rightCount]){
            logger.info { "Not a Palindrome" }
        }else logger.info { "Palindrome" }
        leftCount = 0
        rightCount = 0
    }
}


// USING .reversed()

//fun main(){
//    while(true)
//    {
//        var input:String? = readln()
//        logger.info { if (input == input?.reversed()) {"$input is a Palindrome"}
//        else {"$input is not a Palindrome"} }
//    }
//}
