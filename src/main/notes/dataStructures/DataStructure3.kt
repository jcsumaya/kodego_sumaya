import mu.KotlinLogging
import java.util.LinkedList


private val logger = KotlinLogging.logger{}
fun main() {
//    var listNames = ArrayList<String>()
//    var listLocations = LinkedList<String>()
//
//    var mapName = HashMap<String, String>()
//    var mapLocation = LinkedHashMap<String, String>()
//
//    var setName = HashSet<String>() //must have unique entries
//    var setLocation = LinkedHashSet<String>()
//
//    var set:Set<String> = HashSet<String>()
//    var map:Map<String, String> = HashMap<String, String>()
//    var list:List<String> = ArrayList<String>()
//
    var names:List<String> = mutableListOf<String>("Jason", "Kurt","Logan", "Monique")
    var numbers:Set<Char> = mutableSetOf('1', '2', '3', '4', '5')
    var characters:Map<String, Int> = mutableMapOf(("One" to 1), ("Two" to 2), ("Three" to 3))

//    var locations:List<String> = listOf("Cubao", "Santolan", "Sh aw", "Boni", "Buendia")
//    var setPoints:Set<Int> = setOf(1, 2, 3, 4, 5)
//    var mapPoints:Map<String, Int> = mapOf(("One" to 1), ("Two" to 2), ("Three" to 3))

//    var arraylist:ArrayList<String> = names as ArrayList<String>
//    var linkedList: LinkedList<String> = names as LinkedList<String>

//
//    for(name in names){
//        logger.info {"Name: $name"}
//    }
//
//    for(index in 0 until names.size){
//        logger.info {"Name: ${names[index]}"}
//    }
//
//    for(index in names.indices){
//        logger.info {"Name [$index]: ${names[index]}"}
//    }
//
//    var iterator = names.iterator()
//
//    while(iterator.hasNext()){
//        logger.info {"Name: ${iterator.next()}"}
//    }
//
//    names.forEach {
//        logger.info { "Name: $it" }
//    }
//
//    names.forEachIndexed { index, name ->
//        logger.info {"Name [$index]. $name"}
//    }
//
//    var studentnames = names as ArrayList
//
//    studentnames.add("Noah")
//    studentnames.add(0, "Isaiah")
//    studentnames.add("Oakley")
//    studentnames.addAll(listOf("Patrick", "Quentine"))
//
//    var studentCount = studentnames.size
//
//    for(name in studentnames) {
//        logger.info { "Name: $name" }
//    }
//
//    studentnames.removeAt(1)
//    studentnames.remove("Oakley")
//
//    studentnames[0] = "Edited Entry"
//
//    studentnames.contains("Patrick")
//
//    for(name in studentnames){
//        logger.info { "Name: $name"}
//    }
//
//    for(number in numbers){
//        logger.info { "Number: $number"}
//    }

//    var numberSet = numbers as LinkedHashSet<Char>
//    numberSet.add('6')
//    // numberSet.clear() removes all numbers
//    for(number in numberSet){
//        logger.info{ "New Number: $number" }
//    }
//    var iterator = numberSet.iterator()
//    while(iterator.hasNext()){
//        logger.info{"Numbers: ${iterator.next()}"}
//    }

    var numberMap = characters as HashMap<String, Int>

    for(entry in numberMap.entries){
        logger.info {"Key: ${entry.key} -> Value: ${entry.value}"} //key is ID
    }

    for(value in numberMap.values){
        logger.info {"Value: $value"}
    }

    for(key in numberMap.keys){
        logger.info {"Value: $key"}
    }

    numberMap.put("Four", 4)
    numberMap["Five"] = 5


}