package activity_03_c
import activity_03_a.upperCase
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

var productList = ArrayList<String>()
var cartItems = HashMap<String, Int>()
fun main() {
    productList.addAll(listOf("Apple", "Banana", "Carrots", "Milk", "Bread", "Potato"
        , "Chicken", "Butter", "Eggs", "Lettuce", "Garlic", "Soap", "Toothpaste", "Shampoo", "Cereal", "Alcohol", "Oil"
        , "Beef", "Fish", "Lotion").upperCase())
    println("List of grocery items: $productList")

    addToCart()
    addToCart()
    checkOut()

}

fun addToCart() {
    print("Add item into cart: ")
    var item = readln().uppercase()
    while (item !in productList) {
        logger.error { "$item not found!" }
        print("Add item into cart: ")
        item = readln().uppercase()
    }
    print("How many $item?: ")
    var quantity = readln().toIntOrNull()
        while (quantity == null || quantity !in 0..99){
            logger.error { "Invalid quantity (only choose from 1-99): " }
            quantity = readln().toIntOrNull()
        }
    cartItems.put(item, quantity!!)
    logger.info { "Added $quantity $item/s in cart." }
}

fun checkOut(){
    logger.info{"Grocery items checked out: $cartItems"}
}

fun removeFromCart(){
    TODO()
}