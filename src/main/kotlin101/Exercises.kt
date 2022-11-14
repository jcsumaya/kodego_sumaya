//Given an int n, return the absolute difference between n and 21,
//except return double the absolute difference if n is over 21.

fun diff21(n:Int):Int{
    var difference = kotlin.math.abs(n - 21)
    difference = if(n>21)
                    difference * 2
                 else
                    difference
    return difference
}

fun main(){
    print("Enter a number: ")
    try {
        var number  = readLine().toString().toInt()
        println("diff21(number) : ${diff21(number)}")
    }catch (e:Exception){
        println("Input invalid.")
    }

    println("diff21(1) : ${diff21(1)}")
    println("diff21(22) : ${diff21(22)}")
}