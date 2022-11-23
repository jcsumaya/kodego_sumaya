package activity_04_c

import java.util.*

class Poultry {
    var weight:Double = 0.0
    var unit:String = ""
    var bodyPart:String = ""
    var cutType:String = ""
    var brand:String = ""
}

class Fish {
    var weight:Double = 0.0
    var unit:String = ""
    var bodyPart:String = ""
    var cutType:String = ""
    var breed:String = ""
    var boneless:Boolean = false
    var brand:String = ""
}

class CannedGoods {     //Soup, tuna, fruit, beans, vegetables, pasta sauce, etc.
    var weight:Double = 0.0
    var unit:String = ""
    var imported:Boolean = false
    var brand:String = ""
    var flavor:String = ""
}

class Snacks {      //Chips, pretzels, popcorn, crackers, nuts, etc.
    var weight:Double = 0.0
    var unit:String = ""
    var imported:Boolean = false
    var brand:String = ""
    var flavor:String = ""
}

class FrozenProducts {      //Pizza, fish, potatoes, ready meals, ice cream, etc.
    var weight:Double = 0.0
    var unit:String = ""
    var readyMeal:Boolean = false
    var brand:String = ""
}

class Fruits {
    var weight:Double = 0.0
    var unit:String = ""
    var seasonal:Boolean = false
    var seedless:Boolean = false
}

class Vegetables {
    var weight:Double = 0.0
    var unit:String = ""
    var seasonal:Boolean = false
}

class Condiments {      //Black pepper, oregano, cinnamon, sugar, olive oil, ketchup, mayonnaise, etc.
    var weight:Double = 0.0
    var brand:String = ""
    var unit:String = ""
    var size:String = ""
}

class Furniture {       //table, chairs, cabinet
    var materialType:String = ""
    var outdoorType:Boolean = false
    var color:String = ""
    var weight: Double = 0.0
    var unit:String = ""
    var brand = ""
}

class Appliances {      //television, clock
    var wireless:Boolean = false
    var shape:String = ""
    var brand:String = ""
    var voltage:Int = 0
}

class Clothes {
    var size:String = ""
    var color:String = ""
    var brand:String = ""
}

class Pet {     //Pet food, kitty litter, chew toys, pet treats, pet shampoo, etc.
    var weight:Double = 0.0
    var unit:String = ""
    var brand:String = ""
    var flavor:String = ""
    var scent:String = ""
}

class SanitaryProducts {        //Shampoo, conditioner, deodorant, toothpaste, dental floss, etc.
    var volume:Double = 0.0
    var unit:String = ""
    var brand:String = ""
    var size:String = ""
}

class Deli {        //Cheese, salami, ham, turkey, etc.
    var weight:Double = 0.0
    var unit:String = ""
    var size:String = ""
    var brand:String = ""
}

class HealthCare {      //Saline, band-aid, cleaning alcohol, pain killers, antacids, etc.
    var volume:Double = 0.0
    var unit:String = ""
    var brand:String = ""
    var prescription:Boolean = false
}

class Dairy {       //Butter, cheese, eggs, milk, yogurt, etc.
    var weight:Double = 0.0
    var unit:String = ""
    var expiration: Date = Date()
}

class Beverages {       //Coffee, teabags, milk, juice, soda, beer, wine, etc.
    var volume:Double = 0.0
    var unit:String = ""
    var size:String = ""
    var brand:String = ""
    var alcoholic:Boolean = false
}

class Baking {      //Flour, powdered sugar, baking powder, cocoa etc.
    var weight:Double = 0.0
    var unit:String = ""
    var flavor:String = ""
    var brand:String = ""
}

class CleaningSupply {      //Laundry detergent, dish soap, dishwashing liquid, paper towels, tissues, trash bags, aluminum foil, zip bags
    var weight:Double = 0.0
    var volume:Double = 0.0
    var unit:String = ""
    var size:String = ""
    var brand:String = ""
    var scent:String = ""
}