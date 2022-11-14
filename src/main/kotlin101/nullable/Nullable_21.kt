package nullable

fun main(){
    println("Convert : ${(convert(null))}")
    println("Convert : ${(convert(1234))}")

//    println("Converter : ${(converter(null))}")
//    println("Converter : ${(converter(1234))}")
}

fun convert(value: Any?) : String?{
    return value.toString()
}

fun converter(value:Any) : String{
    return value.toString()
}