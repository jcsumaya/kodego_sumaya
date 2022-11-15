
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
    var apple:Fruits = Fruits("Apple", 20.0)
    var banana:Fruits = Fruits("Banana", 15.0)
    var mango:Fruits = Fruits("Mango", 30.0)
    var grapes:Fruits = Fruits("Grapes", 25.0)
    var orange:Fruits = Fruits("Orange", 20.0)

    var appleShake:Shake = Shake("Apple Shake", 40.0)
    var bananaShake:Shake = Shake("Banana Shake", 35.0)
    var mangoShake:Shake = Shake("Mango Shake", 50.0)
    var melonShake:Shake = Shake("Melon Shake", 45.0)
    var orangeShake:Shake = Shake("Orange Shake", 40.0)

    var appleJuice:Juices = Juices("Apple Juice", 30.0)
    var bananaJuice:Juices = Juices("Banana Juice", 25.0)
    var mangoJuice:Juices = Juices("Mango Juice", 30.0)
    var grapeJuice:Juices = Juices("Grape Juice", 35.0)
    var orangeJuice:Juices = Juices("Orange Juice", 30.0)

    var cheese:Sandwiches = Sandwiches("Cheese", 30.0)
    var bacon:Sandwiches = Sandwiches("Bacon", 45.0)
    var chicken:Sandwiches = Sandwiches("Chicken", 40.0)
    var peanut:Sandwiches = Sandwiches("Peanut", 25.0)
    var chocolate:Sandwiches = Sandwiches("Chocolate", 30.0)

    var caesar:Salad = Salad("Caesar", 30.0)
    var greek:Salad = Salad("Greek", 35.0)
    var green:Salad = Salad("Green", 40.0)
    var tuna:Salad = Salad("Tuna", 35.0)
    var italian:Salad = Salad("Italian", 30.0)

}

data class Customer(var address:String, var mobileNumber:String,
                    var firstName:String, var lastName:String){

}
