
open class Product{
    var name: String = ""
        private set
    var price: Double = 0.0

    constructor(name: String, price:Double){
        this.name = name
        this.price = price
    }

}

class Fruits (name: String, price: Double): Product(name, price){
    var quantity: Float = 0.0F
    var quantityUnits:String = "per Piece"
}

class Shake (name: String, price: Double): Product(name, price){
    var size: Any? = null
    var ingredients : ArrayList<String> = ArrayList()
    var addOns: ArrayList<Any> = ArrayList()
}

class Juices (name: String, price: Double): Product(name, price){
    var size: Any = ""
    var ingredients : ArrayList<String> = ArrayList()
}

class Sandwiches (name: String, price: Double): Product(name, price){
    var ingredients : ArrayList<String> = ArrayList()
    var addOns: ArrayList<Any> = ArrayList()
    var breadType:Any = ""
}

class Salad (name: String, price: Double): Product(name, price){
    var ingredients : ArrayList<String> = ArrayList()
    var dressing: Any = ""
    var addOns: ArrayList<Any> = ArrayList()
    var size: Any = ""
}

enum class OrderStatus {
    SENT_TO_KITCHEN,
    BEING_PREPARED,
    FOR_PICKUP,
    FOR_DELIVERY,
    DELIVERED,
    PICKED_UP,
    CANCELLED,
    UNKNOWN
}

class Cart(var customer: Customer){
    var uniqueID:String = ""
    var items:HashMap<Product, Float> = HashMap()
    var status:OrderStatus = OrderStatus.UNKNOWN
        fun updateOrder(status: OrderStatus){
            this.status = status
        }

        fun addItems(product:Product, quantity:Float){
            items.put(product, quantity)
//        items[product] = quantity
        }
}

fun main() {
    var fruits = ArrayList<Fruits>()
    fruits.addAll(mutableListOf(Fruits("Apple", 25.0), Fruits("Banana", 30.0),
        Fruits("Mango", 30.0), Fruits("Grapes", 25.0), Fruits("Orange", 20.0)))

    var shake = ArrayList<Shake>()
    shake.addAll(mutableListOf(Shake("Apple Shake", 40.0), Shake("Banana Shake", 35.0),
        Shake("Mango Shake", 50.0), Shake("Melon Shake", 45.0), Shake("Orange Shake", 40.0)))

    var juice = ArrayList<Juices>()
    juice.addAll(mutableListOf(Juices("Apple Juice", 30.0), Juices("Banana Juice", 25.0),
        Juices("Mango Juice", 30.0), Juices("Grape Juice", 35.0), Juices("Orange Juice", 30.0)))

    var sandwiches = ArrayList<Sandwiches>()
    sandwiches.addAll(mutableListOf(Sandwiches("Cheese", 30.0), Sandwiches("Bacon", 45.0),
        Sandwiches("Chicken", 40.0), Sandwiches("Peanut", 25.0), Sandwiches("Chocolate", 30.0)))

    var salad = ArrayList<Salad>()
    salad.addAll(mutableListOf(Salad("Caesar", 30.0), Salad("Greek", 35.0),
        Salad("Green", 40.0), Salad("Tuna", 35.0), Salad("Italian", 30.0)))
}

data class Customer(var address:String, var mobileNumber:String,
                    var firstName:String, var lastName:String){

}
