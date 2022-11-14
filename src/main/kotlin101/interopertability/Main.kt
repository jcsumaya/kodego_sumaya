package interopertability

import Person

fun main(){
    var person: Person = Person()
    person.address = "Marikina"
    person.name = "Marco Valmores"

    println("${person.name} is from ${person.address}")
}