//When squirrels get together for a party, they like to have cigars.
//A squirrel party is successful when the number of cigars is between 40 and 60,
//inclusive. Unless it is the weekend,
//in which case there is no upper bound on the number of cigars.
//Return true if the party with the given values is successful,
//or false otherwise.

fun cigarParty(cigars:Int, isWeekend:Boolean):Boolean {
    var result = false
    val CIGAR_MIN = 40
    val CIGAR_MAX = 60

    if(isWeekend) {
        if (cigars >= CIGAR_MIN)
            result = true
    }else {
        if (cigars in CIGAR_MIN..CIGAR_MAX)
            result = true
    }
    return result
}

fun cigarPartyv2(cigars:Int, isWeekend:Boolean) =
    if((isWeekend && (cigars >= 40)) ||
        (!isWeekend && (cigars in 40..60))){
        true
    }else{
        false
    }

fun main(){
    println("cigarParty(61, false) : ${cigarParty(61, false)}")
    println("cigarParty(61, true) : ${cigarParty(61, true)}")
    println("cigarParty(31, true) : ${cigarParty(31, true)}")
    println("cigarParty(31, false) : ${cigarParty(31, false)}")
    println("cigarParty(41, true) : ${cigarParty(41, true)}")
    println("cigarParty(41, false) : ${cigarParty(41, false)}")
}
