package control_statements

fun main(args: Array<String>){
    var age  = 10
    var adultAgeRange: IntRange = 18 .. 100

    if((age>= 18) && (age < 100)){
        println("You are now an adult")
    }else{
        println("You are still a minor")
    }

    if((age>= 18) and (age < 100)){
        println("You are now an adult")
    }else{
        println("You are still a minor")
    }

    if(age in adultAgeRange){
        println("You are now an adult")
    }else{
        println("You are still a minor")
    }

}
