package activity_01_c
import java.util.Date

//You are tasked to automate an inventory system for a grocery.
//Identify the items that can be bought in a grocery store.
//After listing the different items, identify the characteristics of the items.
//You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.
fun main () {
    //items and categories
    var ginger:Int? = null
    var eggplant:Int? = null
        var vegetable = mutableListOf(ginger,eggplant)
    var apple:Int? = null
    var banana:Int? = null
        var fruit = mutableListOf(apple,banana)
    var chicken:Int? = null
    var beef:Int? = null
        var meat = mutableListOf(chicken,beef)
    var cheese:Int? = null
    var milk:Int? = null
    var egg:Int? = null
        var dairy = mutableListOf(cheese,milk, egg)
    var coffee:Int? = null
    var juice:Int? = null
        var beverage = mutableListOf(coffee,juice)
    var muffin:Int? = null
    var milkBread:Int? = null
        var bread = mutableListOf(muffin,milkBread)
    var toothBrush:Int? = null
    var soap:Int? = null
        var hygiene = mutableListOf(toothBrush,soap)
    var perfume:Int? = null
    var lotion:Int? = null
        var cosmetic = mutableListOf(perfume,lotion)
    var television:Int? = null
    var electricFan:Int? = null
        var appliance = mutableListOf(television,electricFan)

    var date:Date? = null
    var cost:Double? = null
    var stockQuantity:Int? = null
    var weight:Double? = null
    var itemPrice:Double? = null
    var soldQuantity:Int? = null
    var totalPrice:Double? = null
    var isMember:Boolean? = false

}