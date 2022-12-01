package activity_06_c
 /*
    * Item is out of stock; stockQuantity = 0
    * Item is currently reserved; reservedItem = true
    * Wallet has insufficient balance; walletBalance < itemPrice
    * Payment method not available; enum class paymentMethods status = Offline
    * Voucher invalid; inputVoucher !in voucherList
 */

fun main() {
    var wallet = UserWallet()
    var items: HashMap<Int, Double> = HashMap()
    var paymentMethod = PaymentMethod()
    var voucher = Voucher()

    var sampleItem1 = Item()
        sampleItem1.price = 2.0
        sampleItem1.stockQuantity = 1
        sampleItem1.reserved = true

    var sampleItem2 = Item()
        sampleItem2.price = 5.0
        sampleItem2.stockQuantity = 10
        sampleItem2.reserved = false

    items.put(sampleItem1.stockQuantity, sampleItem1.price)
    items.put(sampleItem2.stockQuantity, sampleItem2.price)

    try{
        Item().checkStatus(sampleItem1)
    }catch (e: Exception){
        e.printStackTrace()
    }

//    Item().checkStatus(sampleItem)
//    wallet.purchase(sampleItem, 1)
//    paymentMethod.status(CurrentStatus.LOADING)
//    voucher.checkValidity("takeTWO")
}

class UserWallet {
    var balance = 20.0

    class InsufficientBalance(message: String = "Wallet has insufficient balance.") : Exception(message)

    fun purchase(item: Item, howMany: Int){
        balance -= (item.price * howMany)
            if (balance < 0.0) {
                throw InsufficientBalance()
            }
        item.stockQuantity -= howMany
            if(item.stockQuantity < 0){
                throw Item.NoStock()
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

class Item {
        var stockQuantity: Int = 0
        var price: Double = 0.0
        var reserved: Boolean = true

    class NoStock(message: String = "Item is out of stock.") : Exception(message)

    class Reserved(message: String = "Item is currently reserved.") : Exception(message)

    fun checkStatus(item: Item){
        if(item.reserved){
            throw Item.Reserved()
        }
    }
}
