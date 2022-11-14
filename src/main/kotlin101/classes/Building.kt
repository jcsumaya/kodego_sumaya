package classes

data class Building(var name: String,var address : String,){
  var height:Double = 0.0
}

class Ship(var name: String,){

}


fun main(){
  var bldg = Building("SM MEGA MALL", "EDSA ORTIGAS")
  var somebldg = Building("Gokongwei Bldg", "Taft Ave")
  var ship = Ship("Titanic")

  bldg.name = "Gokongwei Bldg"

  println("${bldg.name} is in ${bldg.address}")
}

//equals()
//hashCode()
//toString()
//copy()
//component1(), component2(),