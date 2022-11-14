package basic

fun main(args: Array<String>){
    val minorAgeRange:IntRange = 0 .. 17
    val negativeRange = -10 .. 0
    var lowercaseCharacters:CharRange = 'a' .. 'z'
    var uppercaseCharacters = 'A' .. 'Z'

//    minorAgeRange.forEach { println("Minor : $it") }

//    lowercaseCharacters.reversed().forEach { println(it) }

    //for(int index =0; i < size; index++)
//    for(character in uppercaseCharacters){
//        println("$character")
//    }

    for(age in minorAgeRange.filter { it >= 10 }){
        println("Filtered Age : $age")
    }
}
