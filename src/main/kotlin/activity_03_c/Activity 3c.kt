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
    removeFromCart()
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
    var removeItem:String
    do{
        print("Remove which item from cart?: ")
        println(cartItems)
        removeItem = readln().uppercase()
    }while(removeItem !in cartItems.keys)

    if(removeItem in cartItems.keys){
        print("Remove how many $removeItem from cart?: ")
        var removeItemQuantity = readln().toIntOrNull()
            while(removeItemQuantity == null || removeItemQuantity !in 1..cartItems[removeItem]!!){
                logger.error { "Invalid item quantity." }
                println("$cartItems")
                print("Remove how many $removeItem from cart?: ")
                removeItemQuantity = readln().toIntOrNull()
            }

        cartItems[removeItem] = (cartItems[removeItem]!!).minus(removeItemQuantity)
            if(cartItems[removeItem] == 0){
                cartItems.remove(removeItem)
            }
    }
}