package data_structures

fun main(){
    var intRange = 18.downTo(10)

    var doubleRange = (0.0).rangeTo(10.0)
    var floatRange = (0.0f).rangeTo(10.0f)
    var charValues = 'a'.rangeTo('e')


    print("0.1 : ")
    if( 0.1 in doubleRange){
        println("Value in Double Range")
    }else{
        println("Not in  Value in Double Range")
    }

    print("10.000000001 : ")
    if( 10.000000001 in doubleRange){
        println("Value in Double Range")
    }else{
        println("Not in  Value in Double Range")
    }

    var intRangeIterator = intRange.iterator()

    while(intRangeIterator.hasNext()){
        println("ITERATE : ${intRangeIterator.next()}")
    }

}