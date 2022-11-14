package control_statements

fun main(args: Array<String>){
    var age  = 10
    var adultAgeRange: IntRange = 18 .. 24

    println("For loop")
    for(age in adultAgeRange){
        println(age)
    }

    println("Step")
    for(age in adultAgeRange step 2){
        println(age)
    }

    println("downTo")
    for(age in 24 downTo 18 step 2){
        println(age)
    }

    println("until")
    for(index in 0 until 4){
        println(index)
    }


    do{

    }while (true)

    while (true){}
}
