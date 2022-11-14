package activities.activity_01_j
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

//Using Activity 01 - C
//Implement a process where items are added to the grocery cart.
//User : Cashier
//Goal : List of Items bought, how many items were bought and total cost.

fun main() {

    var vegetable = mutableMapOf(("ginger" to 15.00), ("eggplant" to 20.00))
    var fruit = mutableMapOf(("apple" to 45.00), ("banana" to 30.00))
    var dairy = mutableMapOf(("cheese" to 40.00), ("egg" to 9.00))
    var beverage = mutableMapOf("juice" to 20.00)
    var hygiene = mutableMapOf(("toothbrush" to 50.00), ("soap" to 60.00))
    var cosmetic = mutableMapOf(("perfume" to 200.00), ("lotion" to 220.00))
    var appliance = mutableMapOf(("television" to 1500.00), ("electric fan" to 450.00))

    var itemList = mutableListOf("\n VEGETABLES $vegetable \n FRUITS $fruit \n DAIRY $dairy \n BEVERAGE $beverage \n " +
            "HYGIENE $hygiene \n COSMETIC $cosmetic \n APPLIANCE $appliance \n")
    println("List of items : $itemList")

    var shoppingCart = HashMap<String, Int>()
    shoppingCart.put("perfume", 3)
    shoppingCart.put("television", 1)
    shoppingCart.put("soap", 2)

    var shoppingCost = HashMap<Double, Int>()
    shoppingCost.put(cosmetic["perfume"]!!, 3)
    shoppingCost.put(appliance["television"]!! , 1)
    shoppingCost.put(hygiene["soap"]!! , 2)

    var totalCost = 0.0
    for(item in shoppingCost) {
        totalCost += (item.key * item.value)
    }
    logger.info {"Shopping Cart: $shoppingCart"}

    var numberOfItems = shoppingCart.values.sum()
    logger.info {"Total Number of Item/s = $numberOfItems"}

    logger.info {"Total Cost = $totalCost"}

}