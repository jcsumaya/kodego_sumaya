package activity_05_c

open class Product {
    var name: String = ""
    var price: Double = 0.0
}

class Cart{
    var items:HashMap<Product, Int> = HashMap()

    fun addItems(product:Product, quantity:Int){
        items.put(product, quantity)
    }

    fun removeItem(product: Product, removeHowMany: Int){
        items[product] = items.getValue(product).minus(removeHowMany)
                if (items.getValue(product) <= 0) {
                    items.remove(product)
                }
            }
}

fun totalCost(cart: Cart) {
    for (item in cart.items){
        var eachItemCost = item.key.price * item.value
        println("Total cost = $eachItemCost")
    }
}

fun main() {
    var cart = Cart()
    var apple = Product()
    apple.name = "Apple"
    apple.price = 10.0

    cart.addItems(apple, 3)
    cart.removeItem(apple, 2)
    totalCost(cart)
}