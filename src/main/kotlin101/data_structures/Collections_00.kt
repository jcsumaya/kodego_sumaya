package data_structures

fun main() {
    var listNames = ArrayList<String>()

    var mapName = HashMap<String, String>()
    var setName = HashSet<String>()

    mapName["first"] = "First"

    var mapTwo = mutableMapOf<String, String>()
    mapTwo["first"] = "First"


    var setTwo = mutableSetOf<String>()


    var names:List<String> = listOf<String>("Jason", "Kurt", "Logan", "Monique")
    var locations:List<String> = listOf("Cubao", "Santolan", "Shaw", "Boni", "Buendia")

    var studentnames = names as ArrayList

    studentnames.add("Noah")
    studentnames.add(0,"Isaiah")
    studentnames.addAll(listOf( "Patrick", "Quentine"))

    var studentCount = studentnames.size


}