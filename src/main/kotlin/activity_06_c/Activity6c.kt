package activity_06_c

//When a customer checks out an item, identify the possible scenarios
//where a cart can not be checked out properly.
//Name at least 5 scenarios.
//Create a function that will check the cart for the exceptions.

 /*
    * Item is out of stock; stockQuantity = 0
    * Item is currently reserved; reservedItem = true
    * Wallet has insufficient balance; walletBalance < itemPrice
    * Payment method not available; enum class paymentMethods status = Offline
    * Voucher invalid; inputVoucher !in voucherList
 */

fun main() {
    var cart = Cart()
    var wallet = UserWallet()
    var items: HashMap<Int, Double> = HashMap()
    var paymentMethod = PaymentMethod()
    var voucher = Voucher()

    var sampleItem1 = Cart.Item()
        sampleItem1.price = 2.0
        sampleItem1.stockQuantity = 5
        sampleItem1.reserved = false

    var sampleItem2 = Cart.Item()
        sampleItem2.price = 5.0
        sampleItem2.stockQuantity = 2
        sampleItem2.reserved = false

    items.put(sampleItem1.stockQuantity, sampleItem1.price)
    items.put(sampleItem2.stockQuantity, sampleItem2.price)

    try{
        cart.checkItemStatus(sampleItem1)
    }catch (e: Exception){
        e.printStackTrace()
    }

//    cart.checkItemStatus(sampleItem)
//    wallet.purchase(sampleItem)
//    paymentMethod.status(CurrentStatus.LOADING)
//    voucher.checkValidity("takeTWO")
}

class UserWallet {
    var balance = 20.0

    class InsufficientBalance(message: String = "Wallet has insufficient balance.") : Exception(message)

    fun purchase(item: Cart.Item, howMany: Int){
        balance -= (item.price * howMany)
            if (balance < 0.0) {
                throw InsufficientBalance()
            }
        item.stockQuantity -= howMany
            if(item.stockQuantity < 0){
                throw Cart.UnavailableItem.ItemNoStock()
            }
        println("Remaining Balance: $balance")
    }
}

class Voucher{
    var list: ArrayList<String> = arrayListOf("ONEpercent", "takeTWO", "THREEpoints",
        "fourMORE", "FIVEoff")

    class VoucherInvalid(message: String = "Voucher input is invalid.") : Exception(message)

    fun checkValidity(voucherInput: String){
        var voucher = Voucher()

        if(voucherInput !in voucher.list){
            throw VoucherInvalid()
        }
    }
}

enum class CurrentStatus{
    ONLINE,
    OFFLINE,
    LOADING,
    UNKNOWN
}

class PaymentMethod{
    class PaymentMethodUnavailable(message: String = "Payment method is not available.") : Exception(message)

    fun status(status: CurrentStatus){
        if(status == CurrentStatus.OFFLINE){
            throw PaymentMethodUnavailable()
        }
    }

}

class Cart {
    sealed class UnavailableItem(message: String) :Exception (message){
        class ItemNoStock(message: String = "Item is out of stock.") : UnavailableItem(message)
        class ReservedItem(message: String = "Item is currently reserved.") : UnavailableItem(message)
    }

    class Item{
        var stockQuantity: Int = 0
        var price: Double = 0.0
        var reserved: Boolean = true
    }

    fun checkItemStatus(item: Item){
        if(item.reserved){
            throw UnavailableItem.ReservedItem()
        }
    }
}