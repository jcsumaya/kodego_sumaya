package activity_01_j
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

//Using Activity 01 - C
//Implement a process where items are added to the grocery cart.
//User : Cashier
//Goal : List of Items bought, how many items were bought and total cost.

fun main() {
    var vegetable = mutableMapOf(("ginger" to 15.00) , ("eggplant" to 20.00))
    var fruit = mutableMapOf(("apple" to 15.00) , ("banana" to 20.00))
    var meat = mutableMapOf(("1kg chicken" to 180.00) , ("1kg beef" to 220.00))
    var dairy = mutableMapOf(("cheese" to 40.00) , ("milk" to 80.00) , ("egg" to 9.00))
    var beverage = mutableMapOf(("coffee" to 10.00) , ("juice" to 15.00))
    var bread = mutableMapOf(("muffin" to 35.00) , ("milk bread" to 50.00))
    var hygiene = mutableMapOf(("toothbrush" to 50.00) , ("soap" to 60.00))
    var cosmetic = mutableMapOf(("perfume" to 200.00) , ("lotion" to 220.00))
    var appliance = mutableMapOf(("television" to 1500.00) , ("electric fan" to 450.00))
    var itemList = mutableListOf(vegetable, fruit, meat, dairy, beverage, bread, hygiene, cosmetic, appliance)
    logger.info { "List of items : $itemList" }

    var shoppingCart = ArrayList<Double>()
    shoppingCart.add(vegetable["ginger"]!!)
    shoppingCart.add(bread["milk bread"]!!)
    shoppingCart.add(appliance["television"]!!)

    var numberOfItems = shoppingCart.size
    logger.info {"Total Number of Item/s = $numberOfItems"}

    var totalCost = shoppingCart.sum()
    logger.info {"Total Cost = $totalCost"}

}
