package activity_05_d

data class Board(
    val snake: List<Snake>,
    val ladder: List<Ladder>,
    val player: List<Player>,
    var position: Position,
    val dice: Dice,
    var turn: Int = 0
)

open class Position{
    var initialPosition = 0
    var nextPosition = 0
    var finalPosition = 100
}

//ABSTRACTION
abstract class Snake {
    protected var position = Position()     //POLYMORPHISM
    fun slideDown(snake: Snake){}
}

abstract class Ladder {
    protected var position = Position()     //POLYMORPHISM
    fun moveUp(ladder: Ladder){}
}

class Dice {
    fun roll(): Int {
        return (1..6).random()
    }
}

//ABSTRACTION
abstract class GenerateGameBoard(board: Board){
    protected var size = Array<String>(100){""}

    abstract fun listPlayers(board: Board)

    abstract fun addSnakes(board: Board)

    abstract fun addLadders(board: Board)

}

               //INHERITANCE
class Player : Position() {
    var name = "Player 1"
        private set     //ENCAPSULATION
}