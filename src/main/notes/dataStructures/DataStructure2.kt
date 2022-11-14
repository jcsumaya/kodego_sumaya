import mu.KotlinLogging


private val logger = KotlinLogging.logger{}
fun main(){
    var rectangleDimensions = Array(4){Array(4){} }//width, height

    var xPosition = intArrayOf(1,2,3)
    var yPosition = intArrayOf(2,3,4)
    var position = arrayOf(xPosition, yPosition) //X,Y

    var location = Array(4){Array(4){} } //lat, long

//    for(xPositions in position){
//        for(xposition in xPositions){
//            logger.info{"Station : $xposition"}
//        }
//    }

    //two-dimensional array
    for(row in position.indices){
        for(column in position[row].indices){
            logger.info { "position : $row, $column = [${position[row][column]}]"}
        }
    }

    var threeDimensions = Array(4){Array(4){Array<String>(4){""}}}
}