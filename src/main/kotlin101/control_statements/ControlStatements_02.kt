package control_statements

fun main(){
    repeat(5){
        println("Repeat Message!")
    }

    repeat(2){ value ->
        println("Index : $value")
    }
}
