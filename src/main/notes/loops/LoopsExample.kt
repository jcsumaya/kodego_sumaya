fun main(){
    repeat(10) {
        println("$it -> Chok")
    }

    for(counter in 0..10){
        println("$counter : for loop")
    }

    for(counter in 0 until 10){
        println("$counter : for loop")
    }

    for(counter in 0..10 step 2){
        println("$counter : for loop")
    }

    for(counter in 0 downTo 10){
        println("$counter : for loop")
    }
}