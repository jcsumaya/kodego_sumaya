fun main() {
    var userName:String? = null
    var needAnyhelp:String? = null

    print("Enter your name: ")
    userName = readLine().toString()
    println("Hi $userName")
    println("Do you need any help? (Y/N)")
    needAnyhelp = readLine().toString()

    if(needAnyhelp.lowercase() == "y") {
        println("How may I help you?")
    }else if(needAnyhelp.lowercase() == "n") {
        println("Don't forget I am here ...")
    }else{
        println("Oh okay ...")
    }
    println("Thank you very much")
}