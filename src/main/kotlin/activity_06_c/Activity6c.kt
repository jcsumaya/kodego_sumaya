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

class Cart {
    sealed class UnavailableItem(message: String) :Exception (message){
        class ItemNoStock(message: String = "Item is out of stock.") : UnavailableItem(message)
        class ReservedItem(message: String = "Item is currently reserved.") : UnavailableItem(message)
    }

    class InsufficientBalance(message: String = "Wallet has insufficient balance.") : Exception(message)

    class PaymentMethodUnavailable(message: String = "Payment method is not available.") : Exception(message)

    class VoucherInvalid(message: String = "Voucher input is invalid.") : Exception(message)

    class Item{
        var stockQuantity: Int = 0
        var itemPrice: Double = 0.0
        var reserved: Boolean = false
    }

    class UserWallet{
        var balance: Double = 0.0
    }

    enum class PaymentMethodStatus{
        ONLINE,
        OFFLINE,
        LOADING,
        UNKNOWN
    }

    class Voucher{
        var list: ArrayList<String> = ArrayList()
    }

    fun checkItemStatus(item: Item){
        var userWallet = UserWallet()
        var inputVoucher = Voucher()

        if(item.stockQuantity <= 0){
            throw UnavailableItem.ItemNoStock()
        }
        if(!item.reserved){
            throw UnavailableItem.ReservedItem()
        }
    }

    fun checkVoucher(voucherInput: String){
        var voucher = Voucher()

        if(voucherInput !in voucher.list){
            throw VoucherInvalid()
        }
    }
}