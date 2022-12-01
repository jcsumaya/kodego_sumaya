package activity_07
import activity_06_c.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CartChecker {
    /*
 * Item is out of stock; stockQuantity <= 0
 * Item is currently reserved; reservedItem = true
 * Payment method not available; enum class paymentMethods status = Offline
 * Voucher invalid; inputVoucher !in voucherList
 * Wallet has insufficient balance; walletBalance < itemPrice
    */

    @Test
    fun itemNoStock() {
        assertThrows<Item.NoStock> {
            Item().stockQuantity <= 0
                UserWallet().purchase(Item(), 2)
        }
    }

    @Test
    fun itemReserved() {
        assertThrows<Item.Reserved> {
            Item().reserved = true
                Item().checkStatus(Item())
        }
    }

    @Test
    fun paymentMethodUnavailable(){
        assertThrows<PaymentMethod.PaymentMethodUnavailable> {
            PaymentMethod().status(CurrentStatus.OFFLINE)
        }
    }

    @Test
    fun voucherInvalid(){
        assertThrows<Voucher.VoucherInvalid> {
            Voucher().checkValidity("asdfghjkl")
        }
    }

//    @Test
//    fun insufficientBalance() {
//        assertThrows<UserWallet.InsufficientBalance> {
//            UserWallet().purchase(Item(), 1)
//        }
//    }
}

