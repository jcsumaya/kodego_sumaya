package sampleProblems
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {
    var input = readln().split(" ")
    var max = ""
    for (i in input) {
        if (i.length > max.length) max = i
    }
    logger.info{max}
}